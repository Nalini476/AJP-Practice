public class Bank {
    private double amount;

    public Bank(double amount) {
        this.amount = amount;
    }

    public void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount)
            ? "Withdraw successful. Withdrawn: " + withdrawalAmount
            : "Insufficient balance. Withdraw failed.";

        amount = (withdrawalAmount <= amount) ? (amount - withdrawalAmount) : amount;

        System.out.println(message);
    }

    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful. Deposited: " + depositAmount);
    }

    public void displayBalance() {
        System.out.println("Total Balance: " + amount);
    }
    public static void main(String[] args) {
        Bank myAccount = new Bank(10000);
        myAccount.withdraw(3000); 
        myAccount.withdraw(8000); 
        myAccount.deposit(5000);
        myAccount.displayBalance();
    }
}
