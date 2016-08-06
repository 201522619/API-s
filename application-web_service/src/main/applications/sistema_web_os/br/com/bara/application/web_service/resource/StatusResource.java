package br.com.bara.application.web_service.resource;


import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

@Path("status")
@Service
public class StatusResource {

	/*@Autowired
	private StatusRepository statusDao;*/
	
	/*@GET
	@Path("/{statusID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Status getStatusForID(@PathParam("statusID") String statusID){
		return this.statusDao.findOne(Long.parseLong(statusID));
	}
	
	@GET
	@Path("/")
	@Produces("application/json")
	public String getListStatus(){
		return new Gson().toJson(this.statusDao.findAll());
	}
	
	@POST
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String salvarStatus(Status status){
		return new Gson().toJson(this.statusDao.save(status));
	}
	
	@PUT
	@Path("/{statusID}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String editarStatus(Status status){
		return new Gson().toJson(this.statusDao.save(status));
	}
	
	@DELETE
	@Path("/{statusID}")
	public Response deleteStatus(@PathParam("statusID") String statusID) throws URISyntaxException{
	     this.statusDao.delete(Long.parseLong(statusID));
	     return Response.status(200).entity("Status com " + statusID + " foi removido com sucesso!").build();
	}*/
	
	
	
}
