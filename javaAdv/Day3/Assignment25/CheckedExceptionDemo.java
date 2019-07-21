package javaAdv.Day3.Assignment25;

public class CheckedExceptionDemo {
	public static void main(String arg[]) { 
		try {
			Class.forName("javaAdv.Day2.Assignment25.ExceptionDemo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception :"+e);
		} 
		} 

}
