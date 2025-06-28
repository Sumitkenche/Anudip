package Anudip;
class pllane
{
    void fly()
    {
        System.out.println("Fly methos of parent");
    }
}
class passangerpln extends pllane
{
    void fly()
    {
        super.fly();
        System.out.println("Fly methos of child class");
    }
}



public class demo4
{

public static void main(String args[])
{
  passangerpln pp=new passangerpln();
  pp.fly();
}
}