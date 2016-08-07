package br.com.bara.application.web_service.business;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.com.bara.application.web_service.domain.Conta;

public interface ContaBusiness {
	
	ResponseEntity<Conta> consistirConta(Conta conta);
	
	List<Conta> findAll();
	
	Conta findOne(Long id);
	
	ResponseEntity<Conta> consistirRemoverConta(Long id);
	
	ResponseEntity<List<Conta>> consistirTodasContas(List<Conta> contas);
	
	ResponseEntity<Conta> consistirPorId(Conta conta);
	
}
