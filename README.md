# Java-Composition-Polymorphism

The program creates new client object of class Client based on user info input

the Client object have a composition relation to polymorphism types: SavingAccount class type and CurrentAccount class type

### The account type (Saving or Current) object type determined at the compile time, based on the user input choice of type of account object



```
public static Account getClass(String type, String countryOfAccount,  String branch, String currency, 
                                double intrestRate, double balance)
 {
       
       
       char q = type.toUpperCase().charAt(0);

        return switch(q)
        {
            case 'S' -> new SavingAccount( countryOfAccount ,  branch,  currency,  intrestRate, balance);
            case 'C' -> new CurrentAccount(countryOfAccount ,  branch,  currency,  intrestRate, balance);

            default -> new Account();
        };
    }
```
    
    
The client can do withdraw and deposit operations on his account objects
