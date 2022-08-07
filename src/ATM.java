import java.util.Scanner;

public class ATM {
    private double Balance;
    Scanner input = new Scanner(System.in);

    public ATM(double balance) {
        this.Balance = balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public double getBalance() {
        return Balance;
    }

    public void checkBalance() {
        System.out.println("Available balance is: $" +getBalance() );
        option();
    }

    public void deposit() {
        System.out.println("enter deposit amount: ");
        double amount = input.nextDouble();

        if(amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Successful deposited $" + amount);
        }
        else
            System.out.println("Sorry, deposit amount must be greater than Zero");
        option();
    }

    public void withdrawal() {
        System.out.println("enter the amount you want to withdraw: ");
        double withdrawal = input.nextDouble();

        if(withdrawal <= getBalance()) {
            setBalance(getBalance() - withdrawal);
            System.out.println("withdrawal successful, take your cash!");
        }
        else
            System.out.println("you have insufficient fund, kindly deposit into your balance.");
        option();
    }

    public void transfer() {
        System.out.println("Select the bank you want to send to:" + "\n" +
                "1- Access Bank" + "\n" + "2- GtBank" + "\n" + "3- Zenith Bank");
        String bank = input.next();

        while (!(bank.equals("1") || bank.equals("2") || bank.equals("3"))) {
            System.out.println("Invalid input please enter  a valid input");

            System.out.println("Select the bank you want to send to:" + "\n" +
                    "1- Access Bank" + "\n" + "2- GtBank" + "\n" + "3- Zenith Bank");
            bank = input.next();
            option();
        }

        System.out.println("Enter Account number: ");
        String acctNo = input.next();

        while (!(acctNo.length() == 10)) {
            System.out.println("you have entered an invalid account number (account number must have 10 digits)");
            System.out.println("Enter a valid Account number: ");
            acctNo = input.next();
        }
        System.out.println("Enter transfer amount: ");
        int trsAmt = input.nextInt();

        while (!(trsAmt > 0 && trsAmt <= getBalance())) {
            System.out.println("the amount transferred must be greater than 0 and less than or equal to your    balance.");
            System.out.println("Enter a valid transfer amount: ");
            trsAmt = input.nextInt();
        }
        setBalance(getBalance() - trsAmt);
        System.out.println("Transfer successful!");
        System.out.println("successfully sent " + "$" + trsAmt + " to " + acctNo);
        option();
    }

    public void exit() {
        System.out.println("Thanks for Banking with us!");
        System.exit(10);
    }

    public void option() {
        System.out.println("\nWOULD YOU LIKE TO PERFORM MORE TRANSACTION");
        System.out.println("press 1 to continue");
        System.out.println("press 2 to quit");
        if (input.nextInt() == 1)
            System.out.println();
        else
            exit();
    }
}
