import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import sg.bankAccountKata.entities.BankAccount;
import sg.bankAccountKata.entities.Client;
import sg.bankAccountKata.service.impl.OperationService;

public class Test {

	static Logger logger = Logger.getLogger (Test.class.getName()); 
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger logger = Logger.getLogger (Test.class.getName()); 
		OperationService service = new OperationService(); 
		
		Client client =  new  Client(new Integer(0),  "GHARBI", "Maroua", new Date (), " 1 Parvis de la Bievre ", "0666329077") ; 
		BankAccount bankAccount = new BankAccount();
		bankAccount.setClient(client);
		logger.log(Level.INFO, "the customer bank account has been created");

		service.deposit(bankAccount, new Double (6555));
		logger.log(Level.INFO, "	★	★	★	★	★	★	★	★	★	★	★	★");
		logger.log(Level.INFO, "the customer has deposited 6555 EUR in his bank account");

		service.deposit(bankAccount, new Double (345));
		logger.log(Level.INFO, "	★	★	★	★	★	★	★	★	★	★	★	★");
		logger.log(Level.INFO, "the customer has deposited 345 EUR in his bank account");

		service.withdraw(bankAccount,new Double (5000) );
		logger.log(Level.INFO, "	★	★	★	★	★	★	★	★	★	★	★	★");
		logger.log(Level.INFO, "the customer has withdrawn 5000 EUR from his bank account"); 
		logger.log(Level.INFO, "	★	★	★	★	★	★	★	★	★	★	★	★");
		logger.log(Level.INFO, " list of operations performed by the customer");
		service.allOperations(bankAccount);
		 logger.log(Level.INFO, service.allOperations(bankAccount).toString());
	}

}
