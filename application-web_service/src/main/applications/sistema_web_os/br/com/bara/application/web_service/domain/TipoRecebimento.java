package br.com.bara.application.web_service.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.bara.web_service.infraestrutura.domain.GenericDomain;

@Entity
@Table(name = "tbl_tipo_recebimento")
public class TipoRecebimento extends GenericDomain{
	
	private static final long serialVersionUID = 2252513862654977467L;
	
	@Column(name = "trec_tipo_recebimento")
	private String tipoRecebimento;

	public String getTipoRecebimento() {
		return tipoRecebimento;
	}

	public void setTipoRecebimento(String tipoRecebimento) {
		this.tipoRecebimento = tipoRecebimento;
	}
	
	

}
