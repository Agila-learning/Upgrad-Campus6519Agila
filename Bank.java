import java.util.Scanner;

 class Account {
    private double savings;
    private String name;
    private String accountNumber;

    public void initializeAccount(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public double deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to deposit: ");
        double depositAmount = sc.nextDouble();
        savings += depositAmount;
        return savings;
    }

    public void withdrawal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        double withdrawalAmount = sc.nextDouble();
        if (withdrawalAmount <= savings) {
            savings -= withdrawalAmount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void getinfo() {
        System.out.println("Here is your information:");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Savings: " + savings);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your bank account number: ");
        String accountNumber = sc.nextLine();

        Account acc = new Account();
        acc.initializeAccount(name, accountNumber);

        acc.deposit();
        acc.withdrawal();
        acc.getinfo();
    }
}
