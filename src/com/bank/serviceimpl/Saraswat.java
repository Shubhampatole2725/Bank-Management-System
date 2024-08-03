package com.bank.serviceimpl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//import java.io.Serializable;
import java.util.Scanner;

import com.bank.Model.Account;
import com.bank.service.RBI;

public class Saraswat implements RBI {

	Scanner sc = new Scanner(System.in);
	Account ac;

	public void createAccount() {
		ac = new Account();

		System.out.println("Enter Account Number : ");
		ac.setAccno(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Account Holder Name : ");
		ac.setAccName(sc.nextLine());
		System.out.println("Enter Account Holder address : ");
		ac.setAdress(sc.nextLine());
		System.out.println("Enter Account Holder Mobile No. : ");
		ac.setMobileno(sc.nextLong());
		System.out.println("Enter Account Holder Aadhar No. : ");
		ac.setAadharno(sc.nextLong());
		sc.nextLine();
		System.out.println("Enter Account Holder PanNo. : ");
		ac.setPanno(sc.nextLine());
		System.out.println("Enter Account Holder Age : ");
		ac.setAge(sc.nextInt());
		System.out.println("Enter Account Holder Gender : ");
		ac.setGender(sc.next());
		System.out.println("Enter Account Holder Balance : ");
		ac.setBalance(sc.nextLong());

		String filename = "C:\\Users\\Shubham Patole\\Desktop\\FileBankProject\\BankDetails.txt";
		sc.nextLine();
		try {
			FileOutputStream fos = new FileOutputStream(filename, true);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ac);
//			oos.writeObject(ac.getAccno());
//			oos.writeObject(ac.getAdress());
//			oos.writeObject(ac.getMobileno());
//			oos.writeObject(ac.getAadharno());
//			oos.writeObject(ac.getPanno());
//			oos.writeObject(ac.getAge());
//			oos.writeObject(ac.getGender());
//			oos.writeObject(ac.getBalance());

			oos.close();
			fos.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.nextLine();
	}

	public void viewAccountDetails() {

		String filename = "C:\\Users\\Shubham Patole\\Desktop\\FileBankProject\\BankDetails.txt";
		try {
//			FileReader fr = new FileReader(filename);
//			BufferedReader br = new BufferedReader(fr);
//			System.out.println("Which User Data You want to see :");
//			int cnt = sc.nextInt();
//			String str = br.readLine();
//			while(str!=null) {
//				
//				System.out.println(str);
//				str = br.readLine();				
//			}
//			br.close();
//			fr.close();
			System.out.println("Enter Account Number : ");
			int accno = sc.nextInt();

			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois =null;
			while (fis.available()!=0){
			
			 ois = new ObjectInputStream(fis);

			    ac = (Account) ois.readObject();
		
				if (ac.getAccno() == accno) {
					System.out.println("********************************");
					System.out.println(ac);
					System.out.println("Account No. : " + ac.getAccno());
					System.out.println("Account Holder Name : " + ac.getAccName());
					System.out.println("Account Holder Address : " + ac.getAdress());
					System.out.println("Account Holder Mobile No. : " + ac.getMobileno());
					System.out.println("Account Holder Aadhar No. : " + ac.getAadharno());
					System.out.println("Account Holder PanNo. : " + ac.getPanno());
					System.out.println("Account Holder Age : " + ac.getAge());
					System.out.println("Account Holder Gender : " + ac.getGender());
					System.out.println("Account Holder Balance : " + ac.getBalance());
					System.out.println("********************************");
				}
				

			}

			ois.close();
			fis.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void depositMoney(int dAmount) {
		double balance = ac.getBalance() + dAmount;
		System.out.println("Amount deposited.!!");
		System.out.println("Balance : " + balance);
		ac.setBalance(balance);
	}

	public void withdrawMoney(int wAmount) {
		double balance = ac.getBalance();
		if ((balance - wAmount) < 500) {
			System.out.println("Insufficient Balance..!!!");
		} else {
			balance = balance - wAmount;
			ac.setBalance(balance);
			System.out.println("Amount Winthdrawn..!!!");
			System.out.println("Available Balance : " + balance);
		}
	}

	public void showBalance() {
		double balance = ac.getBalance();
		System.out.println("Available Balance : " + balance);
	}

}
