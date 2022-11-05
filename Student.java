package exception;

//import java.util.Scanner;

public class Student {
	public static void main(String args[]) throws MailException{
		try{
			String mail="sabnam@gmail.com";
			if(mail=="@gmail.com") {
			
			throw new MailException("this is not agmailaccount");
			
		}else {
			System.out.println("this is  a gmailaccount");
		}
		
	}
	catch(MailException Me) {
		Me.printStackTrace();
	}

}
}