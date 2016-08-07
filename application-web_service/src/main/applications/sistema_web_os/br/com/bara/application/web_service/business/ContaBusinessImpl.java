package br.com.bara.application.web_service.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.bara.application.web_service.domain.Conta;
import br.com.bara.application.web_service.repository.ContaRepository;

@Service
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class ContaBusinessImpl implements ContaBusiness{
	
	@Autowired
	private ContaRepository contaRepository;
	
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ResponseEntity<Conta> consistirConta(Conta conta){
		try {
			if(conta != null){
				contaRepository.save(conta);
				return new ResponseEntity<Conta>(HttpStatus.OK);
			}else{
				throw new RuntimeException("Conta is null in "+getClass().getSimpleName());
			}
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage()+" in " + getClass().getSimpleName());
		}
		
	}
	
	private List<Conta> findAll(){
		try {
			return (List<Conta>) contaRepository.findAll();
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage()+" in " + getClass().getSimpleName());
		}
	}
	
	@Override
	public ResponseEntity<List<Conta>> consistirTodasContas(){
		List<Conta> contas = findAll();
		if(contas.isEmpty()){
			return new ResponseEntity<List<Conta>>(HttpStatus.NO_CONTENT);
		}else{
			return new ResponseEntity<List<Conta>>(contas, HttpStatus.OK);
		}
	}
	
	private Conta findOne(Long id){
		try {
			return contaRepository.findOne(id);
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage()+" in " + getClass().getSimpleName());
		}
	}
	
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ResponseEntity<Conta> consistirRemoverConta(Long id){
		try {
			Conta conta = contaRepository.findOne(id);
			if(conta == null){
				return new ResponseEntity<Conta>(HttpStatus.NOT_FOUND);
			}else{
				contaRepository.delete(conta);
				return new ResponseEntity<Conta>(conta, HttpStatus.OK);
			}
		} catch (RuntimeException e) {
			throw new RuntimeException(e.getMessage()+" in " + getClass().getSimpleName());
		}
	}


	@Override
	public ResponseEntity<Conta> consistirPorId(Long id) {
		Conta conta = findOne(id);
		if(conta == null){
			return new ResponseEntity<Conta>(HttpStatus.NOT_FOUND);
		}else{
			return new ResponseEntity<Conta>(conta, HttpStatus.OK);
		}
	}

}
