/**
 * Developer Felipe Miguel dos Santos
 */
angular.module('application').controller('controller', function(ClienteResource){
	var self = this;
	self.title = "Controle pessoal";
	self.clientes = ClienteResource.obterClientes.todas();
});
