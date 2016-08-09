package br.com.bara.application.web_service.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.bara.application.web_service.domain.Cliente;
import br.com.bara.application.web_service.repository.ClienteRepository;

@Service
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class ClienteBusinessImpl implements ClienteBusiness{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	private void salvarCliente(Cliente cliente){
		try {
			clienteRepository.save(cliente);
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage() + " in the "+getClass().getSimpleName());
		}
	}

	@Override
	public ResponseEntity<Void> consistirCliente(Cliente cliente) {
		try {
			if(cliente != null){
				salvarCliente(cliente);
				return new ResponseEntity<Void>(HttpStatus.OK);
			}else{
				return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);
			}
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage() + " in the "+getClass().getSimpleName());
		}
	}
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	private void removerCliente(Cliente cliente){
		try {
			clienteRepository.delete(cliente);
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage() + " in the "+getClass().getSimpleName());
		}
	}
	
	private Cliente procurarPeloId(Long id){
		try {
			return clienteRepository.findOne(id);
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage() + " in the "+getClass().getSimpleName());
		}
	}

	@Override
	public ResponseEntity<Cliente> consistirRemoverCliente(Long id) {
		try {
			Cliente cliente = procurarPeloId(id);
			if(cliente != null){
				removerCliente(cliente);
				return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
			}else{
				return new ResponseEntity<Cliente>(cliente, HttpStatus.NOT_FOUND);
			}
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage() + " in the "+getClass().getSimpleName());
		}
	}
	
	private List<Cliente> listarTodosClientes(){
		try {
			return clienteRepository.findAll();
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage() + " in the "+getClass().getSimpleName());
		}
	}

	@Override
	public ResponseEntity<List<Cliente>> consistirTodosClientes() {
		try {
			List<Cliente> clientes = listarTodosClientes();
			if(clientes.isEmpty()){
				return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.NO_CONTENT);
			}else{
				return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
			}
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage() + " in the "+getClass().getSimpleName());
		}
	}
	
	@Override
	public ResponseEntity<Cliente> consistirPorId(Long id) {
		try {
			Cliente cliente = procurarPeloId(id);
			if(cliente != null){
				return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
			}else{
				return new ResponseEntity<Cliente>(cliente, HttpStatus.NOT_FOUND);
			}
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage() + " in the "+getClass().getSimpleName());
		}
	}
}
