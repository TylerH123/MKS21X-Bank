public class Driver{
  public static void main(String[] args){
      BankAccount bankacc1 = new BankAccount(102993.99, 25596, "password");
      System.out.println(bankacc1.toString());
      System.out.println(bankacc1.getBalance());
      System.out.println(bankacc1.getAccount());
      bankacc1.setPass("sauce");
      bankacc1.deposit(100);
      bankacc1.withdraw(1000);
      bankacc1.withdraw(-100);
      bankacc1.withdraw(1000000000);
  }
}
