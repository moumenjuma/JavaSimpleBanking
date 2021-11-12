import java.util.Scanner;
public class Account {
	//Variables below
	double balance;
	double preTran;
	String customerName;
	String customerID;
	
	//Constructor
	Account(String cname, String cid){
		customerName=cname;
		customerID=cid;
	}
	
	//Function Deposits money
	void deposit(double amount) {
		//if statement says if amount enters does not equal too 0 then continue
		if (amount !=0) {
			balance = balance + amount;
			preTran=amount;
		}
	}
	
	//Function Withdraws money
	void withdraw(double amount) {
		//if statement says if amount enters does not equal too 0 then continue 
		if (amount!=0) {
			balance = balance - amount;
			preTran=-amount;
		}
	}
	
	//Function will show previous transaction
	void getPreTran() {
		if (preTran>0) {
			System.out.println("Deposited: "+ preTran);
		}else if (preTran<0) {
			System.out.println("Deposited: "+ Math.abs(preTran));
		}else {
			System.out.println("No Transaction Occurred");
		}
	}
	
	//Function Calculating Interest
	void calInt(int years) {
		double intRate=0.0235;
		double newBal= (balance *intRate*years) +balance;
		System.out.println("the currect Interest Rate is "+ (100 * intRate)+"%");
		System.out.println("After "+ years+ "years, you balance will be: "+ newBal);
	}
	//Main Menu Function
	void showMenu() {
		char option='\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome, "+customerName+ "!");
		System.out.println("Your ID is: "+ customerID);
		do {
			System.out.println("Please choose one of the options below: ");
			System.out.println("A.check your blance\n"+"B.make Deposit\n"+"C.Make Withdrawal\n"+"D.View Previos Transaction\n"+"E.Calculate Interest\n"+"F.Exit");
		
		
			System.out.println();
			System.out.print("Enter an option: ");
			char option1 = scanner.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			
			switch(option) {
			case 'A':
				System.out.println("================================");
				System.out.println("Balance: $"+balance);
				System.out.println("================================");
				System.out.println();
				
				break;
			case 'B':
				System.out.println("Enter Amount for deposit: ");
				int amount= scanner.nextInt();
				deposit(amount);
				System.out.println();
				break;
			case 'C':
				System.out.println("Enter Amount for Withdrawal");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println();
				break;
			case 'D':
				System.out.println("================================");
				getPreTran();
				System.out.println("================================");
				System.out.println();
				break;
			case'E':
				System.out.println("Enter how many years of accured interest");
				int years = scanner.nextInt();
				calInt(years);
				System.out.println();
				break;
			case'F':
				System.out.println("================================");
				System.out.println("See you again next time "+ customerName);
				System.out.println();
			}
		}while(option!='F');
		System.out.println("Thank you for banking with us!");	
	}
}
