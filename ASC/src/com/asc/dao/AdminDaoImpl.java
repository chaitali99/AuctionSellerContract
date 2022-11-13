package com.asc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.asc.exceptions.AdminException;
import com.asc.exceptions.BuyerException;
import com.asc.exceptions.SellerException;
import com.asc.model.Admin;
import com.asc.model.Buyer;
import com.asc.model.Seller;
import com.asc.utility.DBUtil;

public class AdminDaoImpl implements AdminDao{

	@Override
	public List<Buyer> viewRegisterBuyerList() throws BuyerException {
		List<Buyer> buyers=new ArrayList<>();
		
		try(Connection conn=DBUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("select * from buyer");
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int id=rs.getInt(1);
				String n=rs.getString(2);
				String c=rs.getString(3);
				String s=rs.getString(4);
				String p=rs.getString(5);
				String coun=rs.getString(6);
				String email=rs.getString(7);
				String pass=rs.getString(8);
				Buyer buyer=new Buyer(id,n,c,s,p,coun,email,pass);
				buyers.add(buyer);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			throw new BuyerException(e.getMessage()); 
		}
		
		return buyers;
	}

	@Override
	public List<Seller> viewRegisterSellerList() throws SellerException {
		List<Seller> sellers=new ArrayList<>();		
		try(Connection conn=DBUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("select * from seller");
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int id=rs.getInt(1);
				String n=rs.getString(2);
				String c=rs.getString(3);
				String s=rs.getString(4);
				String p=rs.getString(5);
				String coun=rs.getString(6);
				String email=rs.getString(7);
				String pass=rs.getString(8);
				Seller seller=new Seller(id,n,c,s,p,coun,email,pass);
				sellers.add(seller);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			throw new SellerException(e.getMessage()); 
		}
		
		return sellers;	
		
	}

	@Override
	public boolean signIn(String username, String password) throws AdminException {
			boolean message=false;		
		try(Connection conn=DBUtil.provideConnection()){
			
			PreparedStatement ps=conn.prepareStatement("select * from admin where email=? and password=?");

			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet x=ps.executeQuery();
			if(x.next()) {
				message=true;
			}else {
				throw new AdminException("Admin not found with email "+username);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new AdminException(e.getMessage());
		}
		
		return message;
	}


	
}
