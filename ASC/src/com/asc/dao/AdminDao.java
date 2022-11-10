package com.asc.dao;

import com.asc.exceptions.BuyerException;
import com.asc.exceptions.SellerException;
import com.asc.model.Buyer;
import com.asc.model.Seller;

public interface AdminDao {
	public Buyer viewRegisterBuyerList(Buyer b)throws BuyerException;
	public Seller viewRegisterSellerList(Seller s) throws SellerException;
	
	
}
