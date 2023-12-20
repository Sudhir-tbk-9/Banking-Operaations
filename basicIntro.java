package ExceptionHandling;

public class basicIntro {
public static void main(String[] args) {
	
	System.out.println("Start of Main"); // 

	String s = "java"; // s = "java" null
	System.out.println(s); // java
	System.out.println("Length of String is : " + s.length()); // LOSI: 4
	System.out.println("-----------------------------------"); // ---------
	s = null; // re initialize the value of s
	System.out.println(s);// null

	try {
		System.out.println("Length of String is : " + s.length()); // throw new NPE();
	} catch (ArithmeticException exp) { // AE exp = new NPE(); // invalid agrs
		exp.printStackTrace();
	} catch (NullPointerException exp) { // NPE exp = new NPE() ; // Valid
		// exp.printStackTrace(); // ExceptionName,Descp,Location
		// System.out.println(exp.getMessage()); // only descor reason

		System.out.println(exp.toString()); // only Exception Name and Reason

	} catch (Exception exp) {// Exception exp = any child exp object
		exp.printStackTrace();
	}

	System.out.println("Process the rest of the instructions....");
	System.out.println("End of Main"); //
	
}
}
