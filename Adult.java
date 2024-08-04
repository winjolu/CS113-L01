/*
 * Adult.java
 */

 public class Adult extends Customer {

    /** 
     * Creates a new instance of Adult
     * 
     * @param name the customer's name
     * @param address the customer's address
     * @param age the customer's age
     * @param phoneNumber the customer's phone number
     * @param customerNumber the customer's number
     */
    public Adult(String name, String address, int age, String phoneNumber, String customerNumber) {
        super(name, address, age, phoneNumber, customerNumber);
    }

    /**
     * Returns the type of customer.
     * @return the type of customer
     */
    // @Override
    public String getType() {
        return "Adult";
    }

    /** 
     * Getter for Savings Interest 
     * @return double Savings Interest
     */
    @Override 
    public double getSavingsInterest() {
        // Implement logic to return the savings interest for Adult
        return 0.03; // example value
    }
    /** 
    * Getter for Savings Charge 
    * @return double Savings Charge
    */
    @Override
    public double getSavingsCharge() { //!
        // Implement logic to return the savings charge for Adult
        return 0.5; // example value
    }

    /** 
     * Getter for Check Interest 
     * @return double Check Interest
     */
    @Override 
    public double getCheckInterest() {
        // Implement logic to return the check interest for Adult
        return 0.01; // example value
    }

    /** 
     * Getter for Check Charge 
     * @return double Check Charge
     */
    @Override 
    public double getCheckCharge() {
        // Implement logic to return the check charge for Adult
        return 0.5; // example value
    }

    /** 
     * Getter for OverdraftPenalty 
     * @return double OverdraftPenalty
     */
    @Override 
    public double getOverdraftPenalty() {
        // Implement logic to return the overdraft penalty for Adult
        return 25.0; // example value
    }
}