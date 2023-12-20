package ExceptionHandling;

import java.util.Scanner;
import ExceptionHandling.BankAccount.InsufficientBalanceException;
import ExceptionHandling.BankAccount.PinMismatchException;

public class BankController {

	public static void main(String[] args) throws PinMismatchException, InsufficientBalanceException {
		Scanner scn = new Scanner(System.in);
		BankAccount[] accContainer = new BankAccount[3];

		accContainer[0] = new BankAccount("Sudhir", "SBIN00258668", 054354354, 54687.256, 1234);
		accContainer[1] = new BankAccount("Karan", "ICIN00456446", 354654646, 35.006, 2345);
		accContainer[2] = new BankAccount("Arjun", "ICIN0045046", 1234567891, 659874, 3456);

		System.out.println("Welcome to the Banking Portal");
		System.out.print("Enter your 4 digit PIN: ");
		int pin = scn.nextInt();
		int choice = 4;

		do {
			for (int index = 0; index < accContainer.length; index++) {

				try {
//         ======================1st Outer try begins here===============================================================

					if (accContainer[index].checkPin(pin)) {

						System.out.println("================================================================================");
						System.out.println("Hello! , " + accContainer[index].getCustName());
						System.out.println("You are on menu page...");
						System.out.println("IFSC number : " + accContainer[index].getIfsc());
						System.out.println("Account number : " + accContainer[index].getAccno());
						System.out.println(
								"================================================================================");

						System.out.println("press 1 to Check Balance");
						System.out.println("press 2 to Deposit");
						System.out.println("press 3 to Withdraw");
						System.out.println("press 4 to Exit");
						System.out.print("please select any one option from above :  ");
						choice = scn.nextInt();
//         ======================2nd Inner try begins here===============================================================
						try {

							if (choice == 1) {
								System.out.println(
										"================================================================================");
								System.out.println("Your balance is: " + accContainer[index].getBalance());
								break;
							}

							else if (choice == 2) {
								System.out.print("Enter amount to deposit: ");
								double depositAmount = scn.nextDouble();
								accContainer[index].deposit(depositAmount);
								System.out.println("Deposit successful");
								break;
							}

							else if (choice == 3) {
								System.out.print("Enter amount to withdraw: ");
								double withdrawAmount = scn.nextDouble();
								accContainer[index].withdraw(withdrawAmount);
								System.out.println("Withdrawal successful");
								break;
							} else if (choice == 4) {
								System.out.println("Exiting... Thank you for using!");
							}

							else {
								System.out.println("Invalid choice. Please try again.");
							}
							
						}
//     	================ closing 2nd (inner) try here... ==================================================

						catch (InsufficientBalanceException exp) {
							System.out.println(exp.getMessage());
							break;
						}

						catch (Exception exp) {
							exp.printStackTrace();
							break;
						}

					}
						
					
				}
//    	================ closing 1st (outer) try here... ==================================================

				catch (PinMismatchException exp) {
					System.out.println(exp.getMessage());
					break;

				}

				catch (Exception exp) {
					exp.printStackTrace();
					break;
				}

				finally {
						System.out.println("Resources are being closed");						
					
				}
				
			}
//    =====================for loop ended above ==========================================================
		}while(choice!=4);
//    =====================while loop ended above =========================================================
	}
//    =====================main method ended here =========================================================

}
