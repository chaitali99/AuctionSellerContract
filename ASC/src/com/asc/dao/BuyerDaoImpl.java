package com.asc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.asc.exceptions.BuyerException;
import com.asc.model.Buyer;
import com.asc.utility.DBUtil;

public class BuyerDaoImpl implements BuyerDao{

	@Override
	public String registerBuyer(Buyer b) throws BuyerException {
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

}
