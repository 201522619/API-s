package br.com.bara.application.web_service.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.bara.application.web_service.business.ClienteBusiness;
import br.com.bara.application.web_service.domain.Cliente;

@RestController
@RequestMapping(value = "cliente")
public class ClienteResource {
	
	private static final String APLICATION_JSON = MediaType.APPLICATION_JSON_VALUE;
	
	@Autowired
	private ClienteBusiness clienteBusiness;
	
	@RequestMapping(method = RequestMethod.GET, produces = APLICATION_JSON)
	public ResponseEntity<List<Cliente>> listarTodosClientes(){
		return clienteBusiness.consistirTodosClientes();
	}
	
	@RequestMapping(method = RequestMethod.POST, produces = APLICATION_JSON)
	public ResponseEntity<Void> salvarCliente(@RequestBody @Valid Cliente cliente){
		return clienteBusiness.consistirCliente(cliente);
	}
	
	@RequestMapping(method = RequestMethod.PUT, produces = APLICATION_JSON)
	public ResponseEntity<Void> editarCliente(Cliente cliente){
		return clienteBusiness.consistirCliente(cliente);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = APLICATION_JSON)
	public ResponseEntity<Cliente> excluirCliente(@PathVariable final Long id){
		return clienteBusiness.consistirRemoverCliente(id);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET, produces = APLICATION_JSON)
	public ResponseEntity<Cliente> procurarClientePeloId(@PathVariable final Long id){
		return clienteBusiness.consistirPorId(id);
	}

}
