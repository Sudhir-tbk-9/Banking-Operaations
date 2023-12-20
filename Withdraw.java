package ExceptionHandling;

import java.util.Scanner;

class Withdraw{
public static void main(String[] args){

Scanner scn= new Scanner(System.in);

System.out.println("please enter your password");
int p = scn.nextInt();

if(p==123)
{
System.out.println("Password matched. Please enter amount to withdraw");

int amt=scn.nextInt();
if(amt>=500){
System.out.println("Please collect your money");
}
else{
System.out.println("Invalid amount entered, please try again");
}

}
else {
System.out.println("Password is incorrect. Please try again");
}




}
}