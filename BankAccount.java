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
	public void deposit(int n){
		if (n > 0){
			balance += n;
			System.out.println("Deposit successful. Current balance: " + balance);
		}
		else{
			System.out.println("Deposit failed. Current balance: " + balance);
		}
	}
	public void withdraw(int w){
		if (w >= 0){
			if (balance >= w){
				balance -= w;
				System.out.println("Withdrawl successful. Current balance: " + balance);
			}
			else{
				System.out.println("Withdrawl failed. Not enough funds. Current balance: " + balance);
			}
		}
		else{
			System.out.println("Withdrawl failed. Current balance: " + balance);
		}
	}
}
