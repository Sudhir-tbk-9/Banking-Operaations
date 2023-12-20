package ExceptionHandling;

public class BankAccountInteg {


	private String custName ;
	private String ifsc ;
	private long accno ;
	private double balance ; 
	private int userPin ;
	
	
	public BankAccountInteg(String custName, String ifsc, long accno, double balance, int userPin) {

		this.custName=custName;
		this.ifsc=ifsc;
		this.accno=accno;
		this.balance = balance ;
		this.userPin = userPin;
		
	}

	public String getCustName() {
		return custName;
	}

		public String getIfsc() {
		return ifsc;
	}


	public long getAccno() {
		return accno;
	}

	public double getBalance() {
		return balance;
	}


	public int getUserPin() {
		return userPin;
	}

//	=================================================================
	
	public void withdraw(double withdrawAmount) throws InsufficientBalanceException {
		if (withdrawAmount > this.balance) {
			throw new InsufficientBalanceException();
		}
		else {
			this.balance = this.balance - withdrawAmount ;
			System.out.println("New balance in account is : " + this.balance);
		}
		
	}

//	======================================================================================
	public void deposit(double amount) {
        this.balance = this.balance +  amount;
        System.out.println("New balance in account is : " + this.balance);
    }
//	==============================================================================================
	public boolean checkPin(int pinToMatch) throws PinMismatchException {
		
			return this.userPin == pinToMatch  ;
		}
}


// =================================================================================
// ============================================================================================
	
	 class InsufficientBalanceException extends Exception {
		
		public InsufficientBalanceException() {
		  
						super("|  Insufficient Balance In Your Account  |");
						
		}
	}
	
// =================================================================================
// ============================================================================================

	 class PinMismatchException extends Exception {
		 
		 public PinMismatchException() {
			 super("Warning : You have entered wrong pin ... ");
    }
}




