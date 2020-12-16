package fr.jonathan.programme;

public class Account {
	private String owner;
	private double amount;
	private char currency;
	
	public Account(String owner, double amount, char currency) {
		this.owner = owner;
		this.amount = amount;
		this.currency = currency;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public char getCurrency() {
		return currency;
	}
	
	public void addMoney(int amount) {
		this.amount += amount;
	}
	
	public void removeMoney(int amount) {
		this.amount -= amount;
	}
	
	public void showBalance() {
		System.out.println("Vous avez actuellement" + amount + " " + currency + " sur votre solde !");
	}
}
