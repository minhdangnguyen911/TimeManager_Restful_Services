package com.nmdang.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nmdang.DBHelper.DatabaseHelper;
import com.nmdang.DTO.Time_DTO;
import com.nmdang.DTO.User_DTO;







public class Time_DAO {

	
	public static ArrayList<Time_DTO> GetListTimeByUser(User_DTO user) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con = null;
		ArrayList<Time_DTO> timeofuser = new ArrayList<Time_DTO>();
	        
	        try{
	            DatabaseHelper helper = new DatabaseHelper();
	            con = helper.CreateConnection();
	            String sql = "SELECT * FROM Time WHERE user = ? ";
	            PreparedStatement sm = (PreparedStatement) con.prepareStatement(sql) ;
	            
	            sm.setString(1, user.get_userID());
	            
	            ResultSet rs = sm.executeQuery();
	            		
	            while(rs.next()){
	               Time_DTO time = new Time_DTO();
	               time.set_timeId(rs.getInt("TimeId"));
	               time.set_timeName(rs.getString("TimeName"));
	               time.set_timeStart(rs.getDate("TimeStart"));
	               time.set_timeEnd(rs.getDate("TimeEnd"));
	               timeofuser.add(time);
	             
	            }
	            con.close();
	        }catch(Exception e){
	        	con.close();
	        }
			return timeofuser;
	        
	}
	
	public static ArrayList<Time_DTO> GetListTime() throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con = null;
		ArrayList<Time_DTO> timeofuser = new ArrayList<Time_DTO>();
	        
	        try{
	            DatabaseHelper helper = new DatabaseHelper();
	            con = helper.CreateConnection();
	            String sql = "SELECT * FROM Time  WHERE 1";
	            PreparedStatement sm = (PreparedStatement) con.prepareStatement(sql) ;
	            
	            
	            
	            ResultSet rs = sm.executeQuery();
	            		
	            while(rs.next()){
	               Time_DTO time = new Time_DTO();
	               time.set_timeId(rs.getInt("TimeId"));
	               time.set_timeName(rs.getString("TimeName"));
	               time.set_timeStart(rs.getDate("TimeStart"));
	               time.set_timeEnd(rs.getDate("TimeEnd"));
	               timeofuser.add(time);
	             
	            }
	            con.close();
	        }catch(Exception e){
	        	con.close();
	        }
			return timeofuser;
	        
	}
	
	public static boolean AddTimeToUser(Time_DTO time) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con = null;
		
	        
	        try{
	            DatabaseHelper helper = new DatabaseHelper();
	            con = helper.CreateConnection();
	            String sql = "INSERT INTO Time( TimeId, TimeName, TimeStart,TimeEnd) Values(?,?,?,?)";
	            PreparedStatement sm = (PreparedStatement) con.prepareStatement(sql) ;
	            
	            sm.setInt(1, time.get_timeId());
	            sm.setString(2, time.get_timeName());
	            sm.setDate(3, time.get_timeStart());
	            sm.setDate(4, time.get_timeEnd());
	            
	            ResultSet rs = sm.executeQuery();
	            		
	            
	            con.close();
	            return true;
	            
	        }catch(Exception e){
	        	con.close();
	        	return false;
	        }
			
	}

	public static boolean DeleteTimeToUser(Time_DTO time) throws SQLException {// chưa xong , sửa lại sql
		// TODO Auto-generated method stub
		
		Connection con = null;
		
	        
	        try{
	            DatabaseHelper helper = new DatabaseHelper();
	            con = helper.CreateConnection();
	            String sql = "DELETE INTO Time( TimeId, TimeName, TimeStart,TimeEnd) Values(?,?,?,?)";
	            PreparedStatement sm = (PreparedStatement) con.prepareStatement(sql) ;
	            
	            sm.setInt(1, time.get_timeId());
	            sm.setString(2, time.get_timeName());
	            sm.setDate(3, time.get_timeStart());
	            sm.setDate(4, time.get_timeEnd());
	            
	            ResultSet rs = sm.executeQuery();
	            		
	            
	            con.close();
	            return true;
	            
	        }catch(Exception e){
	        	con.close();
	        	return false;
	        }
			
	}

}
