import java.util.*;
class Main{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        Palindrome palin = new Palindrome();
        System.out.println("Enter a value to be reversed: ");
       
        int value_ent= sc.nextInt();
        boolean value = palin.Palindrome(value_ent);
        System.out.println(value);
    }
}