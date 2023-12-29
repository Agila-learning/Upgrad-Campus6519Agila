//problem Statement..Create an abstract class 'Parent' with a method 'message'. 
//It has two subclasses each having a method with the same name 'message' that prints 
//"This is first subclass" and "This is second subclass" respectively. 
//Call the methods 'message' by creating an object for each subclass
public abstract class Parent {
    public void message() {
    }
    static class Child1 extends Parent {
        public void message() {
            System.out.println("First Subclass");
        }
    }
    static class Child2 extends Parent {
        public void message() {
            System.out.println("Second Subclass");
        }
    }
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.message();
        Child2 child2 = new Child2();
        child2.message();
    }
}
