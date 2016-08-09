package br.com.bara.application.web_service.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.bara.application.web_service.business.ContatoBusiness;
import br.com.bara.application.web_service.domain.Contato;

@RestController
@RequestMapping(value = "contato")
public class ContatoResource {
	
	private final String APLICATION_JSON = MediaType.APPLICATION_JSON_VALUE;
	
	@Autowired
	private ContatoBusiness contatoBusiness;
	
	@RequestMapping(method = RequestMethod.GET, produces = APLICATION_JSON)
	public ResponseEntity<List<Contato>> listarTodosContatos(){
		return contatoBusiness.consistirTodosContatos();
	}

}
