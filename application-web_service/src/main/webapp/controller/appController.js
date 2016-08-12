/**
 * Developer Felipe Miguel dos Santos
 */
var app = angular.module('app', ['ngResource']);

app.factory('Conta', ['$resource', function ($resource){
	return $resource('http://localhost:8080/conta',
			{},//Parameters
			{
				update: {
					method: 'PUT'
				},
				get: {
					method: 'GET'
				}
			}
	);
}]);

//https://www.sitepoint.com/creating-crud-app-minutes-angulars-resource/

app.controller('appController', function (Conta){
	var self = this;
	self.title = "Controle pessoal";
	self.contas = Conta.query(function(){
		console.log(contas);
	});
});


