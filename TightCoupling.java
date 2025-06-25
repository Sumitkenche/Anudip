package Anudip;
class demo
{
    int add(){
    int a=10;
    int b=30;
    int res=a*b;
    return res;
    }
}

    public class TightCoupling
    {
        public static void main(String args[])
        {
        demo d1=new demo();
        System.out.println(d1.add());//tight coupling
        }
    } 