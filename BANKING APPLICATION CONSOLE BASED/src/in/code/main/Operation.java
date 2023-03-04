package in.code.main;

import java.util.Scanner;

public class Operation {
	public static void bankinfo() {
		Scanner scan = new Scanner(System.in);
        System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------------------------------------");
	    System.out.println(" ***Banking System Application***");
	    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------------------------------------------");
	   
	    System.out.println(" 1. Create a new account  \n 2. Check Balance\n 3. Deposit the amount \n 4. Withdraw the amount  \n 5. Watch demo account \n 6. Exit  \n   Enter your choice:: "); 
	    int key=scan.nextInt();
	    operation( key);
	    
	   
	}
		public static void operation(int key){
			BANKDETAILS bank = new BANKDETAILS();
			Scanner scan = new Scanner(System.in);
			process bankprocess = new process();
			 switch (key) {
				case 1:
					bankprocess.openAccount();
					System.out.println("MAIN PAGE_:: PRESS 1 ::");
					if (scan.nextInt()==1) 
						bankinfo();
					break;
				case 2:
					System.out.println("Your name is :: "+bank.getName());
					System.out.println("Your balance  is :: "+bank.getBalance());
					System.out.println("THANKS FOR BALANCE CHECKING ");
					System.out.println("MAIN PAGE_:: PRESS 1 ::");
					if (scan.nextInt()==1) 
						bankinfo();
					break;
				case 3:
					System.out.println("WELCOME TO DEPOSITE PAGE ");
					bankprocess.deposite();
					System.out.println("MAIN PAGE_:: PRESS 1 ::");
					if (scan.nextInt()==1) 
						bankinfo();
					break;
				case 4:
					System.out.println("MAIN PAGE_:: PRESS 1 ::");
					bankprocess.withdraw();
					if (scan.nextInt()==1) 
						bankinfo();
					break;
				case 5:
					System.out.println("MAIN PAGE_:: PRESS 1 ::");
					bankprocess.demoaccount();
					if (scan.nextInt()==1) 
						bankinfo();
					break;
				case 6:
					System.out.println("THANKS FOR USING OUT BANK APPLICATION");
					break;
				}
		}

}
