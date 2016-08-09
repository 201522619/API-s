package br.com.bara.application.web_service.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import br.com.bara.application.web_service.type.ECaracteristicaTipoReceita;
import br.com.bara.web_service.infraestrutura.domain.GenericDomain;

@Entity
@Table(name = "tbl_tipo_receita")
public class TipoReceita extends GenericDomain{

	private static final long serialVersionUID = -8091428034152825544L;
	
	@Column(name = "tre_tipo_receita")
	private String tipoReceita;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tre_caract_tipo_receita")
	private ECaracteristicaTipoReceita caracteristicaTipoReceita;

	public String getTipoReceita() {
		return tipoReceita;
	}

	public void setTipoReceita(String tipoReceita) {
		this.tipoReceita = tipoReceita;
	}

	public ECaracteristicaTipoReceita getCaracteristicaTipoReceita() {
		return caracteristicaTipoReceita;
	}

	public void setCaracteristicaTipoReceita(
			ECaracteristicaTipoReceita caracteristicaTipoReceita) {
		this.caracteristicaTipoReceita = caracteristicaTipoReceita;
	}
	
	

}
