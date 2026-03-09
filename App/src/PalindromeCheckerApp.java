/**
 * =====================================================
 * MAIN CLASS – UseCase13PalindromeCheckerApp
 * =====================================================
 *
 * Use Case 13: Performance Comparison
 *
 * This application compares the execution performance
 * of different palindrome validation strategies.
 *
 * Key Concepts:
 * - System.nanoTime()
 * - Algorithm benchmarking
 * - Strategy Pattern reuse
 *
 * @author Developer
 * @version 13.0
 */
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "madam";
        PalindromeStrategy stackStrategy=new StackStrategy();
        PalindromeStrategy dequeStrategy=new DequeStrategy();

        long startStack=System.nanoTime();
        boolean stackResult=stackStrategy.check(input);
        long endStack =System.nanoTime();
        long stackTime =endStack-startStack;
        long startDeque=System.nanoTime();
        boolean dequeResult=dequeStrategy.check(input);
        long endDeque=System.nanoTime();
        long dequeTime=endDeque-startDeque;
        System.out.println("Input string: " + input);
        System.out.println();
        System.out.println("Stack Strategy Result: " + stackResult);
        System.out.println("Stack Execution Time: " + stackTime + " ns");
        System.out.println();
        System.out.println("Deque Strategy Result: " + dequeResult);
        System.out.println("Deque Execution Time: " + dequeTime + " ns");
    }
}
interface PalindromeStrategy {
    boolean check(String input);

}

class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c: input.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }

        }
        return true;
    }
}