package Lab7;

public class SavingsAccount extends BankAccount {
	
	private double percentage;
	private double fee;
	
	public SavingsAccount(String username,double cash, double fee, double percentage) {
		super(username,cash);
		this.fee = fee;
		this.percentage = percentage;
	}
	
	public void depositing(double money) {
		if(money>0) {
			balance=percentage*(balance+money);
		}else {
			System.out.println("The deposit amount cannot be less than or equal to 0!");
		}
	}
	public void withdrawing(double money) {
		if (money>0) {
			balance=balance-money-percentage*money;
		}
	}

}
