/**
 * Use case:1 harcodded palindrome validation
 *
 *
 *This class demonstartes basic palindrome
 * validation using  a hardcoded string value
 *
 * @author Developer
 * @version 1.0
 */
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input Text:");
    String input = scanner.nextLine();
    int j=input.length()-1;
    boolean IsPalliondrome=true;
    for(int i=0;i<input.length()/2;i++){
        if (input.charAt(j) != input.charAt(i)){
            IsPalliondrome=false;
                break;
        }
        else{
                j--;
        }
    }
    if(IsPalliondrome){
        System.out.println("Is it a Palindrome:True");
    }else{
        System.out.println("Is it a Palindrome:False");
    }



}