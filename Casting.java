public class Casting {
    public static void main(String[] args) {
        int value = 23;
        char name = 'a';

        // Casting the character 'a' to its ASCII value (integer)
        int value2 = (int) name;

        System.out.println("Original value: " + value);
        System.out.println("ASCII value of 'a': " + value2);
    }
}

