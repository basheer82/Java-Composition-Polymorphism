import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter new Client name");
        String name = input.nextLine();

        System.out.println("\nPlease enter new Client national id");
        long nId = Integer.parseInt(input.nextLine());

        System.out.println("\nPlease enter new Client nationality");
        String nationality = input.nextLine();

        System.out.println("\nPlease enter new Client date of birth");
        String DOB = input.nextLine();

        System.out.println("\nPlease enter new Client Address");
        String address = input.nextLine();


        while (true) {
            System.out.println("\nTo open a new Account please provide the country of account, q to quit account opening\n");
            String country = input.nextLine();

            if ("Qq".contains(country)) {
                break;
            }

            System.out.println("\nplease enter the account branch\n");
            String branch = input.nextLine();

            System.out.println("\nplease enter the account currency\n");
            String currency = input.nextLine();

            System.out.println("\nplease enter the intrest rate, not to exceed 2%\n");
            double intrestRate = Double.parseDouble(input.nextLine());
            ;

            System.out.println("\nplease enter the account balance\n");
            double balance = Double.parseDouble(input.nextLine());

            System.out.println("\nplease enter the type of account: saving or current account\n");
            String type = input.nextLine();
            type = type.toUpperCase().substring(0);

            Account acnt = Account.getClass(type, country, branch, currency, intrestRate, balance);

            if (acnt.getClass().getSimpleName() == "CurrentAccount")
            {

                Client client = new Client((CurrentAccount) acnt, name, nId, nationality, DOB, address, "Current");
                System.out.println("\nTo withdraw from your account, please enter the withdrawl amount\n");
                double amount = Double.parseDouble(input.nextLine());
                client.getCurrentAccount().withdrawl(amount);

                System.out.println("\nTo deposit from your account, please enter the deposit amount\n");
                double depAmount = Double.parseDouble(input.nextLine());
                client.getCurrentAccount().deposit(depAmount);

            }

            if (acnt.getClass().getSimpleName() == "SavingAccount")
            {

                Client client = new Client((SavingAccount) acnt, name, nId, nationality, DOB, address );
                System.out.println("\nTo withdraw from your account, please enter the withdrawl amount\n");
                double amount = Double.parseDouble(input.nextLine());
                client.getSavingAcount().withdrawl(amount);

                System.out.println("\nTo deposit from your account, please enter the deposit amount\n");
                double depAmount = Double.parseDouble(input.nextLine());
                client.getSavingAcount().deposit(depAmount);

            }


        }
    }
}