import java. util.Random;
public class Account
{
    private String memberName,accountNumber;
    private double accountBalance,minimumBalance;

    public Account(String memberName,int accountBalance,int minimumBalance)
    {
        this.memberName=memberName;
        this.accountBalance=accountBalance;
        this.minimumBalance=minimumBalance;

    
        Random rand=new Random();
        String name=""+ rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10);
        this accountNumber=name;
    }


    public  void deposit(double depAmount){
        accountBalance=accountBalance+depAmount;
    }
    public  void withdraw(double Withamount){
        if((accountBalance-withAmount)>=minimumBalance){
            accountBalance=accountBalance-withAmount;
        }
        else{
            System.out.println("Insufficent Balance");
        }
    }
    public String getMemberName(){
        return memberName;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    public double getMinimumBalance(){
        return minimumBalance;
    }
    @Override
    
    public String toString(){
        return "memberName-"+memberName+"accountNumber+"accountBalance+"minimumBalance-"+minimumBalance;
    }

}