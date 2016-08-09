package br.com.bara.application.web_service.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.bara.web_service.infraestrutura.domain.GenericDomain;

@Entity
@Table(name = "tbl_categoria_despesa")
public class CategoriaDespesa extends GenericDomain{

	private static final long serialVersionUID = -7144611495053813536L;
	
	@Column(name = "cd_descricao")
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
