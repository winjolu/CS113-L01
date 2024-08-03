/*
 * Transaction.java
 *
 */

 public class Transaction {

    private String transactionType; // type of transaction (e.g., "Deposit", "Withdraw")
    private double amount; // amount involved in the transaction
    private String date; // date of the transaction

    /** 
     * Creates a new instance of Transaction
     * 
     * @param transactionType the type of transaction
     * @param amount the amount involved in the transaction
     * @param date the date of the transaction
     */
    public Transaction(String transactionType, double amount, String date) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.date = date;
    }

    /*******************************************
     * Returns the type of transaction
     * @return String type of transaction
     */
    public String getTransactionType() {
        return transactionType;
    }

    /*******************************************
     * Returns the amount of the transaction
     * @return double amount of transaction
     */
    public double getAmount() {
        return amount;
    }

    /*******************************************
     * Returns the date of the transaction
     * @return String date of transaction
     */
    public String getDate() {
        return date;
    }

    /*******************************************
     * Converts Transaction object to a String object
     * @return String transaction information as String object
     */
    @Override
    public String toString() {
        return "Transaction Type: " + transactionType + ", Amount: " + amount + ", Date: " + date;
    }
}