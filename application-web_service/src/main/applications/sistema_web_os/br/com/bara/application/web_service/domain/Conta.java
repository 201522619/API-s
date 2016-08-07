package br.com.bara.application.web_service.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.bara.web_service.infraestrutura.domain.GenericDomain;

@Entity
@Table(name = "tbl_conta")
public class Conta extends GenericDomain{

	private static final long serialVersionUID = -1820884713525972285L;
	
	@Column(name = "cont_status")
	private String status;
	
	@Column(name = "cont_tipo_conta")
	private String tipoConta;
	
	@Column(name = "cont_nome")
	private String nome;
	
	@Column(name = "cont_saldo_inicial")
	private BigDecimal saldoInicial;
	
	@Column(name = "cont_data_inicial")
	private Date dataInicial;
	
	//Informações adicionais para o usuário
	@Column(name = "cont_codigo_banco")
	private String codigoBanco;
	
	@Column(name = "cont_agencia")
	private String agencia;
	
	@Column(name = "cont_conta")
	private String conta;
	
	@Column(name = "cont_valor_limite")
	private BigDecimal valorLimite;
	
	@Column(name = "cont_contato")
	private String contato;
	
	@Column(name = "cont_telefone")
	private String telefone;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(BigDecimal saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public String getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(String codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public BigDecimal getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(BigDecimal valorLimite) {
		this.valorLimite = valorLimite;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Conta [status=" + status + ", tipoConta=" + tipoConta
				+ ", nome=" + nome + ", saldoInicial=" + saldoInicial
				+ ", dataInicial=" + dataInicial + ", codigoBanco="
				+ codigoBanco + ", agencia=" + agencia + ", conta=" + conta
				+ ", valorLimite=" + valorLimite + ", contato=" + contato
				+ ", telefone=" + telefone + "]";
	}
	
	

}
