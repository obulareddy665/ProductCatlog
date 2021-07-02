package com.createiq.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class ConnectionUtil {

	public static Connection connection=null;
    public static	PreparedStatement ps=null;
    public static ResultSet rs=null;
	public static Connection openConnection() {
		try {
			Class.forName(Details.driver);
			connection=DriverManager.getConnection(Details.url,Details.user,Details.password);
			System.out.println(connection);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
	}
	
	public static  void close(Connection connection) {
	if(connection!=null) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}
	
	public static void close(Connection connection,PreparedStatement ps) {
		if(ps!=null) {
			ConnectionUtil.close(connection);
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public static void closeRs(Connection connection,PreparedStatement ps,ResultSet rs) {
		if(rs!=null) {
			ConnectionUtil.close(connection, ps);
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}
		
		
		
	}
//	public static void main(String[] args) {
//	connection=	ConnectionUtil.openConnection();
//		System.out.println(connection);
//	}
	
}
