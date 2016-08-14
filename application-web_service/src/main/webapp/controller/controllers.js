/**
 * Developer Felipe Miguel dos Santos
 */
angular.module('application').controller('controller', function(ClienteResource){
	var self = this;
	self.title = "Controle pessoal";
	
	self.clientes = ClienteResource.listarTodosClientes.clientes();
	
	self.salvar = function (cliente){
		ClienteResource.salvar.save(cliente);
		self.clientes = ClienteResource.listarTodosClientes.clientes();
	}
	
	self.editar = function (cliente){
	}
});
