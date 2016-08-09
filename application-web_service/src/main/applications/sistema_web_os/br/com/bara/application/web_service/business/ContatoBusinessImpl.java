package br.com.bara.application.web_service.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.bara.application.web_service.domain.Contato;
import br.com.bara.application.web_service.repository.ContatoRepository;

@Service
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class ContatoBusinessImpl implements ContatoBusiness{
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	private void salvarContato(Contato contato){
		try {
			contatoRepository.save(contato);
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage() + " in the "+getClass().getSimpleName());
		}
	}

	@Override
	public ResponseEntity<Contato> consistirContato(Contato contato) {
		try {
			if(contato != null){
				salvarContato(contato);
				return new ResponseEntity<Contato>(contato, HttpStatus.OK);
			}else{
				return new ResponseEntity<Contato>(contato, HttpStatus.NOT_ACCEPTABLE);
			}
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage() + " in the "+getClass().getSimpleName());
		}
	}
	
	private void removerContato(Contato contato){
		try {
			contatoRepository.delete(contato);
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage() + " in the "+getClass().getSimpleName());
		}
	}

	@Override
	public ResponseEntity<Contato> consistirRemoverContato(Long id) {
		try {
			Contato contato = procurarContatoPeloId(id);
			if(contato != null){
				removerContato(contato);
				return new ResponseEntity<Contato>(contato, HttpStatus.OK);
			}else{
				return new ResponseEntity<Contato>(contato, HttpStatus.NOT_FOUND);
			}
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage() + " in the "+getClass().getSimpleName());
		}
	}
	
	private List<Contato> listarTodosContatos(){
		try {
			return contatoRepository.findAll();
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage() + " in the "+getClass().getSimpleName());
		}
	}

	@Override
	public ResponseEntity<List<Contato>> consistirTodosContatos() {
		try {
			List<Contato> contatos = listarTodosContatos();
			if(contatos.isEmpty()){
				return new ResponseEntity<List<Contato>>(contatos, HttpStatus.NO_CONTENT);
			}else{
				return new ResponseEntity<List<Contato>>(contatos, HttpStatus.OK);
			}
		}catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage() + " in the "+getClass().getSimpleName());
		}
	}
	
	private Contato procurarContatoPeloId(Long id){
		try {
			return contatoRepository.findOne(id);
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage() + " in the "+getClass().getSimpleName());
		}
	}

	@Override
	public ResponseEntity<Contato> consistirContatoPorId(Long id) {
		try {
			Contato contato = procurarContatoPeloId(id);
			if(contato != null){
				return new ResponseEntity<Contato>(contato, HttpStatus.OK);
			}else{
				return new ResponseEntity<Contato>(contato, HttpStatus.NOT_FOUND);
			}
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage() + " in the "+getClass().getSimpleName());
		}
	}

}
