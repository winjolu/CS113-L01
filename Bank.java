/*
 * Bank.java
 *
 */
public class Bank {
  private final Account[] accounts;
  private int size;

  private static final int SAVINGS = 0;
  private static final int CHECKING = 1;
  private static final int SENIOR = 0;
  private static final int ADULT = 1;
  private static final int STUDENT = 2;

  /** Creates a new instance of Bank */
  public Bank() {
      accounts = new Account[100];
      size = 0;
  }

  /********************************************************************
   * Creates a new account.
   * pre: customer information must be not null and types must be valid
   * post: New account added to bank
   * @param customerName String Account owner's name
   * @param customerAddress String Owner's address
   * @param customerAge int Owner's age (in years)
   * @param customerPhoneNumber String Owner's phone number
   * @param customerType int Owner's type of customer within bank
   * @param typeAccount int Account type (savings or checking)
   * @return String New account number
   */
  public String addAccount(String customerName, String customerAddress, int customerAge, String customerPhoneNumber, int customerType, int typeAccount) {
      String accountNumber;
      Customer customer;

      if (customerType == SENIOR) {
          customer = new Senior(customerName, customerAddress, customerAge, customerPhoneNumber, generateCustomerNumber());
      } else if (customerType == ADULT) {
          customer = new Adult(customerName, customerAddress, customerAge, customerPhoneNumber, generateCustomerNumber());
      } else {
          customer = new Student(customerName, customerAddress, customerAge, customerPhoneNumber, generateCustomerNumber());
      }

      if (typeAccount == SAVINGS) {
          accounts[size] = new SavingsAccount(generateAccountNumber(), customer);
      } else {
          accounts[size] = new CheckingAccount(generateAccountNumber(), customer);
      }
      accountNumber = accounts[size].getAccountNumber();
      size++;
      return accountNumber;
  }

  /***********************************************************************
   * Make a deposit into account.
   * pre: amount must be a positive integer
   * post: Account's balance increases
   * @param accountNumber String Account's number
   * @param amount double Amount to deposit
   * @return double New balance
   */
  public double makeDeposit(String accountNumber, double amount) {
      int index = find(accountNumber);
      accounts[index].deposit(amount);
      return accounts[index].getBalance();
  }

  /***********************************************************************
   * Make a withdrawal from account.
   * pre: amount must be a positive integer
   * post: Account's balance decreases
   * @param accountNumber String Account's number
   * @param amount double Amount to withdraw
   * @return double New balance
   */
  public String makeWithdrawal(String accountNumber, double amount) {
      int index = find(accountNumber);
      if (index == -1) {
          return "Account not found";
      }
      Account account = accounts[index];
      double currentBalance = account.getBalance();
      if (amount > currentBalance) {
          return "Insufficient funds";
      }
      account.withdraw(amount);
      return "New balance: " + account.getBalance();
  }

  /***********************************************************************
   * Returns account information as a string so it can be displayed
   * @param accountNumber String Account's number
   * @return String Account information as a String object
   */
  public String getAccount(String accountNumber) {
      int index = find(accountNumber);
      return accounts[index].toString();
  }

  /***********************************************************************
   * Given an account number tells if the account exists or not
   * @param accountNumber String Account's number
   * @return int TRUE if accountNumber exists in accounts[]. Otherwise, -1.
   */
  private int find(String accountNumber) {
      for (int i = 0; i < size; i++) {
          if (accounts[i].getAccountNumber().equals(accountNumber)) {
              return i;
          }
      }
      return -1;
  }

  /** Generates a new unique account number */
  private String generateAccountNumber() {
      return "A" + (size + 1);
  }

  /** Generates a new unique customer number */
  private String generateCustomerNumber() {
      return "C" + (size + 1);
  }
}