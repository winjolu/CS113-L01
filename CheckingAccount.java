/*
 * CheckingAccount.java
 *
 */

 public class CheckingAccount extends Account {

    private Customer owner; // the owner of the account

    /** 
     * Creates a new instance of CheckingAccount using super
     * 
     * @param accountNumber the account number
     * @param owner the owner of the account
     */
    public CheckingAccount(String accountNumber, Customer owner) {
        super(accountNumber);
        this.owner = owner;
    }

    /***********************************************
     * Adds amount to balance
     * pre: amount must be a positive value
     * post: balance increases in amount value
     * @param amount double Deposit amount
     * add a new transaction to the transaction array. Use the customer number, 0 trantype, amount, and fee "DEP"
     * add the amount to the balance
     * add one to the tranIndex
     */
    public void deposit(double amount) { //!
        if (amount > 0) {
            super.deposit(amount); // Call the superclass method //!
        }
    }

    /***********************************************
     * Subtracts amount from balance
     * pre: amount must be a positive value
     * post: balance decreases in amount value
     * @param amount double Withdrawal amount
     * create a new transaction and add it to the transaction list. The new transaction will have the customer number, trantype = 0, amount = 0, fees "CR"
     * add charge for using checking account to the amount from customer get check charge
     * if the amount is greater than the balance add an overdraft penalty fee from the customer overdraft penalty.
     * subtract the amount from the balance and return the balance, remember to add 1 to the tranIndex
     */
    public void withdraw(double amount) { //!
        if (amount > 0) {
            double totalAmount = amount + owner.getCheckCharge();
            if (totalAmount > getBalance()) { //!
                totalAmount += owner.getOverdraftPenalty();
            }
            super.withdraw(totalAmount); // Call the superclass method //!
        }
    }

    /***********************************************
     * Adds interest to balance
     * pre: balance must be positive
     * post: balance increases by interest amount
     * amount = balance * customer's check interest
     * save the transaction into the transactions[tranIndex] as new transaction with customer number, trantype = 0, amount, and fees "INT"
     * add the amount to the balance
     */    
    public void addInterest() { //!
        double interest = getBalance() * owner.getCheckInterest(); //!
        super.deposit(interest); // Call the superclass method //!
    }

    /*******************************************
     * Returns account owner
     * @return Customer Account owner
     */
    @Override
    public Customer getOwner() {
        return owner;
    }

    /*******************************************
     * Converts CheckingAccount object to a String object
     * @return String account information as String object
     */
    @Override
    public String toString() {
        return super.toString() + ", Owner: " + owner.getName();
    }
}
