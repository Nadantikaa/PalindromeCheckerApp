/**
 * Use case:1 Reverse String based  palindrome validation
 *
 *
 *This class demonstartes  whether a string is a palindrome
 * by reversing a string and comparing it with the original
 * value.
 *
 * @author Developer
 * @version 1.0
 */
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input Text:");
    String input = scanner.nextLine();
    String reverse="";
    for(int i=input.length()-1;i>=0; i--){
        reverse+=input.charAt(i);
    }
    if(input.equals(reverse)){
        System.out.println("Is it a Palindrome:True");
    }else{
        System.out.println("Is it a Palindrome:False");
    }

}