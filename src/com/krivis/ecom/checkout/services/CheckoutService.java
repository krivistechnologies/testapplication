package com.krivis.ecom.checkout.services;

import com.krivis.ecom.checkout.dao.CheckoutDao;

public class CheckoutService {
	
	public void checkout() {
		
		CheckoutDao checkoutDao = new CheckoutDao();
		checkoutDao.storeItem();
		System.out.println("Check out is in process");
	}

}


