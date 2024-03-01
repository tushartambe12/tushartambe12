package com.edubridge.oops;
class AccountHolder
{
	void info(String accNo,String name) {
		System.out.println("Acount Number:"+accNo+"\n");
	}
}
class Bank{
	void getRoi(double roi) {
		System.out.println("bank intrest;"+roi);
	}
}
public class test1 {

	public static void main(String[] args) {
		AccountHolder a1=new AccountHolder();
   a1.info("123", "Tushar");
   Bank b1=new Bank();
   
   b1.getRoi(5.6); 		
   
	}

}
