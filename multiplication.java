package Anudip;
import java.util.Scanner;
public class multiplication {
   
    public static int add(int a, int b)
    {
        
        int res;
        return a*b;
    }
        public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter any two number");
      
       int a=sc.nextInt();
       int b=sc.nextInt();

       System.out.println("mul is "+add(a,b));
    }
    
}
