package sg.bankAccountKata.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {

	private Integer  id;
	private Double balance;
	private Date creationDate;
	private Client client ;
	private List<Operation> operations ; 
	 
	
	public BankAccount(Integer id, Double balance, Date creationDate, Client client, ArrayList<Operation> operations) {
		super();
		this.id = id;
		this.balance = balance;
		this.creationDate = creationDate;
		this.client = client;
		this.operations = operations;
	}
	public BankAccount() {
		this.creationDate = new Date();
		this.balance = 0d;
		this.operations = new ArrayList<>();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<Operation> getOperations() {
		return operations;
	}
	public void setOperations(Operation operations) {
		this.operations.add(operations);
	}
	
	 
}
