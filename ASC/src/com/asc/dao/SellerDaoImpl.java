package com.asc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.asc.exceptions.SellerException;
import com.asc.model.Seller;
import com.asc.utility.DBUtil;

public class SellerDaoImpl implements SellerDao{

	@Override
	public String registerSeller(Seller s) throws SellerException {
		String message="Not registered..........";
		
		try(Connection conn=DBUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("insert into seller(name,city,state,"
					+ "pincode,country,email,password) "
					+ "values(?,?,?,?,?,?,?)");
			
			ps.setString(1, s.getName());
			ps.setString(2, s.getCity());
			ps.setString(3, s.getState());
			ps.setString(4, s.getPincode());
			ps.setString(5, s.getCountry());
			ps.setString(6, s.getEmail());
			ps.setString(7, s.getPassword());
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Seller Registered Successfull..............";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SellerException(e.getMessage());
		}
		
		return message;
		
	}

	@Override
	public String deleteItem(String item) throws SellerException {
		String message="Record not deleted";
		
		try(Connection conn=DBUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("delete from item where itemName=?");
			
			ps.setString(1, item);
			
			int x=ps.executeUpdate();
			if(x>0) {
				message="Item deleted Successfully";
			}else {
				throw new SellerException("Item not deleted..................");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			throw new SellerException(e.getMessage());
		}
		
		return message;
		
	}
	

}
