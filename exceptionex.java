
package Anudip;
import java.util.*;
class Demo5
{
    public void fun()
    {

    
    Scanner sc=new Scanner (System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
        try{
        int c=a/b;
        //int ary[]=new int[6];
        //ary[10]=20;
        System.out.println("output"+c);
        }catch(Exception e)                            //Generalized catch Block
      {
               
         System.out.println(e.getMessage());// System.out.println("progrm terminates");
                
      } 
            finally
            {
                System.out.println("this00 block  terminates program");
            }


  /*   catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println(e.getMessage());   
    }
    */
}
}
public class exceptionex{
public static void main(String args[])
{
 Demo5 d5=new Demo5();
 d5.fun();

}
}