/*
 * BankApp.java
 *
 */

// Create a BankApp class
public class BankApp {
    /** Creates a new instance of BankApp with a new bank */
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        // Add some accounts for testing
        bank.addAccount("Joe Biden", "The White House", 81, "555-0001", 0, 1); // Senior, Checking
        bank.addAccount("Winston Ludlam", "Unknown", 48, "555-0002", 2, 0); // Student, Savings
        bank.addAccount("Eduardo Mariscal", "Miracosta College, Oceanside, CA", -1, "555-0003", 1, 0); // Adult, Savings (age unknown)

        // Display accounts
        System.out.println(bank.getAccount("A1"));
        System.out.println(bank.getAccount("A2"));
        System.out.println(bank.getAccount("A3"));

        // Make a deposit
        System.out.println("Depositing $100 to account A1...");
        bank.makeDeposit("A1", 100);
        System.out.println(bank.getAccount("A1"));

        // Make a withdrawal
        System.out.println("Withdrawing $50 from account A2...");
        bank.makeWithdrawal("A2", 50);
        System.out.println(bank.getAccount("A2"));
    }
}