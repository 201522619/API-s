package br.com.bara.application.web_service.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import com.google.gson.Gson;

public class StatusClient {
	
	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/application-web_service/root/status/get/listarTodosStatus");
		String json = target.request().get(String.class);
		Gson gson = new Gson();
		
	}

}
