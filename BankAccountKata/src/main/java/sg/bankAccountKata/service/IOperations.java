package sg.bankAccountKata.service;

import sg.bankAccountKata.entities.BankAccount;

public interface IOperations {

	 public void deposit(BankAccount bankAccount, Double amount);

	 public void withdraw(BankAccount bankAccount, Double amount);

	StringBuilder allOperations(BankAccount bankAccount);

	Double getBalance(BankAccount bankAccount);
}
