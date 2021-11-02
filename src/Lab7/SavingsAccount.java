package Lab7;

import javax.sound.midi.VoiceStatus;

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
	@Override
	public boolean withdraw(double money) {
		if (money>0&&money+percentage*money<=balance) {
			fee=percentage*money;
			balance=balance-money-percentage*money;
			return true;
		}else {
			System.out.println("Lack of balance!");
			return false;
		}
	}
	public void applyInterest(double balance) {
		if(balance>0) {
			balance=((percentage*balance)/365)*balance+balance;
		}
		
	}

}
