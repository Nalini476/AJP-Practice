public class BankBalance{

    static int balance = 2000;

    static int withdrawAmount = 3000;

    static class InsufficientBalanceException extends Exception {
        InsufficientBalanceException(String message) {
            super(message);
        }
    }

    static void performWithdrawal() throws InsufficientBalanceException {
        if (withdrawAmount > balance) {
            throw new InsufficientBalanceException("Not enough balance!");
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }


    public static void main(String[] args) {
        try {
            performWithdrawal();
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

