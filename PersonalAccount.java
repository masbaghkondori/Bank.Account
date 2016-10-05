package Assignment04;



import java.util.UUID;

public class PersonalAccount extends BankAccount{
	public PersonalAccount() {	
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Personal account");
	}
}
