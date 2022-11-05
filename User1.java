package exception;

public class User1 {
	public static void main(String args[]) throws AgeException{
		try {
			int age=13;
			
			
			if(age<=18) {
		throw new AgeException("not eligible") ;
			}
		else {
	
				System.out.println("eligible");
			}
		}
		catch(AgeException Ae) {
			Ae.printStackTrace();
		}
			
	}
}


