package br.com.bara.application.web_service.business;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.com.bara.application.web_service.domain.Conta;

public interface ContaBusiness {
	
	ResponseEntity<Conta> consistirConta(Conta conta);
	
	ResponseEntity<Conta> consistirRemoverConta(Long id);
	
	ResponseEntity<List<Conta>> consistirTodasContas();
	
	ResponseEntity<Conta> consistirPorId(Long id);
	
}
