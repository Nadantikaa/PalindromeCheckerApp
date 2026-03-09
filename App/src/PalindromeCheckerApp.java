/**
 * Use case 10: Normalized Palindrome Vaidation
 *
 *
 *This class validates a palindrome after preprocessing the input string.
 *
 * @author Developer
 * @version 1.0
 */
public static void main(String[] args){
    String input= "A man a plan a canal Panana";
    String normalized=input.toLowerCase().replace("[^a-z]","");
    boolean IfPalindrome=true;

    for(int i=0;i<normalized.length()/2;i++){
        if (normalized.charAt(i)!=normalized.charAt(normalized.length()-1-i)){
            IfPalindrome=false;
            break;
        }
    }
    System.out.println("Input string:"+input);
    if(IfPalindrome){
        System.out.println("Is it a Palindrome:True");
    }else{
        System.out.println("Is it a Palindrome:False");
    }

}