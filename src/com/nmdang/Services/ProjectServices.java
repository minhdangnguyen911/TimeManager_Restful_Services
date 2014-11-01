package com.nmdang.Services;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nmdang.DAO.Project_DAO;


@Path("project")
public class ProjectServices {

	@Path("/getprojectbyuserid")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public void GetProjectByUserID(
		
		@QueryParam ("userid") String userid
		){
	boolean result = Project_DAO.GetListProjectByUser(user);
	
		
}
}
