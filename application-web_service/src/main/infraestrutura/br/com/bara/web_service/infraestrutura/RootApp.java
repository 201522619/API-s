package br.com.bara.web_service.infraestrutura;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.com.bara.application.web_service.resource.StatusResource;

@ApplicationPath("root")
public class RootApp extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<Class<?>>();
		addRestResourceClasses(resources);
		return resources;
	}
	
	public void addRestResourceClasses(Set<Class<?>> resources){
		resources.add(StatusResource.class);
		//Adicionar aqui as outras classes de resource.
	}
	
	

}
