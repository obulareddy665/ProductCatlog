package com.createiq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.createiq.bean.Product;
import com.createiq.queries.Queries;
import com.createiq.util.ConnectionUtil;

public class ProductDaoImpl implements ProductDao {
	
	static Connection connection=null;
	static PreparedStatement ps=null;
	static ResultSet rs=null;
	public void save(Product product) {
		 connection=ConnectionUtil.openConnection();
		 try {
			ps=connection.prepareStatement(Queries.insert);
			ps.setInt(1, product.getpId());
			
			ps.setString(2, product.getpName());
			ps.setDouble(3, product.getpPrice());
			
			int execute= ps.executeUpdate();
			System.out.println( "Sucessfully inserted the row with id "+product.getpId());
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ConnectionUtil.close(connection, ps);
		}
		
	}
	public void update(Product product) {
		connection=ConnectionUtil.openConnection();
		 
		try {
			ps=connection.prepareStatement(Queries.update);
			ps.setString(1, product.getpName());
			ps.setInt(2, product.getpId());
			int exe=ps.executeUpdate();
			
			System.out.println("sucessfully Executed update "+product.getpId());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ConnectionUtil.close(connection, ps);
		}
		
	}
	public List<Product> findAll() {
		connection=	ConnectionUtil.openConnection();
		List<Product> products=new ArrayList<>();
			try {
				ps=connection.prepareStatement(Queries.list);
				rs=ps.executeQuery();
				
				while (rs.next()) {
				Product product=new Product();
				product.setpId(rs.getInt(1));
				product.setpName(rs.getString(2));
				product.setpPrice(rs.getDouble(3));
				products.add(product);
				
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				ConnectionUtil.closeRs(connection, ps, rs);
			}
			return products;
	}
	public List<Product> findById(Integer id) {
		connection=	ConnectionUtil.openConnection();
		List<Product> products=new ArrayList<>();
		
				try {
					ps=connection.prepareStatement(Queries.find_by_id);
					ps.setInt(1, id);
					rs=ps.executeQuery();
					while (rs.next()) {
						Product product=new Product();
						       product.setpId(rs.getInt(1));
						       product.setpName(rs.getString(2));
						       product.setpPrice(rs.getDouble(3));
						       products.add(product);
					}
					
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {
					ConnectionUtil.closeRs(connection, ps, rs);
				}
				return products;
				
	}
	public void delete_by_id(Integer id) {
connection=ConnectionUtil.openConnection();
		
		try {
			ps=connection.prepareStatement(Queries.delete_by_id);
			ps.setInt(1, id);
			int execute=ps.executeUpdate();
			System.out.println("sucessfully removed details with id "+id);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		             ConnectionUtil.close(connection, ps);
		}
		
	}

	
	

}
