package br.com.bara.application.web_service.resource;

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
