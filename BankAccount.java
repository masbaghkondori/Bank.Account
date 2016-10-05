package Assignment04;
import java.util.UUID;

public class BankAccount implements BankOperations{
	
	private String accountNumber = "";
	
	private double balance = 0;
	private String accountType = "";
	
	public BankAccount() {	
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.balance = 0;
		this.accountType = "Bank account";
	}	
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public void withdrawMoney(double amount) {
		if (amount>=0){
			setBalance(this.balance - amount);
		}else{
			System.out.println("You can not withdraw a negative value!");
		}
				
	}
	
	public void depositMoney(double amount) {
		if (amount>=0){
			setBalance(getBalance() + amount);
		}else{
			System.out.println("You can not deposit a negative value!");
		}
		
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", accountType=" + accountType + "]";
	}	
	
	
	
	
	

}
