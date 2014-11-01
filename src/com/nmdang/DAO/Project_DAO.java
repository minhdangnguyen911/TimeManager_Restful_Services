package com.nmdang.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.nmdang.DBHelper.DatabaseHelper;
import com.nmdang.DTO.Project_DTO;
import com.nmdang.DTO.User_DTO;


public class Project_DAO {
	
	public static ArrayList<Project_DTO> GetListProjectByUser(User_DTO user) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con = null;
		ArrayList<Project_DTO> projectofuser = new ArrayList<Project_DTO>();
	        
	        try{
	            DatabaseHelper helper = new DatabaseHelper();
	            con = helper.CreateConnection();
	            String sql = "SELECT * FROM Time WHERE user = ? ";
	            PreparedStatement sm = (PreparedStatement) con.prepareStatement(sql) ;
	            
	            sm.setInt(1, user.get_userID());
	            
	            ResultSet rs = sm.executeQuery();
	            		
	            while(rs.next()){
	            	Project_DTO project = new Project_DTO();
	               project.set_projectId(rs.getInt("ProjectId"));
	               project.set_projectName(rs.getString("ProjectName"));
	               project.set_projectDescription(rs.getString("ProjectDescription"));
	               project.set_projectColor(rs.getString("ProjectCorlor"));
	             
	               projectofuser.add(project);
	            }
	            con.close();
	        }catch(Exception e){
	        	con.close();
	        }
			return projectofuser;
	        
	}
	
	public static ArrayList<Project_DTO> GetListProject() throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con = null;
		ArrayList<Project_DTO> projectofuser = new ArrayList<Project_DTO>();
	        
	        try{
	            DatabaseHelper helper = new DatabaseHelper();
	            con = helper.CreateConnection();
	            String sql = "SELECT * FROM Time  WHERE 1";
	            PreparedStatement sm = (PreparedStatement) con.prepareStatement(sql) ;
	            
	            
	            
	            ResultSet rs = sm.executeQuery();
	            		
	            while(rs.next()){
	            	Project_DTO project = new Project_DTO();
		               project.set_projectId(rs.getInt("ProjectId"));
		               project.set_projectName(rs.getString("ProjectName"));
		               project.set_projectDescription(rs.getString("ProjectDescription"));
		               project.set_projectColor(rs.getString("ProjectCorlor"));
		             
		               projectofuser.add(project);
	             
	            }
	            con.close();
	        }catch(Exception e){
	        	con.close();
	        }
			return projectofuser;
	        
	}
	
	public static boolean AddProjectToUser(Project_DTO project) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con = null;
		
	        
	        try{
	            DatabaseHelper helper = new DatabaseHelper();
	            con = helper.CreateConnection();
	            String sql = "INSERT INTO Project( ProjectId, ProjectName, ProjectDescription,ProjectCorlor) Values(?,?,?,?)";
	            PreparedStatement sm = (PreparedStatement) con.prepareStatement(sql) ;
	            
	            sm.setInt(1, project.get_projectId());
	            sm.setString(2,project.get_projectName() );
	            sm.setString(3, project.get_projectDescription());
	            sm.setString(4,project.get_projectColor() );
	            
	            ResultSet rs = sm.executeQuery();
	            		
	            
	            con.close();
	            return true;
	            
	        }catch(Exception e){
	        	con.close();
	        	return false;
	        }
			
	}

	public static boolean DeleteProjectToUser(Project_DTO project) throws SQLException {// chưa xong , sửa lại sql
		// TODO Auto-generated method stub
		
		Connection con = null;
		
	        
	        try{
	            DatabaseHelper helper = new DatabaseHelper();
	            con = helper.CreateConnection();
	            String sql = "DELETE FROM Project WHERE ProjectId = ?";
	            PreparedStatement sm = (PreparedStatement) con.prepareStatement(sql) ;
	            
	            sm.setInt(1, project.get_projectId());
	           
	            
	            ResultSet rs = sm.executeQuery();
	            		
	            
	            con.close();
	            return true;
	            
	        }catch(Exception e){
	        	con.close();
	        	return false;
	        }
			
	}

}
