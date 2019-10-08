package hw2;

public class BankAccount {
	private String name;
	private double balance;
	public BankAccount(String name, double balance) {
		this.name = name ;
		this.balance= balance;
	}
public String toString() {
	String strbalance = String.format("%.2f", balance);
	if (balance >=0) {
		return (name +",$"+strbalance);
	}
	else {
		return(name+",-$"+strbalance);
	}
}
}
