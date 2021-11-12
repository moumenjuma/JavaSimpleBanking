import java.util.Scanner;

public class JavaBank {
	public static void main (String[] args) {
		
		
		Scanner x = new Scanner(System.in);
		System.out.println("Please Enter Name");
		String xn = x.nextLine();
		
		
		Scanner y = new Scanner(System.in);
		System.out.println("Please Enter ID Number");
		String yn = y.nextLine();

		Account moe = new Account(xn, yn);
		moe.showMenu();
		
	}

}
