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
     * @return double New account balance
     * add a new transaction to the transaction array. Use the customer number, 0 trantype, amount, and fee "DEP"
     * add the amount to the balance
     * add one to the tranIndex
     * return the balance
     */
    @Override
    public double deposit(double amount) {
        if (amount > 0) {
            transactions[tranIndex++] = new Transaction(owner.getCustomerNumber(), 0, amount, "DEP");
            balance += amount;
        }
        return balance;
    }

    /***********************************************
     * Subtracts amount from balance
     * pre: amount must be a positive value
     * post: balance decreases in amount value
     * @param amount double Withdrawal amount
     * @return double New account balance
     * create a new transaction and add it to the transaction list. The new transaction will have the customer number, trantype = 0, amount = 0, fees "CR"
     * add charge for using checking account to the amount from customer get check charge
     * if the amount is greater than the balance add an overdraft penalty fee from the customer overdraft penalty.
     * subtract the amount from the balance and return the balance, remember to add 1 to the tranIndex
     */
    @Override
    public double withdrawal(double amount) {
        if (amount > 0) {
            double totalAmount = amount + owner.getCheckCharge();
            if (totalAmount > balance) {
                totalAmount += owner.getOverdraftPenalty();
            }
            transactions[tranIndex++] = new Transaction(owner.getCustomerNumber(), 0, amount, "CR");
            balance -= totalAmount;
        }
        return balance;
    }

    /***********************************************
     * Adds amount to balance
     * pre: amount must be a positive value
     * post: balance increases in amount value
     * @return double New account balance
     * amount = balance * customer's check interest
     * save the transaction into the transactions[tranIndex] as new transaction with customer number, trantype = 0, amount, and fees "INT"
     * add the amount to the balance and return the balance
     */    
    public double addInterest() {
        double interest = balance * owner.getCheckInterest();
        transactions[tranIndex++] = new Transaction(owner.getCustomerNumber(), 0, interest, "INT");
        balance += interest;
        return balance;
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