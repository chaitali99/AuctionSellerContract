package com.asc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.asc.exceptions.BuyerException;
import com.asc.exceptions.SellerException;
import com.asc.model.Buyer;
import com.asc.model.Seller;
import com.asc.utility.DBUtil;

public class AdminDaoImpl implements AdminDao{

	@Override
	public String viewRegisterBuyerList(Buyer b) throws BuyerException {
		
		String message="Not registered.................";
		
		try(Connection conn=DBUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("insert into buyer(name,city,state,"
					+ "pincode,country,"
					+ "email,password) "
					+ "values(?,?,?,?,?,?,?)");
			
			ps.setString(1,b.getName());
			ps.setString(2, b.getCity());
			ps.setString(3, b.getState());
			ps.setString(4,b.getPincode());
			ps.setString(5, b.getCountry());
			ps.setString(6, b.getEmail());
			ps.setString(7, b.getPassword());
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				message="Buyer register successfully.......";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BuyerException(e.getMessage());
		}
		
		return message;
	}

	@Override
	public String viewRegisterSellerList(Seller s) throws SellerException {
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

	
}
