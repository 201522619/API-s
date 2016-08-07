package br.com.bara.application.web_service.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.bara.web_service.infraestrutura.domain.GenericDomain;

@Entity
@Table(name = "tbl_endereco")
public class Endereco extends GenericDomain{

	private static final long serialVersionUID = 1L;

	@Column(name = "end_tipo")
	private String tipo;
	
	@Column(name = "end_cep")
	private String cep;
	
	@Column(name = "end_logradouro")
	private String logradouro;
	
	@Column(name = "end_numero")
	private String numero;
	
	@Column(name = "end_complemento")
	private String complemento;
	
	@Column(name = "end_bairro")
	private String bairro;
	
	@Column(name = "end_cidade")
	private String cidade;

	@Column(name = "end_uf")
	private String uf;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cliente_id", nullable = false)
	private Cliente cliente;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
}
