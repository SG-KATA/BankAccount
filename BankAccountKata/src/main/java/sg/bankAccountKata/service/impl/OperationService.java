package sg.bankAccountKata.service.impl;

import java.util.logging.Logger;

import sg.bankAccountKata.entities.BankAccount;
import sg.bankAccountKata.entities.Operation;
import sg.bankAccountKata.entities.enums.OperationType;
import sg.bankAccountKata.service.IOperations;

public class OperationService implements IOperations {

	Logger logger = Logger.getLogger (OperationService.class.getName()); 
	 static Integer count = 0;
	@Override
	public void deposit(BankAccount bankAccount, Double amount) {
		
		Operation operation = new Operation(OperationType.DEPOSIT, amount);
		operation.setId(count);
		count = count +1;
		bankAccount.setOperations( operation);
        bankAccount.setBalance(bankAccount.getBalance() + amount);
       
	}

	@Override
	public void withdraw(BankAccount bankAccount, Double amount) {

		amount = amount > 0 ? (-1 * amount) : amount;

        Operation operation = new Operation(OperationType.WITHDRAWAL, amount);
        operation.setId(count);
        count = count +1;
        bankAccount.setOperations( operation);
        bankAccount.setBalance(bankAccount.getBalance() + amount);    

	}

	@Override
	public StringBuilder allOperations(BankAccount bankAccount) {
		
		StringBuilder operationList = new StringBuilder("Client : FirstName : "); 
		operationList.append(bankAccount.getClient().getFirstName()) ; 
		operationList.append(" Last Name ") ; 
		operationList.append(bankAccount.getClient().getLastName()) ; 
		operationList.append("\n") ; 
		operationList.append(" Account Balance "+bankAccount.getBalance()) ;
		operationList.append("\n") ; 
		operationList.append(bankAccount.getOperations());
	
		return operationList; 
	}

	@Override
	public Double getBalance(BankAccount bankAccount) {
		 return bankAccount.getBalance();
	}

	

}
