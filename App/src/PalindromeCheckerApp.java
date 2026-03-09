/**
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * This application checks if a string is a palindrome using
 * different strategies (Stack or Deque) chosen at runtime.
 *

 */
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "madam";
        PalindromeStrategy strategy = new StackStrategy();

        PalindromeService service = new PalindromeService(strategy);
        boolean result = service.checkPalindrome(input);

        System.out.println("Input string: " + input);

        if (result) {
            System.out.println("Is it a Palindrome: True");
        } else {
            System.out.println("Is it a Palindrome: False");
        }
    }
}
interface PalindromeStrategy {
    boolean check(String input);
}
class StackStrategy implements PalindromeStrategy {
    public boolean check(String input){
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){
            stack.push(c);
        }
        for(char c : input.toCharArray()){
            if(c != stack.pop()){
                return false;
            }
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean check(String input){
        Deque<Character> deque = new ArrayDeque<>();
        for(char c : input.toCharArray()){
            deque.addLast(c);
        }
        while(deque.size() > 1){
            if(deque.removeFirst() != deque.removeLast()){
                return false;
            }
        }
        return true;
    }
}

/* Service Class that uses the Strategy */
class PalindromeService {
    private PalindromeStrategy strategy;
    public PalindromeService(PalindromeStrategy strategy){
        this.strategy = strategy;
    }
    public boolean checkPalindrome(String input){
        return strategy.check(input);
    }
}