//Create an abstract class 'Bank' with an abstract method 'getBalance'. 
//$100, $150 and $200 are deposited in banks A, B and C respectively. 
//'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
// Call this method by creating an object of each of the three classes.



public abstract class Bank {

    abstract int getBalance(); 

    static class BankA extends Bank {
        int balance; 

        BankA(int deposit) {
            this.balance = deposit;
        }

        
        int getBalance() {
            System.out.println("BankA balance is: " + balance);
            return balance;
        }
    }

    static class BankB extends Bank {
        int balance;

        BankB(int deposit) {
            this.balance = deposit;
        }

        
        int getBalance() {
            System.out.println("BankB balance is: " + balance);
            return balance;
        }
    }

    static class BankC extends Bank {
        int balance;

        BankC(int deposit) {
            this.balance = deposit;
        }

        
        int getBalance() {
            System.out.println("BankC balance is: " + balance);
            return balance;
        }
    }

    public static void main(String[] args) {
        BankA a = new BankA(100);
        a.getBalance();
        
        BankB b = new BankB(200);
        b.getBalance();
        
        BankC c = new BankC(300);
        c.getBalance();
    }
}
