package Lab7;

public class BankAccount {
	protected String user;
	protected double  balance;
	public BankAccount(String username,double cash) {
		balance=cash;
		user=username;
	}
	public boolean deposit(double money) {
		if(money<=0) {
			System.out.println("You can't save less than 0!");
			return false;
		}
		else {
			balance+=money;
			return true;
		}
	}
	public boolean withdraw(double money) {
		if(money>balance&&money>=0) {
			System.out.println("Insufficient account balance!");
			return false;
		}else {
			balance-=money;
			return true;
		}
		
	}
	

}
