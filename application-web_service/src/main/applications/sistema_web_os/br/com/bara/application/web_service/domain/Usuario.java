package br.com.bara.application.web_service.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.bara.web_service.infraestrutura.domain.GenericDomain;

@Entity
@Table(name = "tbl_usuario")
public class Usuario extends GenericDomain{

	private static final long serialVersionUID = 1L;

	@Column(name = "usu_nome")
	private String nome;
	
	@Column(name = "usu_cpf")
	private String cpf;
	
	@Column(name = "usu_rg")
	private String rg;
	
	@Column(name = "usu_data_nascimento")
	private String dataNascimento;
	
	@Column(name = "usu_sexo")
	private String sexo;
	
	@Column(name = "usu_email")
	private String email;
	
	@Column(name = "usu_senha")
	private String senha;
	
	@Column(name = "usu_foto")
	private String foto;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
}
