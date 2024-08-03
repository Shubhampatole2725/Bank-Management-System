package com.bank.Admin;

import java.util.*;
import com.bank.service.RBI;
import com.bank.serviceimpl.Saraswat;

public class BankApp {

	public static void main(String[] args) {
		
		RBI r = new Saraswat();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while(flag)
		{
			System.out.println();
			
			System.out.println("*********************************");
			System.out.println("Press 1 for creating Bank Account : ");
			System.out.println("Press 2 for View Details of User : ");
	 		System.out.println("Press 3 for Deposit Amount in Bank Account : ");
			System.out.println("Press 4 for Withdraw Amount from Bank Account : ");
			System.out.println("Press 5 for Show Balance from Bank Account : ");
			
			System.out.println("*********************************");
			System.out.println();
			
			int ch = sc.nextInt();
			switch(ch) {
				
			case 1 : r.createAccount();
					try {
						
					} catch (Exception e) {
						
					}
					break;
			case 2 : r.viewAccountDetails();
					break;
			case 3 : System.out.println("Enter Amount you want to deposit :");
					int dAmount = sc.nextInt();
					r.depositMoney(dAmount);
			   		break;
			case 4 : System.out.println("Enter Amount you want to Withdraw :");
					int wAmount = sc.nextInt();
					r.withdrawMoney(wAmount);
					break;
			case 5 : r.showBalance();
					break;
			default : break;
			}
			System.out.println("Do you to continue (Y/N)");
			String cho = sc.next();
			if(cho.equals("Y") || cho.equals("y")) {
				continue;
			}
			else {
				break;
			}
			
		}
		

	}

}
