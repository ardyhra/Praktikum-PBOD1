public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
      super("Insufficient funds. " + message);
    }
}
  