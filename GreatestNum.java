import java.util.Scanner;
public class GreatestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter b value: ");
        int b= sc.nextInt();
        if(a>b){
            System.out.println("a is the greatest");
        }
        else if(b>a){
            System.out.println("b is the greatest");
        }
        else{
            System.out.println("Both are same");
        }
    }
}
