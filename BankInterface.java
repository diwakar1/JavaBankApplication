
interface BankInterface {
    public String addAccount(int type,String fname, String lname, String pass ,int anum, double amount);
    
    public int getNumChecking();
    
    public int getNumSavings();
    /**
     * 
     * @return 
     */
    public double getTotalBal();
    /**
     * 
     * @return 
     */
    public double calculateInterest();
    /**
     * This will print the information  for all bank accounts respectively
     * @return name, account number, balance
     */
    public String printBankInfo();
    
    
    /**
     * 
     * @return 
     */
    public String toString();
    
}
