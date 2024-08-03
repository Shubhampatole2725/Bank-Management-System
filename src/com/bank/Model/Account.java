package com.bank.Model;

import java.io.Serializable;

public class Account implements Serializable {

	private int Accno;
	private String AccName;
	private String Adress;
	private long Mobileno;
	private long Aadharno;
	private String Panno;
	private int age;
	private String gender;
	private double balance;

	public int getAccno() {
		return Accno;
	}
	public void setAccno(int accno) {
		Accno = accno;
	}
	public String getAccName() {
		return AccName;
	}
	public void setAccName(String accName) {
		AccName = accName;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public long getMobileno() {
		return Mobileno;
	}
	public void setMobileno(long mobileno) {
		Mobileno = mobileno;
	}
	public long getAadharno() {
		return Aadharno;
	}
	public void setAadharno(long aadharno) {
		Aadharno = aadharno;
	}
	public String getPanno() {
		return Panno;
	}
	public void setPanno(String panno) {
		Panno = panno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
