/**
 * Use case9:Recursive Palindrome Checker
 *
 *
 *This class validates a palindrome using recursion.
 *
 * @author Developer
 * @version 1.0
 */
public class PalindromeCheckerApp{
    public static void main(String[] args) {
        String input = "madam";
        int start = 0;
        int end = input.length()-1;
        boolean IfPalindrome = true;

        System.out.println(" Input string:" + input);
        if (IfPalindrome) {
            System.out.println("Is it a Palindrome:True");
        } else {
            System.out.println("Is it a Palindrome:False");
        }
    }
    private static boolean check (String input,int start, int end){
        if(start>=end){
            return true;
        }
        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }
        return check(input,start++,end--);
    }
}