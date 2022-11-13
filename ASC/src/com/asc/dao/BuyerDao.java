package com.asc.dao;

import com.asc.exceptions.BuyerException;
import com.asc.model.Buyer;

public interface BuyerDao {
	
	public String registerBuyer(Buyer b)throws BuyerException;

}
