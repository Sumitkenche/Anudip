package Anudip;
import java.util.*;
public class leap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int yr=sc.nextInt();
        if((yr%4==0 &&yr%100!=0) ||(yr%400==0))//((a and b)or (c))
        {
            System.out.println(yr+"  is a leap yr");
        }
        else{
            System.out.println("IT is not a leap year");
        }
    }
}