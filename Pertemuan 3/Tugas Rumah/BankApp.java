public class BankApp {
    public static void main(String[] args) {
        BankAccount Akun = new BankAccount(300);
        System.out.println("Saldo awal : $" + Akun.getBalance());
        try{
            System.out.println("=====Mencoba deposit $200=====");
            Akun.deposit(200);
            System.out.println("Saldo saat ini : $" + Akun.getBalance());
            System.out.println("=====Mencoba withdraw $300=====");
            Akun.withdraw(300);
            System.out.println("Saldo saat ini : $" + Akun.getBalance());
            System.out.println("=====Mencoba withdraw $200=====");
            Akun.withdraw(200);
            System.out.println("Saldo saat ini : $" + Akun.getBalance());
        }
        catch(InsufficientFundsException saldo){
            System.out.println(saldo.getMessage());
        }
        
    }
}
