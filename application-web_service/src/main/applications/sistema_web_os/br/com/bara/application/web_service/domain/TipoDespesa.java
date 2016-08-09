package br.com.bara.application.web_service.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.bara.application.web_service.type.ECaracteristicaTipoDespesa;
import br.com.bara.web_service.infraestrutura.domain.GenericDomain;

@Entity
@Table(name = "tbl_tipo_despesa")
public class TipoDespesa extends GenericDomain{

	private static final long serialVersionUID = -548815903860637477L;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "categoria_despesa_id")
	private CategoriaDespesa categoriaDespesa;
	
	@Column(name = "tp_despesa")
	private String tipoDespesa;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tp_caract_tipo_desp")
	private ECaracteristicaTipoDespesa caracteristicaTipoDespesa;

	public CategoriaDespesa getCategoriaDespesa() {
		return categoriaDespesa;
	}

	public void setCategoriaDespesa(CategoriaDespesa categoriaDespesa) {
		this.categoriaDespesa = categoriaDespesa;
	}

	public String getTipoDespesa() {
		return tipoDespesa;
	}

	public void setTipoDespesa(String tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}

	public ECaracteristicaTipoDespesa getCaracteristicaTipoDespesa() {
		return caracteristicaTipoDespesa;
	}

	public void setCaracteristicaTipoDespesa(
			ECaracteristicaTipoDespesa caracteristicaTipoDespesa) {
		this.caracteristicaTipoDespesa = caracteristicaTipoDespesa;
	}
	
	
	
}
