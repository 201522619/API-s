package br.com.bara.application.web_service.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.bara.application.web_service.type.ETipoRepeticao;
import br.com.bara.web_service.infraestrutura.domain.GenericDomain;

@Entity
@Table(name = "tbl_movimento_despesa")
public class MovimentoDespesa extends GenericDomain {

	private static final long serialVersionUID = 2801075849911998982L;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tipo_despesa_id")
	private TipoDespesa tipoDespesa;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tipo_pagamento_id")
	private TipoPagamento tipoPagamento;

	@Column(name = "mov_despesa_valor")
	private BigDecimal valor;

	@Column(name = "mov_despesa_data_vencimento")
	private Date data_vencimento;

	@Column(name = "mov_despesa_data_pagamento")
	private Date data_pagamento;

	@Column(name = "mov_despesa_pago")
	private String pago;

	@Column(name = "mov_despesa_tipo_repeticao")
	@Enumerated(EnumType.STRING)
	private ETipoRepeticao tipoRepeticao;

	@Column(name = "mov_despesa_qtde_parcelas")
	private Long quantidade_parcelas;

	@Column(name = "mov_despesa_obs")
	private String obs;

	//Não, Sim, Sim avise-me por email
	@Column(name = "mov_despesa_importante")
	private String importante;

	public TipoDespesa getTipoDespesa() {
		return tipoDespesa;
	}

	public void setTipoDespesa(TipoDespesa tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Date getData_vencimento() {
		return data_vencimento;
	}

	public void setData_vencimento(Date data_vencimento) {
		this.data_vencimento = data_vencimento;
	}

	public Date getData_pagamento() {
		return data_pagamento;
	}

	public void setData_pagamento(Date data_pagamento) {
		this.data_pagamento = data_pagamento;
	}

	public Long getQuantidade_parcelas() {
		return quantidade_parcelas;
	}

	public void setQuantidade_parcelas(Long quantidade_parcelas) {
		this.quantidade_parcelas = quantidade_parcelas;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getImportante() {
		return importante;
	}

	public void setImportante(String importante) {
		this.importante = importante;
	}

	public String getPago() {
		return pago;
	}

	public void setPago(String pago) {
		this.pago = pago;
	}

	public ETipoRepeticao getTipoRepeticao() {
		return tipoRepeticao;
	}

	public void setTipoRepeticao(ETipoRepeticao tipoRepeticao) {
		this.tipoRepeticao = tipoRepeticao;
	}
	
	

}
