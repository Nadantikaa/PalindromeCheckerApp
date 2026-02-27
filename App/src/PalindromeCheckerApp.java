/**
 * Use case:1 Character Array based Validation
 *
 *
 *This class validates a palindrome by converting the string
 * into a character array and comparing characters using the
 * two pointer technique,
 *
 * @author Developer
 * @version 1.0
 */
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input Text:");
    String input = scanner.nextLine();
    char[] inputarray =new char[input.length()];
    boolean IfPalindrome=true;
    for(int i=0;i<input.length()-1; i++){
        inputarray[i]=input.charAt(i);
    }

    int right=input.length()-1;
    for(int left=0;left<input.length()/2; left++){
        if(input.charAt(left)!=input.charAt(right)){
            IfPalindrome=false;
            break;
        }
        right--;


    }
    if(IfPalindrome){
        System.out.println("Is it a Palindrome:True");
    }else{
        System.out.println("Is it a Palindrome:False");
    }

}