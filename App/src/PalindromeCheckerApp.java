/**
 * Use case 11: Object oriented palindrome service
 *
 *
 *This class validates a palindrome using object oriented design.
 *
 * @author Developer
 * @version 1.0
 */
public class PalindromeCheckerApp{
    public static void main(String[] args) {
        String input = "madam";
        PalindromeService service=new PalindromeService();
        boolean IfPalindrome=service.checkPalindrome(input);
        System.out.println("Input string: " + input);

        if(IfPalindrome){
            System.out.println("Is it a Palindrome: True");
        } else {
            System.out.println("Is it a Palindrome: False");
        }


    }
}
class PalindromeService{

    public boolean checkPalindrome(String input){
        int start=0;
        int end=input.length()-1;
        boolean IfPalindrome = true;
        while(start<end) {
            if (input.charAt(start) != input.charAt(end)) {
                IfPalindrome = false;
                break;
            }
            start++;
            end--;
        }
    return IfPalindrome;
    }

}