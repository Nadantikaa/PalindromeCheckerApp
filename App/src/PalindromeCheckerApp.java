/**
 * Use case 8:linked list Based Palindrome Checker
 *
 *
 *This class validates a palindrome using a linkedlist.
 *
 * @author Developer
 * @version 1.0
 */
public static void main(String[] args){
    String input= "level";
    LinkedList<Character> list=new LinkedList<>();
    LinkedList<Character> reverse=new LinkedList<>();
    boolean IfPalindrome=true;

    for(char c : input.toCharArray()){
        list.add(c);

    }
    int mid=list.size()/2;
    LinkedList<Character> secondhalf= new LinkedList<>(list.subList(mid,list.size()));
    Collections.reverse(secondhalf);
    while(secondhalf.size()>1){
        if(list.removeFirst()!=secondhalf.removeFirst()){
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