package br.com.bara.application.web_service.business;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.com.bara.application.web_service.domain.Contato;

public interface ContatoBusiness {

	ResponseEntity<Contato> consistirContato(Contato contato);

	ResponseEntity<Contato> consistirRemoverContato(Long id);

	ResponseEntity<List<Contato>> consistirTodosContatos();

	ResponseEntity<Contato> consistirContatoPorId(Long id);

}
