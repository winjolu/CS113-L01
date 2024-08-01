/*
 * SavingsAccount.java
 *
 */
public class SavingsAccount extends Account{

 /** Creates a new instance of SavingsAccount */


 /***********************************************
 * Adds amount to balance
 * pre: amount must be a positive value
 * post: balance increases in amount value
 * @param amount double Deposit amount
 * @return double New account balance
 */
 @Override
 public double deposit(double amount){
// add an new transation to the array transactions with customer number, 0 trantyp, amount, fees "DEP"

// add the amoun to the balance

// call the addinterest method

// add one to the tranIndex

// return balance

 }

 /***********************************************
 * Substracts amount from balance
 * pre: amount must be a positive value
 * post: balance decreases in amount value
 * @param amount double Withdrawal amount
 * @return double New account balance
 */
 public double withdrawal(double amount){
   // add an new transation to the array transactions with customer number, 0 trantyp, amount, fees "CR"

   // subtract the amount from the balance

   // add one to the tranIndex

   // return the balance

 }
 /***********************************************
 * Adds amount to balance
 * pre: amount must be a positive value
 * post: balance increases in amount value
 * @return double New account balance
 */
 public double addInterest(){
  // create an amount from the balance times the customer savings interest
   

  // add an new transation to the array transactions with customer number, 0 trantyp, amount, fees "CR"

   // add the amount to the balance


   // add one to the tranIndex

   // return the balance

 }
}