import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value : ");
        int num=sc.nextInt();
        for(int i=1;i<=20;i++){
            System.out.println(i*num);
        }
    }
}
