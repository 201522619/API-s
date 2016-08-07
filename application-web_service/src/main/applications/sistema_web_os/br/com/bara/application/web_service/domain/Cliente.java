package br.com.bara.application.web_service.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.bara.web_service.infraestrutura.domain.GenericDomain;

@Entity
@Table(name = "tbl_cliente")
public class Cliente extends GenericDomain {

	private static final long serialVersionUID = 1L;

	@Column(name = "cli_tipo")
	private String tipoCliente;

	@Column(name = "cli_situacao")
	private String situacao;

	@Column(name = "cli_nome")
	private String nome;

	@Column(name = "cli_email")
	private String email;

	@Column(name = "cli_cpf")
	private String cpf;

	@Column(name = "cli_rg")
	private String rg;

	@Column(name = "cli_data_nascimento")
	private Date dataNascimento;

	@Column(name = "cli_telefone_comercial")
	private String telefoneComercial;

	@Column(name = "cli_telefone_celular")
	private String telefoneCelular;

	@Column(name = "cli_fax")
	private String fax;

	@Column(name = "cli_site")
	private String site;

	private String obs;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cliente", targetEntity = Contato.class)
	private List<Contato> contatos;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cliente", targetEntity = Endereco.class)
	private List<Endereco> enderecos;

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

}
