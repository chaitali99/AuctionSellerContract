package com.asc.dao;

import com.asc.exceptions.SellerException;
import com.asc.model.Seller;

public interface SellerDao {
	public String registerSeller(Seller s)throws SellerException;
	public String deleteItem(String item)throws SellerException;
	 
	
}
