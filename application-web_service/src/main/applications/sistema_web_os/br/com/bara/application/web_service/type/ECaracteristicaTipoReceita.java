package br.com.bara.application.web_service.type;

public enum ECaracteristicaTipoReceita {
	
	RECEITAS_EM_GERAL("Receitas em geral"),
	TRANSFERENCIA_ENTRE_CONTAS("Transferência entre contas");
	
	private String tipoReceita;
	
	private ECaracteristicaTipoReceita(String tipoReceita){
		this.tipoReceita = tipoReceita;
	}

	public String getTipoReceita() {
		return tipoReceita;
	}

	public void setTipoReceita(String tipoReceita) {
		this.tipoReceita = tipoReceita;
	}

	
}
