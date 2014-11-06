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

import com.nmdang.DAO.Time_DAO;
import com.nmdang.DTO.Time_DTO;
import com.nmdang.DTO.User_DTO;


@Path("/time")
public class TimeServices {
	
	@Path("/gettimebyuser")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public void GetTimeByUser(
		
		@QueryParam ("user") User_DTO user
		) throws SQLException{
		try{
			ArrayList<Time_DTO>	listTime = new ArrayList<Time_DTO>();
			 listTime  = Time_DAO.GetListTimeByUser(user);
		}
		catch(Exception e){
			
		}
	}
		
		@Path("/getallTime")
		@GET
		@Produces(MediaType.TEXT_PLAIN)
		public void GetAllTime() throws SQLException{
			try{
				ArrayList<Time_DTO>	listTime = new ArrayList<Time_DTO>();
				 listTime  = Time_DAO.GetListTime();
			}
			catch(Exception e){
				
			}
	
		}
		
		@Path("/addTime")
		@POST
		@Produces(MediaType.TEXT_PLAIN)
		public void AddTime(
			
			@QueryParam ("Time") Time_DTO Time
			) throws SQLException{
			try{
				
				 boolean result  = Time_DAO.AddTimeToUser(Time);
			}
			catch(Exception e){
				
			}
		}
		
		@Path("/deleteTime")
		@DELETE
		@Produces(MediaType.TEXT_PLAIN)
		public void DeleteTime(
			
			@QueryParam ("Time") Time_DTO Time
			) throws SQLException{
			try{
				
				 boolean result  = Time_DAO.DeleteTimeToUser(Time);
			}
			catch(Exception e){
				
			}
		}

		@Path("/updateTime")
		@PUT
		@Produces(MediaType.TEXT_PLAIN)
		public void UpdateTime(
			
			@QueryParam ("Time") Time_DTO Time
			) throws SQLException{
			try{
				
				 boolean result  = Time_DAO.UpdateTimeToUser(Time);
			}
			catch(Exception e){
				
			}
		}

}
