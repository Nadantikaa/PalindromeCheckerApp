/**
 * Use case:Queue+ stack Fairness Check
 *
 *
 *This class validates a palindrome using two
 * different queue and stack.
 *
 * @author Developer
 * @version 1.0
 */
public static void main(String[] args){
    String input= "civic";
    Queue<Character> queue= new LinkedList<>();
    Stack<Character> stack=new Stack<>();
    boolean IfPalindrome=true;
    for(char c : input.toCharArray()){
        stack.push(c);
        queue.add(c);

    }

    while(!queue.isEmpty()){
        if(stack.pop()!=queue.poll()){
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