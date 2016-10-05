package Assignment04;

import java.util.UUID;

public class SavingAccount extends BankAccount{
	public SavingAccount() {	
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Saving account");
	}
}
