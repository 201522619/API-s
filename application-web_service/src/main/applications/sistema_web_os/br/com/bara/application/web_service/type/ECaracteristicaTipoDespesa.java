package br.com.bara.application.web_service.type;

public enum ECaracteristicaTipoDespesa {

	DESPESA_COM_PRODUTO_OU_SERVICO("Despesa com Produto ou Serviço"), 
	APLICACAO_EM_INVESTIMENTOS("Aplicação em investimentos"), 
	TRANSFERENCIA_ENTRE_CONTAS("Transferência entre contas");
	
	private String tipoDespesa;
	
	private ECaracteristicaTipoDespesa(String tipoDespesa){
		this.tipoDespesa = tipoDespesa;
	}

	public String getTipoDespesa() {
		return tipoDespesa;
	}

	public void setTipoDespesa(String tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}
	
	

}
