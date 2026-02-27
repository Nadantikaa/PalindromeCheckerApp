/**
 * Use case:deque based optimized palindrome Check
 *
 *
 *This class validates a palindrome using a deque.
 *
 * @author Developer
 * @version 1.0
 */
public static void main(String[] args){
    String input= "refer";
    Deque<Character> deque=new ArrayDeque<>();
    boolean IfPalindrome=true;

    for(char c : input.toCharArray()){
        deque.add(c);

    }

    while(deque.size()>1){
        if(deque.peek()!=deque.poll()){
            IfPalindrome=false;
        }
    }
    System.out.println("Input string:"+input);
    if(IfPalindrome){
        System.out.println("Is it a Palindrome:True");
    }else{
        System.out.println("Is it a Palindrome:False");
    }

}