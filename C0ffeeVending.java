import java.util.Scanner;
public class C0ffeeVending {
   public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a code:");
int code=sc.nextInt();
switch(code){
case 1:System.out.println("Cappuccino");
break;
case 2:System.out.println("Espresso");
break;
case 3:System.out.println("Latte");
break;
case 4:System.out.println("Milk");
break;
default:System.out.println("Drink not available");  
}
}
}
