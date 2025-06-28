package Anudip;
public class demo1
{
void print(int a,int b)
{
    System.out.println("print 1 method called");
}
void print(int a,double b)
{
    System.out.println("print 2 method is called");
}
public static void main(String args[])
{
demo1 d1=new demo1();
d1.print(1,2);
d1.print(2,6.1);
}
}



//overloading
//one to one relationship ->compile time poly