package com.asc.dao;

import java.util.List;

import com.asc.exceptions.AdminException;
import com.asc.exceptions.BuyerException;
import com.asc.exceptions.SellerException;
import com.asc.model.Admin;
import com.asc.model.Buyer;
import com.asc.model.Seller;

public interface AdminDao {
	public List<Buyer> viewRegisterBuyerList()throws BuyerException;
	public List<Seller> viewRegisterSellerList() throws SellerException;
	public boolean signIn(String username,String password)throws AdminException;	
	
}
