import java.util.Scanner;

public class StringPalindrome {
    
    public String FindPalindrome(String[] words){
        for(String word : words){
            if(isPalindrome(word)){
                return word;
            }
        }
        return "";
    }
    
    private boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left < right) {
            if(s.charAt(left)!= s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true; // Return true if the entire string is checked and found to be a palindrome
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        int n = scanner.nextInt();
        String[] words = new String[n];
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }
        StringPalindrome palindromeFinder = new StringPalindrome();
        String result = palindromeFinder.FindPalindrome(words);
        if (!result.isEmpty()) {
            System.out.println("The first palindromic string in the array is: " + result);
        } else {
            System.out.println("There are no palindromic strings in the array.");
        }
        scanner.close();
    }
}
