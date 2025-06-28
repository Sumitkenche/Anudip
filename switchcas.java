
package Anudip;
import java.util.*;
public class switchcas
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter day of the week");
    int day=sc.nextInt();
    
    switch(day)
    {
        case 1:
        System.out.println("monday");
        case 2:
        System.out.println("tuesday");
        case 3:
        System.out.println("wednesday");
        case 4:
        System.out.println("thursday");
        case 5:
        System.out.println("Friday");
        case 6:
        System.out.println("Saturday");
        case 7:
        System.out.println("Sunday");
        default:
        System.out.println("Not A valid day of week");

    }
}
}

//