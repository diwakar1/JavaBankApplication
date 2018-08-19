

import java.io.IOException;
public class CheckingJ extends AccountJ {
    private String check;
    private double monthInterest;
    protected final int overdraftFee = 35;
    
    CheckingJ(AccTypeJ type, String fname, String lname, String pass, int anum, double amount){
        super(null ,fname ,lname , pass, anum, amount);
    }
    
    public CheckingJ(CheckingJ c){
        super(c.getType(),c.getfName(), c.getlName(), c.getPassword(), c.getM_accNum(), c.getAmount());
        check = c.check;
        monthInterest = c.monthInterest;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
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
        monthInterest = (getM_bal() * .001)/12;
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
            System.out.println("Error: You are exceeding you available balance.");
        newBal = getM_bal() - overdraftFee;
        super.setM_bal(newBal);
    
   //return newBal; 
   
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
}
