package Anudip;
import java.util.*;
public class palindrome{

    public static void main(String[] args) 
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a string");
     String S =sc.next();
        int length = S.length();
       // boolean Palin = true;
        for (int i = 0; i < length / 2; i++) {
            if (S.charAt(i) != S.charAt(length - i - 1)) 
            {
               System.out.println("String is not palindrome");
                  
                 // Palin = false;
                //break;
            }

        }

      /*   if (Palin) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }*/
       System.out.println("string is palindrome");
}
}