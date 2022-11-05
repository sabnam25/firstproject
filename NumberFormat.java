package exception;

public class NumberFormat {
public static void main(String args[]) {
	try{
		int a=10;
	
	String b="10.5";
	int c=Integer.parseInt(b);
	}
	catch(NumberFormatException Nf) {
		Nf.printStackTrace();
	}
	System.out.println("sample program");
}
}

