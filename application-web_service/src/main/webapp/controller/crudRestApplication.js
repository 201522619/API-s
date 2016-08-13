'use strict'

/**
 * Developer Felipe Miguel dos Santos
 */

angular.module('application').factory('ClienteResource', function($resource){
	var factory = {
		obterClientes: $resource('http://localhost:8080/cliente', {},{
			todas: {method: 'GET', isArray: true}
		})	
	};
	return factory;
	
	//https://www.youtube.com/watch?v=hm2fkx5dgUw
});