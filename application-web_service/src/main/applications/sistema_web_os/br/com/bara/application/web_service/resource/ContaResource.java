package br.com.bara.application.web_service.resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.bara.application.web_service.business.ContaBusiness;
import br.com.bara.application.web_service.domain.Conta;

@RestController
@RequestMapping(value = "conta")
public class ContaResource {
	
	private final String APPLICATION_JSON = MediaType.APPLICATION_JSON_UTF8_VALUE;
	
	@Autowired
	private ContaBusiness contaBusiness;
	
	@RequestMapping(method = RequestMethod.GET, produces = APPLICATION_JSON)
	public ResponseEntity<List<Conta>> listarTodasContas(){
		return contaBusiness.consistirTodasContas();
	}
	
	@RequestMapping(method = RequestMethod.POST, produces = APPLICATION_JSON)
	public ResponseEntity<Conta> salvarConta(@RequestBody Conta conta){
		return contaBusiness.consistirConta(conta);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET, produces = APPLICATION_JSON)
	public ResponseEntity<Conta> procurarContaPeloId(@PathVariable final Long id){
		return contaBusiness.consistirPorId(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, produces = APPLICATION_JSON)
	public ResponseEntity<Conta> editarConta(@RequestBody Conta conta){
		return contaBusiness.consistirConta(conta);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = APPLICATION_JSON)
	public ResponseEntity<Conta> deletarConta(@RequestBody @PathVariable final Long id){
		return contaBusiness.consistirRemoverConta(id);
	}

}
