/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class JavaBankMain {
    public static double total;
    
    public static void displaySubMenu(){
        System.out.println();

}
    public static void newAccount(){
        
        Scanner kb = new Scanner(System.in);
        Bank bank = new Bank();
        
        Random rand = new Random();
        
         System.out.println("\nCreate new Account, fill out information.");
                    System.out.println("What type of account would you like to open? "
                    + "\n1. Checking"
                    + "\n2. Savings");
                    int choice = kb.nextInt();
                    
	            System.out.print("First Name: ");
	            String newFname = kb.next();

	            System.out.print("Last Name: ");
	            String newLname = kb.next();
                    
                    System.out.print("initial Amount: $ ");
	            double amount = kb.nextDouble();

	            System.out.print("User Name: ");
                    String userName = kb.next();
	          
                    int aNum = rand.nextInt(100000)+ 1;
                    System.out.println("Account #:" + userName + aNum  );

	            System.out.print("Password: ");
	            String newPass = kb.next();
                    
                    
                   String result = bank.addAccount(choice, newFname, newLname, newPass, aNum, amount);
                   
                   total = getBankInfo(bank);
               
                   
                   System.out.println(result);
                   
                   System.out.println(bank.printBankInfo());
                  //2 System.out.println(bank);

    
    }
    
    public static double getBankInfo(Bank b){
        double total = b.getTotalBal();
        return total;
    }
    
    public static boolean accExists(){
        Bank bank = new Bank();
        
        return false;
    }
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);
        Boolean loggedIn = false;
        String Username,Password;
        int input1;
        do{
	        do{
           System.out.println("_______________________________________________________________________"
	                + "\n Welcome to the Java Bank. Are you an existing memeber? Or a new User?"
	                + "\n\n Enter: 1 (Login - Already have an account)"
	                + "\n Enter: 2 (Create new Account)"
	                + "\n Enter: 3 (Exit; Are you sure you would like to exit? )"
	                + "\n_______________________________________________________________________"
	                + "\n");

	        System.out.print("Navigation Choice: ");
	        input1 = userInput.nextInt();
                if(input1 < 1 || input1 > 3){
                    JOptionPane.showMessageDialog(null, "Error: That is an invalid Choice");
                }
                switch(input1){
                    case 1:      
                   Scanner kb = new Scanner(System.in);  
                   System.out.print("Username: ");
	           String newUsername = kb.next();
                    
                   System.out.print("Password: ");
	           String newPass = kb.next();
                    
          int input2 = 0;
          while(input2 !=5) {
                    System.out.println("\n Successfully Logged in as " + newUsername
                            + "\n\nOptions:"
	                    + "\n       1. View your Current Funds."
	                    + "\n       2. Deposit Funds."
	                    + "\n       3. Withdraw Funds."
	                    + "\n       4. Transfer money:"
                            + "\n       5. Exit Java Bank: ");
	      
	        System.out.print("\nSelect Option: ");
	        Scanner LoggedInUserInput = new Scanner(System.in);
	        input2 = LoggedInUserInput.nextInt();
                
             //String result = bank.addAccount(choice, newFname, newLname, newPass, aNum, amount);
                
                //VIEW CURRENT FUNDS
                 //sum = accounts.get(i).getAmount(); 
	        if (input2 == 1) {
                    System.out.println("Current Funds: $ " + total);
                }
	        //DEPOSIT
              if (input2 == 2)  {
	            int deposit = 0;
	            System.out.print("Enter deposit amount: ");
                    Scanner depositAmount = new Scanner(System.in);
	            deposit = depositAmount.nextInt();

	            System.out.println("$" + deposit + " has been added to your account.");
	            System.out.println("\nCurrent Funds: $" + ( deposit + total));
                    total = deposit + total;

	        }
              
	        //WITHDRAW1
	        if (input2 == 3) {
	            double withdraw = 0.0 ;
	            System.out.print("Enter Withdraw amount: ");
                    Scanner withdrawAmount = new Scanner(System.in);
	            withdraw = withdrawAmount.nextInt();

	            System.out.println("$" + withdraw + " has been taken out of your account.");
	            System.out.println("\nCurrent Funds: $" + (total - withdraw));
                    total = total - withdraw;

	        }

	        //close program
	        //ask user the account number they want to transfer funds too
	        //then ask user how much to transfer
	        //DOES NOT YET CHECK AVAILABLE FUNDS - error checking
	        //DOES NOT YET UPDATE TOTAL FUNDS 
	        if (input2 == 4) {
	            //int accountNum = 0;
	            double transferAmount = 0.0;
	            
                    
	            //accountNum = accountNum.nextInt();
	           System.out.println("Enter amount you would like to transfer to Account: $ " );
	             Scanner transferAmountJ = new Scanner(System.in);
                        double transfer = transferAmountJ.nextDouble();
                    //Scanner transferAmount = new Scanner(System.in);
                    // transferAmount = transferAmount.nextInt();
	           System.out.println("Enter the Account you would like to transfer too: 1 for checking, 2 for savings: ");
                    Scanner checkingAccount = new Scanner(System.in);
                        double checking = checkingAccount.nextDouble();
                        if (checking ==1 ){
                       System.out.println("$" + transfer + " has been transferred to Account:  " +
                               "\n Current funds: $" + (total + transfer));
                        }
                        /*
                        FUTURE PLANS WHEN INFORMATION IS STORED
                        if (checking ==2){
                            System.out.println("$" + transfer + " has been transferred to Account: Savings " +
                                    "\n Current funds in savings: $" + total + transfer);
                        }*/
	        }
                if (input2 == 5 ){
                    System.out.println("Thank you for using Java bank!");
                    
                System.exit(0);
                } 
              

        } 
                    break;
                    case 2: newAccount();
                      while (loggedIn == false) {
	                System.out.println("\nPlease re-enter your Username and Password for validation:");
	                System.out.print("\nUsername: ");
	                 Username = userInput.next();

	                System.out.print("Password: ");
	                Password = userInput.next();

	                loggedIn = true;
	            }

	        
                    break;
                    case 3: System.exit(0);
                    break;
                }
                }while(input1 < 1 || input1 > 3);
        }while(input1 != 3);
                
        
        

  
    
    }
}
        
        
        
