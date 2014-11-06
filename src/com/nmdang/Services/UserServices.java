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

import com.nmdang.DAO.User_DAO;
import com.nmdang.DTO.User_DTO;


@Path("/user")
public class UserServices {

	
	
		
		@Path("/getallUser")
		@GET
		@Produces(MediaType.TEXT_PLAIN)
		public void GetAllUser(
			
			
			) throws SQLException{
			try{
				ArrayList<User_DTO>	listUser = new ArrayList<User_DTO>();
				 listUser  = User_DAO.GetListUser();
			}
			catch(Exception e){
				
			}
	
		}
		
		@Path("/addUser")
		@POST
		@Produces(MediaType.TEXT_PLAIN)
		public void AddUser(
			
			@QueryParam ("User") User_DTO User
			) throws SQLException{
			try{
				
				 boolean result  = User_DAO.AddUser(User);
			}
			catch(Exception e){
				
			}
		}
		
		@Path("/deleteUser")
		@DELETE
		@Produces(MediaType.TEXT_PLAIN)
		public void DeleteUser(
			
			@QueryParam ("User") User_DTO User
			) throws SQLException{
			try{
				
				 boolean result  = User_DAO.DeleteUser(User);
			}
			catch(Exception e){
				
			}
		}

		@Path("/updateUser")
		@PUT
		@Produces(MediaType.TEXT_PLAIN)
		public void UpdateUser(
			
			@QueryParam ("User") User_DTO User
			) throws SQLException{
			try{
				
				 boolean result  = User_DAO.UpdateUser(User);
			}
			catch(Exception e){
				
			}
		}
}
