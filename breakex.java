package Anudip;
import java.util.*;
public class breakex
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i==3)
            {
                break;
            }
            System.out.println("num =>"+i);
        }
    }
}