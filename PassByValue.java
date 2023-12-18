public class PassByValue {
    
        public static void main(String[] args) {
            int x = 5;
            System.out.println("Before: " + x);
            modifyValue(x);
            System.out.println("After: " + x);
        }
    
        public static void modifyValue(int num) {
            num = num * 2;
            System.out.println("Inside function: " + num);
        }
    }
    

