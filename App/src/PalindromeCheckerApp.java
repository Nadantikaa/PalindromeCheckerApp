/**
 * Use case:Stack based palindrome checker
 *
 *
 *This class validates a palindrome using a stack data structure
 * which follows the LIFO principle
 *
 * @author Developer
 * @version 1.0
 */
public static void main(String[] args){
    String input= "noon";
    Stack<Character> stack=new Stack<>();
    boolean IfPalindrome=true;
    for(char c : input.toCharArray()){
        stack.push(c);

    }

    for(char c: input.toCharArray()){
        if(stack.pop()!=c){
            IfPalindrome=false;
        }
    }

    if(IfPalindrome){
        System.out.println("Is it a Palindrome:True");
    }else{
        System.out.println("Is it a Palindrome:False");
    }

}