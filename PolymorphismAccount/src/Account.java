public class Account {

private final String bankName = "HSBC";
private String countryOfAccount;


    public Account(String countryOfAccount) {
        this.countryOfAccount = countryOfAccount;
    }

    public Account() {
        this.countryOfAccount = "Jordan";
    }

    public static Account getClass(String type, String countryOfAccount,  String branch, String currency, double intrestRate, double balance){

        char q = type.toUpperCase().charAt(0);

        return switch(q){
            case 'S' -> new SavingAccount( countryOfAccount ,  branch,  currency,  intrestRate, balance);
            case 'C' -> new CurrentAccount(countryOfAccount ,  branch,  currency,  intrestRate, balance);

            default -> new Account();
        };
    }


}

class SavingAccount extends Account{

    private static int accountNumber = 1;
    private String accountNo;
    private String branch;
    private String currency;
    private double intrestRate;
    private double balance;

    public SavingAccount(String countryOfAccount , String branch, String currency, double intrestRate, double balance) {
        super(countryOfAccount);
        this.accountNo = "Saving " + accountNumber++;
        this.branch = branch;
        this.currency = currency;
        this.intrestRate = intrestRate;
        this.balance = balance;
    }

    public void deposit(double amount){

        if (amount > 0)
        {
            balance +=  amount;
        }
        System.out.printf("%nThe Saving account no: %s, balance is: %.2f%n", accountNo, balance);
    }

    public void withdrawl (double amount){
        if ((balance - amount) > 0){
            balance -= amount;
        }
        else{
            System.out.println("insufficent fund");
        }
        System.out.printf("%nThe Saving account no: %s, balance is: %.2f%n", accountNo, balance);
    }
}

class CurrentAccount extends Account{

    private static int accountNumber = 1;
    private String accountNo;
    private String branch;
    private String currency;
    private double intrestRate;
    private double balance;

    public CurrentAccount(String countryOfAccount , String branch, String currency, double intrestRate, double balance) {
        super(countryOfAccount);
        this.accountNo = "Current " + accountNumber++;
        this.branch = branch;
        this.currency = currency;
        this.intrestRate = intrestRate;
        this.balance = balance;
    }

    public void deposit(double amount){

        if (amount > 0)
        {
             balance += amount;
        }
        System.out.printf("%nThe Current account no: %s, balance is: %.2f%n", accountNo, balance);
    }

    public void withdrawl (double amount){
        if ((balance - amount) > 0){
            balance -= amount;
        }
        else{
            System.out.println("insufficent fund");
        }
         System.out.printf("%nThe Current account no: %s, balance is: %.2f%n", accountNo, balance);
    }
}
