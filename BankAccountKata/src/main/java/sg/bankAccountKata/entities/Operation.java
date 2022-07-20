package sg.bankAccountKata.entities;

import java.time.LocalDateTime;

import sg.bankAccountKata.entities.enums.*;

public class Operation {
	

	private Integer id;

	
	private OperationType type;

	
	private Double amount;

	private LocalDateTime date;


	public Operation() {
		this.date = LocalDateTime.now();
	}
	
	public Operation(OperationType type, Double amount) {
		this.type = type;
		this.amount = amount;
		this.date = LocalDateTime.now();
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public OperationType getType() {
		return type;
	}

	public void setType(OperationType type) {
		this.type = type;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Operations List [id=" + id + ", type=" + type + ", amount=" + amount + ", date=" + date + "]" +"\n";
	}

}
