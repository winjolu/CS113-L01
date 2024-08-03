/*
 * Student.java
 */

 public class Student extends Customer {

    /** 
     * Creates a new instance of Student
     * 
     * @param name the customer's name
     * @param address the customer's address
     * @param age the customer's age
     * @param phoneNumber the customer's phone number
     * @param customerNumber the customer's number
     */
    public Student(String name, String address, int age, String phoneNumber, String customerNumber) {
        super(name, address, age, phoneNumber, customerNumber);
    }

    /**
     * Returns the type of customer.
     * @return the type of customer
     */
    @Override
    public String getType() {
        return "Student";
    }

    /** 
     * Getter for Savings Interest 
     * @return double Savings Interest
     */
    public double getSavingsInterest() {
        // Implement logic to return the savings interest for Student
        return 0.02; // example value
    }

    /** 
     * Getter for Check Interest 
     * @return double Check Interest
     */
    public double getCheckInterest() {
        // Implement logic to return the check interest for Student
        return 0.005; // example value
    }

    /** 
     * Getter for Check Charge 
     * @return double Check Charge
     */
    public double getCheckCharge() {
        // Implement logic to return the check charge for Student
        return 0.1; // example value
    }

    /** 
     * Getter for OverdraftPenalty 
     * @return double OverdraftPenalty
     */
    public double getOverdraftPenalty() {
        // Implement logic to return the overdraft penalty for Student
        return 30.0; // example value
    }
}