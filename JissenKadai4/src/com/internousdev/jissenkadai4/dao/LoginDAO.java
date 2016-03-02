package com.internousdev.jissenkadai4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.jissenkadai4.util.DBConnector;

public class LoginDAO {

	private String admin_name;

	public boolean select(String user, String password){
			System.out.println(user + ":" + password);
	Connection conn = null;
	boolean ret = false;
//	System.err.println("ggggghgghgjhghgjhgS");

	try{
		conn = (Connection)DBConnector.getConnection();
		String sql = "select * from admin_table where username = ? and password = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, user);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();

		if(rs.next()){
			admin_name = rs.getString("username");
			ret = true;
		}

	}catch(SQLException e){
		e.printStackTrace();
		try{
			conn.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		}finally{
			if(conn != null){
				try{
					conn.close();
				}catch(SQLException e2){
					e2.printStackTrace();
				}
			}
		}
		return ret;
	}



	public String getAdmin_name(){
		return admin_name;
	}

	public void setAdmin_name(String admin_name){
		this.admin_name = admin_name;
	}
}