package com.nmdang.Services;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.nmdang.DAO.Project_DAO;
import com.nmdang.DTO.Project_DTO;
import com.nmdang.DTO.User_DTO;


@Path("/project")
public class ProjectServices {

	@Path("/getprojectbyuser")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public void GetProjectByUser(
		
		@QueryParam ("user") User_DTO user
		) throws SQLException{
		try{
			ArrayList<Project_DTO>	listproject = new ArrayList<Project_DTO>();
			 listproject  = Project_DAO.GetListProjectByUser(user);
		}
		catch(Exception e){
			
		}
	}
		
		@Path("/getallproject")
		@GET
		@Produces(MediaType.TEXT_PLAIN)
		public void GetAllProject(
			
			
			) throws SQLException{
			try{
				ArrayList<Project_DTO>	listproject = new ArrayList<Project_DTO>();
				 listproject  = Project_DAO.GetListProject();
			}
			catch(Exception e){
				
			}
	
		}
		
		@Path("/addproject")
		@POST
		@Produces(MediaType.TEXT_PLAIN)
		public void AddProject(
			
			@QueryParam ("project") Project_DTO project
			) throws SQLException{
			try{
				
				 boolean result  = Project_DAO.AddProjectToUser(project);
			}
			catch(Exception e){
				
			}
		}
		
		@Path("/deleteproject")
		@DELETE
		@Produces(MediaType.TEXT_PLAIN)
		public void DeleteProject(
			
			@QueryParam ("project") Project_DTO project
			) throws SQLException{
			try{
				
				 boolean result  = Project_DAO.DeleteProjectToUser(project);
			}
			catch(Exception e){
				
			}
		}

		@Path("/updateproject")
		@PUT
		@Produces(MediaType.TEXT_PLAIN)
		public void UpdateProject(
			
			@QueryParam ("project") Project_DTO project
			) throws SQLException{
			try{
				
				 boolean result  = Project_DAO.UpdateProjectToUser(project);
			}
			catch(Exception e){
				
			}
		}
}
