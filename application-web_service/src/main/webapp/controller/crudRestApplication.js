'use strict'

/**
 * Developer Felipe Miguel dos Santos
 */

//https://www.youtube.com/watch?v=hm2fkx5dgUw

//https://dzone.com/articles/spring-rest-controller

angular.module('application').factory('ClienteResource', function($resource){
	var factory = {
		listarTodosClientes: $resource('http://localhost:8080/cliente', {},{
			clientes: {method: 'GET', isArray: true}
		}),
		
		salvar: $resource('http://localhost:8080/cliente'),
		editar: $resource('http://localhost:8080/cliente/:id', {id: '@id'})
	};
	return factory;
	
	
});