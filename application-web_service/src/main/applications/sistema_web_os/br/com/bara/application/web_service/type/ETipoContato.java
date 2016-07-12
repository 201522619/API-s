package br.com.bara.application.web_service.type;

public enum ETipoContato {
	
	TELEFONE("Telefone"), EMAIL("E-mail");
	
	private String tipoContato;
	
	private ETipoContato(String tipoContato){
		this.tipoContato = tipoContato;
	}
	
	public String getTipoContato() {
		return tipoContato;
	}

}
