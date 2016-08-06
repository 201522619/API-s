package br.com.bara.application.web_service.client;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;


import com.google.gson.Gson;

public class StatusClient {
	
	/*public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/application-web_service/root/status/{statusID}").resolveTemplate("statusID", 2);
		String json = target.request().get(String.class);
		Gson gson = new Gson();
		Status[] status = gson.fromJson(json, Status[].class);
		List<Status> list = Arrays.asList(status);
		for(Status s : list){
			System.out.println(s.getDescricao());
		}
		
	}*/

}
