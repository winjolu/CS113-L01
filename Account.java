/*
 * Account.java
 *
 */

 abstract class Account {

    private String accountNumber; // account number
    private double balance; // account balance
    private Transaction[] transactions; // array of transactions
    private int tranIndex; // transaction index

    /** 
     * Creates a new instance of Account
     * Increments account number, initializes balance to 0, sets transaction limit to 20, and initializes transaction index to 0
     * 
     * @param accountNumber the account number
     */
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.transactions = new Transaction[20]; // assuming max 20 transactions for simplicity
        this.tranIndex = 0;
    }

    /*******************************************
     * Returns account balance
     * @return double Account balance
     */
    public double getBalance() {
        return balance;
    }

    /*******************************************
     * Returns account owner
     * @return Customer Account owner
     */
    public abstract Customer getOwner();

    /*******************************************
     * Returns account number
     * @return String Account number
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /*******************************************
     * Converts Account object to a String object
     * @return String account information as String object
     */
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }

    /*******************************************
     * Deposits a specified amount into the account
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions[tranIndex++] = new Transaction("Deposit", amount);
        }
    }

    /*******************************************
     * Withdraws a specified amount from the account
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions[tranIndex++] = new Transaction("Withdraw", amount);
        }
    }
}