package in.code.main;

import java.util.Scanner;

public class process {
 Scanner sc = new Scanner(System.in);  
 static BANKDETAILS bank1 = new BANKDETAILS();

    static {
    	bank1.setAccno("87643682497638");
    	bank1.setName("MANI DEMO");
    	bank1.setAcc_type("SAVING");
    	bank1.setBalance(986146187);
  
    }
    public void openAccount() {  
        System.out.print("Enter Account No: ");  
        bank1.setAccno(sc.next()); 
        System.out.print("Enter Account type: ");  
        bank1.setAcc_type(sc.next());
        System.out.print("Enter Name: ");  
        bank1.setName(sc.next());
        System.out.print("Enter Balance: ");  
        bank1.setBalance(sc.nextLong());
        
        System.out.println("------YOUR ACCOUNT DETAILS IS -------");
        System.out.println("Name of account holder :: " + bank1.getName());  
        System.out.println("Account no             :: " + bank1.getAccno());  
        System.out.println("Account type           :: " + bank1.getAcc_type());  
        System.out.println("Balance                :: " + bank1.getBalance());  
        
    } 
    public void demoaccount() {
    	int  demobalance=50000;
    	System.out.println("Name of account holder :: " + "Demo user");  
        System.out.println("Account no             :: " + "9878987898");  
        System.out.println("Account type           :: " + "demo");  
        System.out.println("Balance                :: " + demobalance);  
    	
    }
    public void deposite(){
    	System.out.println("Enter the Amount you want to deposit ::");
		int deposit =sc.nextInt();
		int amount =(int) ((bank1.getBalance())+deposit);
		bank1.setBalance(amount);
		System.out.println(" "+ deposit+" is deposited into your Account");
		System.out.println("Current Available Balance is Rs = "+ bank1.getBalance());
		
    }
    public void withdraw() {

    	System.out.println("Enter the Amount you want to withdraw:");
		Scanner sc= new Scanner(System.in);
		int withdraw =sc.nextInt();
		if(withdraw<bank1.getBalance())
		{
			bank1.setBalance(bank1.getBalance()-withdraw);
			System.out.println(" "+ withdraw+" is withdrawn from your Account");
			System.out.println("Current Available Balance is Rs  ::"+ bank1.getBalance());
		}
		else
		{
			System.out.println("Low Balance");
			System.out.println("Current Available Balance is Rs  ::"+ bank1.getBalance());
		}
    }
	public void checkbalance() {
		System.out.println("Your name is           :: "+bank1.getName());
        System.out.println("Account no             :: " + bank1.getAccno());  
        System.out.println("Account type           :: " + bank1.getAcc_type());  
	    System.out.println("Balance                :: " + bank1.getBalance());  
		System.out.println("THANKS FOR BALANCE CHECKING ");
		
	}
    

}
