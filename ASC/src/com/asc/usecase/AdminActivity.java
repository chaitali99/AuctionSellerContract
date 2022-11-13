package com.asc.usecase;

import java.util.List;
import java.util.Scanner;

import com.asc.dao.AdminDao;
import com.asc.dao.AdminDaoImpl;
import com.asc.exceptions.AdminException;
import com.asc.exceptions.BuyerException;
import com.asc.exceptions.SellerException;
import com.asc.model.Buyer;
import com.asc.model.Seller;

public class AdminActivity {
	
	public void displayAdminMenu() {
		System.out.println("================================");
		System.out.println("      1.View Seller list");
		System.out.println("      2.View Buyer List");
		System.out.println("      3.Logout");
		System.out.println("=================================");
		
	}
	
	public void adminInputList() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your operation");
		int x=sc.nextInt();
		
		switch(x) {
		case 1:
			sellerList();
			break;
		case 2:
			buyerList();
			break;
		case 3:
			System.out.println("Admin Logged Out");
			Main m=new Main();
			m.menu();
			m.homePage();
		}
	}

	public void loginAdmin() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Admin Username");
		String username=sc.next();
		System.out.println("Enter password");
		String password=sc.next();
		
		AdminDao dao=new AdminDaoImpl();
		
		try {
			boolean res=dao.signIn(username, password);
			if(res) {
				System.out.println("Login Successfulll..............");
				displayAdminMenu();
				adminInputList();			}
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void sellerList() {
		AdminDao dao=new AdminDaoImpl();
		try {
			List<Seller> s=dao.viewRegisterSellerList();
			if(s.size()!=0) {
				System.out.println("SELLER LIST");
				s.forEach(s1->{
					System.out.println(s1);

				});
			}
			pressOneTwo();
			
		} catch (SellerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void buyerList() {
		AdminDao dao=new AdminDaoImpl();
		try {
			List<Buyer> b=dao.viewRegisterBuyerList();
			if(b.size()!=0) {
				System.out.println("SELLER LIST");
				b.forEach(b1->{
					System.out.println(b1);

				});
			}
			pressOneTwo();
			
		} catch (BuyerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void pressOneTwo() {
		//System.out.println("Enter 1 or two");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("=============================");
		System.out.println("Press 1 for back to menu");
		System.out.println("Press 2 for logout");
		System.out.println("=============================");

		int in=sc.nextInt();
		
		Main m=new Main();
		
		if(in==1) {
			System.out.println();
			displayAdminMenu();
			adminInputList();
			
		}else if(in==2) {
			System.out.println("Logged out");
			
			m.menu();
			m.homePage();
		}else {
			System.out.println("Wrong Input.........");
			pressOneTwo();
		}
		
	}
}
