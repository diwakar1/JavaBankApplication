

public abstract class AccountJ {
    private int m_accNum;
    private double m_interest;
    private double m_bal;
  //  private String m_type;
    private AccTypeJ type;
    private double amount;
    private String fName, lName;
    private String password;
    
    AccountJ(){
    m_accNum = 0;
    m_interest = 0.0;
    m_bal = 0.0;
   // m_type = "";
    type = null;
    amount = 0.0;
    fName = "";
    lName = "";
    password = "";
    }
    
    /**
     * 
     * @param type
     * @param fname
     * @param lname
     * @param pass
     * @param anum
     * @param amount 
     */
     AccountJ(AccTypeJ type, String fname, String lname, String pass, int anum, double amount){
        
         this.type = type;
         this.fName = fname;
         this.lName = lname;
         this.password = pass;
         this.m_accNum = anum;
         this.amount = amount;
      
         
                //new CheckingJ(type, fname, lname, pass, anum, amount);
                //new SavingsJ(type, fname, lname, pass, anum, amount);
     }

    public int getM_accNum() {
        return m_accNum;
    }

    public void setM_accNum(int m_accNum) {
        this.m_accNum = m_accNum;
    }

    public double getM_interest() {
        return m_interest;
    }

    public void setM_interest(double m_interest) {
        this.m_interest = m_interest;
    }

    public double getM_bal() {
        return m_bal;
    }

    public void setM_bal(double m_bal) {
        
        this.m_bal = m_bal;
    }

    public AccTypeJ getType() {
        return type;
    }

    public void setType(AccTypeJ type) {
        this.type = type;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
  /*  public String getM_type() {
        return m_type;
    }

    public void setM_type(String m_type) {
        this.m_type = m_type;
    }
    */
    public abstract double calcInterest();
     /**
      * This will return a print string of all values from getters
      * Consider Expanding later. 
      * @return 
      */
    /**
     * 
     * @param amount 
     */
    public abstract void withdraw(double amount);
   

     
     
     public String report(){
         return "Interest is: " + calcInterest();
     }
     
     
    
}
