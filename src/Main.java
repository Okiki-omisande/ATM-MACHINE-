import java.util.Scanner;

public class Main {
    static ATM atm = new ATM(100);
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Labour Bank of Nigeria!");
        System.out.println("Kindly select from the Menu list: ");
        System.out.println("1- Check Balance" + "\n" + "2- Deposit" + "\n" +
                "3- Withdraw" + "\n" + "4- Transfer fund" + "\n" + "5- Exit");
        int choice = input.nextInt();
        do {
            bankApp(choice);
            System.out.println("\nKindly select from the Menu list: ");
            System.out.println("1- Check Balance" + "\n" + "2- Deposit" + "\n" +
                    "3- Withdraw" + "\n" + "4- Transfer fund" + "\n" + "5- Exit");
            choice = input.nextInt();
       }
       while (choice != 5);
    }

    public static void bankApp(int choice) {
        switch (choice) {
            case 1:
                atm.checkBalance();
                break;
            case 2:
                atm.deposit();
                break;
            case 3:
                atm.withdrawal();
                break;
            case 4:
                atm.transfer();
                break;
            case 5:
                atm.exit();
                break;
        }
    }
}
