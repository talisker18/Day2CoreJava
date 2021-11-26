package homework;

/*
 * 1. saving account has a limit to withdraw of 5000 at once
 * 2. current has no limit
 * note: 
 * 	if balance is less than withdraw amount then display "insufficient balance"
 * 	if withdraw amount is greater than limit 5000, then "withdraw attempt failed"
 * */

interface IBankAccount{
    void deposit(double amount);
    void withdraw(double amount);
    void balance();
}
