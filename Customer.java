/*
 * Customer.java
 *
 */
abstract class Customer {

    private String name;
    private String address;
    private int age;
    private String phoneNumber;
    private String customerNumber;

    /** Creates a new instance of Customer */
    public Customer(String name, String address, int age, String phoneNumber, String customerNumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.customerNumber = customerNumber;
    }

    /*******************************************
     * Returns customer's name
     * @return String customer's name
     */
    public String getName() {
        return name;
    }

    /*******************************************
     * Returns customer's address
     * @return String customer's address
     */
    public String getAddress() {
        return address;
    }

    /*******************************************
     * Returns customer's age
     * @return int customer's age
     */
    public int getAge() {
        return age;
    }

    /*******************************************
     * Returns customer's phone number
     * @return String customer's phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /*******************************************
     * Returns customer's number
     * @return String customer's number
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /*******************************************
     * Changes customer's name
     * pre: name must be a not null string
     * post: customer's name changes to name
     * @param name New name
     */
    public void setName(String name) {
        this.name = name;
    }

    /*******************************************
     * Changes customer's address
     * pre: address must be a not null string
     * post: customer's address changes to address
     * @param address New address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /*******************************************
     * Changes customer's age
     * pre: age must be a positive value
     * post: customer's age changes to age
     * @param age New age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /*******************************************
     * Changes customer's phone number
     * pre: phone number must be a not null string
     * post: customer's phone number changed to phoneNumber
     * @param phoneNumber New number
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /*******************************************
     * Changes customer's number
     * pre: customerNumber must be a not null string
     * post: customer's number changes to customerNumber
     * @param customerNumber New customer number
     */
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    // Abstract methods for charges and interest rates
    public abstract double getCheckCharge(); //!
    public abstract double getOverdraftPenalty(); //!
    public abstract double getCheckInterest(); //!
    public abstract double getSavingsCharge(); //!
    public abstract double getSavingsInterest(); //!
}
