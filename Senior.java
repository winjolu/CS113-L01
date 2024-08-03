/*
 * Senior.java
 */

 public class Senior extends Customer {

    /** 
     * Creates a new instance of Senior
     * 
     * @param name the customer's name
     * @param address the customer's address
     * @param age the customer's age
     * @param phoneNumber the customer's phone number
     * @param customerNumber the customer's number
     */
    public Senior(String name, String address, int age, String phoneNumber, String customerNumber) {
        super(name, address, age, phoneNumber, customerNumber);
    }

    /**
     * Returns the type of customer.
     * @return the type of customer
     */
    @Override
    public String getType() {
        return "Senior";
    }

    /** 
     * Getter for Savings Interest 
     * @return double Savings Interest
     */
    public double getSavingsInterest() {
        // Implement logic to return the savings interest for Senior
        return 0.04; // example value
    }

    /** 
     * Getter for Check Interest 
     * @return double Check Interest
     */
    public double getCheckInterest() {
        // Implement logic to return the check interest for Senior
        return 0.02; // example value
    }

    /** 
     * Getter for Check Charge 
     * @return double Check Charge
     */
    public double getCheckCharge() {
        // Implement logic to return the check charge for Senior
        return 0.3; // example value
    }

    /** 
     * Getter for OverdraftPenalty 
     * @return double OverdraftPenalty
     */
    public double getOverdraftPenalty() {
        // Implement logic to return the overdraft penalty for Senior
        return 20.0; // example value
    }
}