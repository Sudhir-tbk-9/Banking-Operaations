package ExceptionHandling;
import java.util.Scanner;

import ExceptionHandling.BankAccountInteg.*;

public class IntegratedBankingApp { 


		public static void main(String[] args) throws PinMismatchException, InsufficientBalanceException {
			Scanner scn = new Scanner(System.in);
			BankAccountInteg[] accContainer = new BankAccountInteg[3];

			accContainer[0] = new BankAccountInteg("Sudhir", "SBIN00258668", 054354354, 54687.256, 1234);
			accContainer[1] = new BankAccountInteg("Karan", "ICIN00456446", 354654646, 35.006, 2345);
			accContainer[2] = new BankAccountInteg("Arjun", "ICIN0045046", 1234567891, 659874, 3456);

			System.out.println("Welcome to the Banking Portal");
			System.out.print("Enter your 4 digit PIN: ");
			int pin = scn.nextInt();
			int choice  ;

			
			int index = findMatchingPin(accContainer, pin);
					try {
//	         ======================1st Outer try begins here===============================================================	 	
							if (index != -1) {
				                BankAccountInteg account = accContainer[index];
							System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
							System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
							System.out.println("Hello! , " + account.getCustName());
							System.out.println("You are on menu page...");
							System.out.println("IFSC number : " + account.getIfsc());
							System.out.println("Account number : " + account.getAccno());
							System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
							System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
						
							while(true){  
							System.out.println("press 1 to Check Balance");
							System.out.println("press 2 to Deposit");
							System.out.println("press 3 to Withdraw");
							System.out.println("press 4 to Exit");
							System.out.print("please select any one option from above :  ");
							
							choice = scn.nextInt();
							
//	         ======================2nd Inner try begins here===============================================================
							try {

								if (choice == 1) {
									System.out.println("================================================================================");
									System.out.println("Your balance is: " + account.getBalance());
									
								}

								else if (choice == 2) {
									System.out.println("Your balance is: " + account.getBalance());
									System.out.print("Enter amount to deposit: ");
									double depositAmount = scn.nextDouble();
									account.deposit(depositAmount);
									System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
									System.out.println("|  Deposit successful  |");
									System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
									
								}

								else if (choice == 3) {
									System.out.println("Your balance is: " + account.getBalance());
									System.out.print("Enter amount to withdraw: ");
									double withdrawAmount = scn.nextDouble();
									account.withdraw(withdrawAmount);
									System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
									System.out.println("| Withdrawal successful |");
									System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
									
								} 
								else if (choice == 4) {
									System.out.println("Exiting... Thank you for using!");
									break;
								}

								else {
									System.out.println("Invalid choice. Please try again.");
								}
								
							}
//	     	================ closing 2nd (inner) try here... ==================================================

							catch (InsufficientBalanceException exp) {
								System.out.println("###########################################");
								System.out.println(" " + exp.getMessage() + " ");
								System.out.println("###########################################");
								
							}

							catch (Exception exp) {
								exp.printStackTrace();
								
							}

								}
//	    =====================  while loop ended above =========================================================
							
							}  else {
								System.out.println(" Warning : You entered wrong password... "); 
							  }
						
					}
//	    	================ closing 1st (outer) try here... ==================================================

					finally {
							System.out.println("Resources are being closed");						
					}
								
		}
//===============================main method ended here =========================================================
		
		public static int findMatchingPin(BankAccountInteg accContainer[] , int userPin) throws PinMismatchException {
			for (int i = 0; i < accContainer.length; i++) {	
			try {	
				if (accContainer[i].checkPin(userPin)) {
						return i;
					}
			}
			catch(PinMismatchException exp ) {
				System.out.println(exp.getMessage());	
				exp.printStackTrace();
				}
			catch (Exception exp) {
				exp.printStackTrace();
			
			}
				}
					return -1;
		}
	}
	



	



	
