package com.encore.account;

public class Account {
	// 변수 
	private String custId;
	private String custName;
	private String accountNumber;
	private int balance;
	
	//생성자
	public Account() {
		
	}
	public Account(String custId,String custName,String accountNumber,int balance) {
		super(); // 자신이 상속받은 부모의 생성자를 호출하는 메서드
		this.custId=custId;
		this.custName=custName;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	// Getter, Setter 함수
	public String getCustId() {
		return custId;
	}
	public void setCustID(String custId) {
		this.custId=custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName=custName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber=accountNumber;
	}
	public int getBalance() {
		return balance;
		
	}
	public void setBalance(int balance) {
		
	}
	
	// 메서드
	public void addBalance(int amount) {
		this.balance=this.balance+amount;
	}
	public void subtractBalance(int amount) {
		this.balance=this.balance-amount;
	}


}
