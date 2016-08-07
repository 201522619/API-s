package br.com.bara.application.web_service.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.bara.web_service.infraestrutura.domain.GenericDomain;

@Entity
@Table(name = "tbl_contato")
public class Contato extends GenericDomain{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "contato_tipo")
	private String tipo;
	
	@Column(name = "contato_nome")
	private String nome;
	
	@Column(name = "contato_contato")
	private String contato;
	
	@Column(name = "contato_cargo")
	private String cargo;
	
	@Column(name = "contato_obs")
	private String obs;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}
	

}
