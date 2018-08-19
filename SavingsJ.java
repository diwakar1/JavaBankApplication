/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class SavingsJ extends AccountJ {
    private String save;
    private double monthInterest;
    protected final int overdraftFee = 35;
    SavingsJ(){
        
    }

    
    public SavingsJ(SavingsJ s){
        super(s.getType(),s.getfName(), s.getlName(), s.getPassword() ,s.getM_accNum(), s.getAmount());
        save = s.save;
        monthInterest = s.monthInterest;
    }

    SavingsJ(AccTypeJ type, String fname, String lname, String pass, int anum, double amount) {
        super(null,fname ,lname ,pass , anum, amount);
    }

    public String getSave() {
        return save;
    }

    public void setSave(String save) {
        this.save = save;
    }

    public double getInterest() {
        return monthInterest;
    }

    public void setInterest(double interest) {
        this.monthInterest = interest;
    }
    
    @Override
    public double calcInterest(){
        monthInterest = getM_interest();
        monthInterest = (getM_bal() * .002)/12;
        return monthInterest;
    }
    @Override
    public void withdraw(double amount){
        double newBal = getM_bal() - getAmount();
        if (getM_bal() >= getAmount()){
            super.setM_bal(newBal);
            System.out.println(getM_bal());
        }
        else 
            System.out.println("Error: You are exceeding your available balance.");
        newBal = getM_bal();
        super.setM_bal(newBal);
   
    }
   
    
    @Override
    public String toString(){
        return super.toString();
    }
    /**
     * This method will specifically return the abstract 
     * calculate the interest down to the month.
     * @return the string of interest;
     */
    
    
    @Override
    public String report(){
        return super.report();
    }
    
    //public double getTotalBalance() {
       
   // }
}


