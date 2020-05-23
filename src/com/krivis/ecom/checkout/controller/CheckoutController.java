package com.krivis.ecom.checkout.controller;

import com.krivis.ecom.checkout.services.CheckoutService;
import java.util.Scanner;



public class CheckoutController {

	public static void main(String[] args) {
		
		CheckoutService checkoutService = new CheckoutService();
		checkoutService.checkout();


	}

}
