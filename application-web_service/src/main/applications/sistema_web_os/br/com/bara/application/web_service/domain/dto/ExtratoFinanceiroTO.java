package br.com.bara.application.web_service.domain.dto;

import java.math.BigDecimal;
import java.util.Date;

public class ExtratoFinanceiroTO {
	
	private String lancamento;
	
	private String tipo;
	
	private Date dataVencimento;
	
	private String tipoPagRec;
	
	private String realizado;
	
	private Date dataRealizado;
	
	private String parcela;
	
	private BigDecimal valor;

	public String getLancamento() {
		return lancamento;
	}

	public void setLancamento(String lancamento) {
		this.lancamento = lancamento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getTipoPagRec() {
		return tipoPagRec;
	}

	public void setTipoPagRec(String tipoPagRec) {
		this.tipoPagRec = tipoPagRec;
	}

	public String getRealizado() {
		return realizado;
	}

	public void setRealizado(String realizado) {
		this.realizado = realizado;
	}

	public Date getDataRealizado() {
		return dataRealizado;
	}

	public void setDataRealizado(Date dataRealizado) {
		this.dataRealizado = dataRealizado;
	}

	public String getParcela() {
		return parcela;
	}

	public void setParcela(String parcela) {
		this.parcela = parcela;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	

}
