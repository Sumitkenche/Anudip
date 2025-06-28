
//override
package Anudip;
class automobile 

{
    public void drive()
    {
       System.out.println("class automobile");
    }
}
class car extends  automobile
{
    public void breaks()
    {
        System.out.println(" class car");
    }
}

class bike extends automobile
{
 
    public void speed(){
     System.out.println("class bike##");
    }
} 
public class multilevel
{
public static void main (String args[])
{
    bike  d1=new bike();
    d1.drive();
   d1.speed();
   car c1=new car();
   c1.drive();
   c1.breaks();

}
}