package ASSIGNMENT;

public class A8 {
    public void driver(){
        Account a1 = new Account();
        a1.setAccountNumber(1465234200);
        a1.setCustomerName("Aakash");
        a1.setBalance(1000);
        System.out.println("AccountNumber: "+a1.getAccountNumber());
        System.out.println("CustomerName: "+a1.getCustomerName());
        System.out.println("AvailableBalance : "+a1.getBalance());
        Account.setRateOfInterest(9.5F);
        System.out.println("RateOfInterest: "+Account.getRateOfInterest());
        System.out.println("SimpleInterest: "+a1.getSimpleInterst(10));

    }
}
class Account{
    private long accountNumber;
    private String customerName;
    private double balance;
    private static float rateOfInterest;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public static void setRateOfInterest(float rateOfInterest) {
        Account.rateOfInterest = rateOfInterest;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public static float getRateOfInterest() {
        return rateOfInterest;
    }

    public double getSimpleInterst(int time){
        return balance*rateOfInterest*time/100.0;
    }

}
