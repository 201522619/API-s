package br.com.bara.application.web_service.client;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;



import br.com.bara.application.web_service.domain.Conta;

import com.google.gson.Gson;

public class StatusClient {
	
	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/application-web_service/root/conta/{statusID}").resolveTemplate("statusID", 1);
		String json = target.request().get(String.class);
		Gson gson = new Gson();
		Conta[] status = gson.fromJson(json, Conta[].class);
		List<Conta> list = Arrays.asList(status);
		for(Conta s : list){
			System.out.println(s.getNome());
		}
		
	}

}
