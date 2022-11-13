package com.asc.usecase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			System.out.println("Welcome to Auction Seller Contract...........");
			Main m=new Main();
			m.menu();
			m.homePage();
			
	}
	
	public void menu() {
		System.out.println("====================================================================");
		System.out.println("                      Auction Seller Contract                       ");
		System.out.println("====================================================================");
		System.out.println("    1.Admin Activity");
		System.out.println("    2.SellerLogin          ");
		System.out.println("    3.BuyerLogin            ");
		System.out.println("    4.Exit                  ");
		System.out.println("====================================================================");
		
	}
	public void homePage() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choice");
		int in=sc.nextInt();
		
		switch(in) {
		case 1:
			AdminActivity a=new AdminActivity();
			a.loginAdmin();
		}
	}
	

}
