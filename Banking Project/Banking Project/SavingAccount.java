public class SavingAccount extends Account{
    private double interest=0.05;
    public SavingAccount(String memberName,double accountBalance,double maxWithLimit){
        super(memberName,accountBalance,200.0);
        this.maxWithLimit=maxWithLimit;

        }
        pubic double calculateInterest(){
            double totalInterest=accountBalance*Interest;
            return totalInterest;
        }
        public double getNetBalance(){
            return accountBalance + calculateInterest();
        }
        public double getInterest(){
            return Interest;
        }
        public double getmaxWithLimit(){
            return maxWithLimit;
        }
    }
        
