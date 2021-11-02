package Lab7;

public class A {

	public static void main(String[] args) {
		BankAccount b1=new BankAccount("hjh",1000);
		BankAccount b2=new BankAccount("hj",12000);
		b1.transfer(b2, 12);
		System.out.println(b1.balance);
		System.out.println(b2.balance);

	}

}
