package sample;

public class SavingAccount {
	
	private String name ;
	
	private float balance ;
	
	
	static private float CurrentRate = 0.05f;
	
	public SavingAccount(String name , float Amount) {
		
		
		this.balance = Amount ;
		
		this.name = name ;
		
	}
	
	public void EarnInterest() {
		
		
		balance = balance*(1+CurrentRate/100);
	}
	
}
