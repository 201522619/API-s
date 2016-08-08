package br.com.bara.application.web_service.business;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.com.bara.application.web_service.domain.Cliente;

public interface ClienteBusiness {
	
	ResponseEntity<Void> consistirCliente(Cliente cliente);
	
	ResponseEntity<Cliente> consistirRemoverCliente(Long id);
	
	ResponseEntity<List<Cliente>> consistirTodosClientes();
	
	ResponseEntity<Cliente> consistirPorId(Long id);

}
