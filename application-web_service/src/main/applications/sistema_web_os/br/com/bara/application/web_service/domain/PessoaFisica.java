package br.com.bara.application.web_service.domain;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.bara.application.web_service.type.ESexo;

@Entity
@Table(name = "tbl_pessoa_fisica")
public class PessoaFisica implements Serializable {

	private static final long serialVersionUID = -7465397976308365514L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "pf_cpf")
	private String cpf;

	@Column(name = "pf_identidade")
	private String identidade;

	@Column(name = "pf_data_nascimento")
	private Date dataNascimento;

	@Enumerated(EnumType.STRING)
	@Column(name = "pf_sexo")
	private ESexo sexo;

	@Column(name = "pf_apelido")
	private String apelido;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	public ESexo getSexo() {
		return sexo;
	}

	public void setSexo(ESexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", identidade=" + identidade + ", dataNascimento=" + dataNascimento
				+ ", sexo=" + sexo + ", apelido=" + apelido + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
