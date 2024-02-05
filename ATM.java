import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter your choice:");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
              System.out.println("Please Insert your card");
              break;
            case 2:
                System.out.println("Enter the Pin");
                int pin=sc.nextInt();
                System.out.println("validated Successfully");
                break;
            case 3:
                System.out.println("Enter the money");;
                break;
            default:
                System.out.println(("Please take your card ...Thank u"));;
                return;
        }
        System.out.println("Enter the amount to be withdrawn:");
        int withdrawalAmount = sc.nextInt();
        
            
            if (withdrawalAmount >= 1000) {
                System.out.println("You have insufficient balance.");
            } else {
                System.out.println("Please collect your money.");
            }
        
       
    }
}
