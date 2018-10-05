public class BankAccount{
	private double balance;
	private int accountID;
	private String password;
	public BankAccount(double bal, int acc, String pass){
		balance = bal;
		accountID = acc;
		password = pass;
	}
	public String toString(){
		return accountID + "\t" + balance;
	}
	public double getBalance(){
		return balance;
	}
	public int getAccount(){
		return accountID;
	}
	public void setPass(String s){
		password = s;
	}
	public boolean deposit(double n){
		if (n > 0){
			balance += n;
			return true;
		}
		else{
			return false;
		}
	}
	public boolean withdraw(double w){
		if (w >= 0){
			if (balance >= w){
				balance -= w;
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}
	private boolean authenticate(String pass){
		return this.password.equals(pass);
	}
	public boolean transferTo(BankAccount other, double amount, String password){
		if (this.authenticate(password)){
			if (this.balance >= amount){
				other.balance += amount;
				this.balance -= amount;
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}
}
