package com.nmdang.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.nmdang.DBHelper.DatabaseHelper;
import com.nmdang.DTO.Project_DTO;
import com.nmdang.DTO.Time_DTO;
import com.nmdang.DTO.User_DTO;

public class User_DAO {
	
	public static ArrayList<User_DTO> GetListUser() throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con = null;
		ArrayList<User_DTO> listuser = new ArrayList<User_DTO>();
	        
	        try{
	            DatabaseHelper helper = new DatabaseHelper();
	            con = helper.CreateConnection();
	            String sql = "SELECT * FROM user  WHERE 1";
	            PreparedStatement sm = (PreparedStatement) con.prepareStatement(sql) ;
	            
	            
	            
	            ResultSet rs = sm.executeQuery();
	            		
	            while(rs.next()){
	            	User_DTO user = new User_DTO();
		            user.set_userID(rs.getInt("UserId"));
		            user.set_userName(rs.getString("UserName"));
		            user.set_userFullname(rs.getString("UserFullname"));
		            user.set_userPass(rs.getString("UserPass"));
		            user.set_userPhone(rs.getString("UserPhone"));
		            user.set_userMail(rs.getString("UserMail"));
		            listuser.add(user);
	             
	            }
	            con.close();
	        }catch(Exception e){
	        	con.close();
	        }
			return listuser;
	        
	}
	
	public static boolean AddUser(User_DTO user) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con = null;
		
	        
	        try{
	            DatabaseHelper helper = new DatabaseHelper();
	            con = helper.CreateConnection();
	            String sql = "INSERT INTO User( UserId, UserName,UserPass, UserFullname,UserPhone,UserMail) Values(?,?,?,?,?,?)";
	            PreparedStatement sm = (PreparedStatement) con.prepareStatement(sql) ;
	            
	            sm.setInt(1, user.get_userID());
	            sm.setString(2, user.get_userName());
	            sm.setString(3, user.get_userPass());
	            sm.setString(4, user.get_userFullname());
	            sm.setString(5, user.get_userPhone());
	            sm.setString(4, user.get_userMail());
	            
	            ResultSet rs = sm.executeQuery();
	            		
	            
	            con.close();
	            return true;
	            
	        }catch(Exception e){
	        	con.close();
	        	return false;
	        }
			
	}

	public static boolean DeleteUser(User_DTO user) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con = null;
		
	        
	        try{
	            DatabaseHelper helper = new DatabaseHelper();
	            con = helper.CreateConnection();
	            String sql = "DELETE FROM User WHERE UserId = ? ";
	            PreparedStatement sm = (PreparedStatement) con.prepareStatement(sql) ;
	            
	            sm.setInt(1, user.get_userID());
	            
	            
	            
	            ResultSet rs = sm.executeQuery();
	            		
	            
	            con.close();
	            return true;
	            
	        }catch(Exception e){
	        	con.close();
	        	return false;
	        }
			
	}
	
	public static boolean UpdateUser(User_DTO user) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con = null;
		
	        
	        try{
	            DatabaseHelper helper = new DatabaseHelper();
	            con = helper.CreateConnection();
	            String sql = "UPDATE Time SET UserName =? and UserPass = ? and UserFullname =? and UserPhone =? and UserMail=? WHERE TimeId = ? ";
	            PreparedStatement sm = (PreparedStatement) con.prepareStatement(sql) ;
	            
	            sm.setInt(6, user.get_userID());
	            sm.setString(1,user.get_userName() );
	            sm.setString(2,user.get_userPass() );
	            sm.setString(3, user.get_userFullname());
	            sm.setString(4, user.get_userPhone());
	            sm.setString(5, user.get_userMail());
	            
	            ResultSet rs = sm.executeQuery();
	            		
	            
	            con.close();
	            return true;
	            
	        }catch(Exception e){
	        	con.close();
	        	return false;
	        }
			
	}

}
