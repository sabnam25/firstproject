package exception;

public class Sum {
	public static void main(String args[]) {
		try {
			int num1=10;
			int num2=0;
			System.out.println(num1/num2);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("division");
		}
		System.out.println("end");
	}

}
