public class BankAccount {
    private double balance;
    private final double MIN_BALANCE = 100.0; // Saldo minimal
  
    public BankAccount(double initialBalance) {
      this.balance = initialBalance;
    }
  
    public void deposit(double amount) {
      balance += amount;
      System.out.println("Deposited: $" + amount);
    }
  
    public void withdraw(double amount) throws InsufficientFundsException {
      balance -= amount;
      if (balance < MIN_BALANCE) {
        throw new InsufficientFundsException("Minimum balance required : $"+ MIN_BALANCE);
      }
      System.out.println("Withdrawn: $" + amount);
    }
  
    public double getBalance() {
      return balance;
    }
  }
  