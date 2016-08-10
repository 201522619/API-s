package br.com.bara.application.web_service.type;

public enum ETipoRepeticao {
	
	UNICO("Único"), TODO_MES("Todo mês");

	private String tipoRepeticao;
	
	private ETipoRepeticao(String tipoRepeticao){
		this.tipoRepeticao = tipoRepeticao;
	}

	public String getTipoRepeticao() {
		return tipoRepeticao;
	}

	public void setTipoRepeticao(String tipoRepeticao) {
		this.tipoRepeticao = tipoRepeticao;
	}
	
	
	
}
