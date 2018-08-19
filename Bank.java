/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import account.AccountJ;
//import account.*;
//import account.AccTypeJ;
import java.io.IOException;
import java.util.ArrayList;
 //account;

public class Bank implements BankInterface {
    private int numChecking;
    private int numSavings;
    private String type;
    private ArrayList<AccountJ> accounts = new ArrayList<>();
    //private Double[] banks=new Double[100];
    //int i=0;
    
    Bank(){
        numChecking = 0;
        numSavings = 0;
        type = "";
        accounts = new ArrayList<>();
    }
    

    /**
     * This will do STUFF
     * @param choice
     * @param fname
     * @param lname
     * @param pass
     * @param anum
     * @param amount
     * @return 
     */
    @Override
    public String addAccount(int choice, String fname, String lname, String pass, int anum, double amount) {
       
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch (choice) {
            case 1:
                //type.equalsIgnoreCase("Checking");
                accounts.add(new CheckingJ(AccTypeJ.fromString("Checking"), fname , lname, pass, anum, amount));
                
                //banks[i]=amount;
                //i=i+1;
                numChecking++;
                return "Succes!!";
            case 2:
                // type.equalsIgnoreCase("Savings");
                accounts.add(new SavingsJ(AccTypeJ.fromString("Savings"),fname ,lname, pass, anum, amount));
                numSavings++;
                break;
            default:
                return "Added";
        }
        return null;
                
    }
    
    @Override
    public double calculateInterest(){
        return 0.0;
        
    }
    
    @Override
    public double getTotalBal(){
        double sum = 10.0;
       // int j;
        // int [] currArray = new int[accounts.size()];
        for(int i = 0; i <accounts.size(); i++){
         // sum=sum+banks[i];
           sum = accounts.get(i).getAmount(); 
           //System.out.println(accounts.get(i).getAmount());
        }
     return sum;   
    }
    
    
    

    @Override
    public int getNumChecking() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return numChecking;
    }

    @Override
    public int getNumSavings() {
        return numSavings; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String printBankInfo() {
       //To change body of generated methods, choose Tools | Templates.
       return "Checking accounts: "+ getNumChecking() + "\nSavings: " + getNumSavings() + "\nTotal Balances: $ "+getTotalBal();
    }
    /**
     * 
     * @return account to string
     */
    @Override
    public String toString(){
       return accounts.toString();
    }

  
    
    
    
}
