public class CurrentAccount extends Account {
    public String tradeLicenseNumber;
    public CurrentAccount(String memberName,double accountBalance,String tradeLicenseNumber){
        super(memberName,accountBalance,5000.0);
    }
}