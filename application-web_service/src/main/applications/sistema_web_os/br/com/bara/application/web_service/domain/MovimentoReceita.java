package br.com.bara.application.web_service.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import br.com.bara.application.web_service.type.ETipoRepeticao;
import br.com.bara.web_service.infraestrutura.domain.GenericDomain;

@Entity
@Table(name = "tbl_movimento_receita")
public class MovimentoReceita extends GenericDomain{

	private static final long serialVersionUID = -46455698894729473L;
	
	@OneToOne(fetch = FetchType.EAGER)
	@Column(name = "mov_receita_tipo_receita")
	private TipoReceita tipoReceita;
	
	@OneToOne(fetch = FetchType.EAGER)
	@Column(name = "mov_receita_tipo_recebimento")
	private TipoRecebimento tipoRecebimento;
	
	@Column(name = "mov_receita_valor")
	private BigDecimal valor;
	
	@Column(name = "mov_receita_data_vencimento")
	private Date dataVencimento;
	
	@Column(name = "mov_receita_data_recebimento")
	private Date dataRecebimento;
	
	@Column(name = "mov_receita_recebido")
	private String recebido;

	@Enumerated(EnumType.STRING)
	@Column(name = "mov_receita_tipo_repeticao")
	private ETipoRepeticao tipoRepeticao;
	
	@Column(name = "mov_receita_obs")
	private String obs;

	public TipoReceita getTipoReceita() {
		return tipoReceita;
	}

	public void setTipoReceita(TipoReceita tipoReceita) {
		this.tipoReceita = tipoReceita;
	}

	public TipoRecebimento getTipoRecebimento() {
		return tipoRecebimento;
	}

	public void setTipoRecebimento(TipoRecebimento tipoRecebimento) {
		this.tipoRecebimento = tipoRecebimento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(Date dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	public String getRecebido() {
		return recebido;
	}

	public void setRecebido(String recebido) {
		this.recebido = recebido;
	}

	public ETipoRepeticao getTipoRepeticao() {
		return tipoRepeticao;
	}

	public void setTipoRepeticao(ETipoRepeticao tipoRepeticao) {
		this.tipoRepeticao = tipoRepeticao;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}
	
}
