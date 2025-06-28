package Anudip;
public class paramconst
{
    int y;
    paramconst(int y){
    this.y=y;
    }
    public static void main(String args[])
    {
        paramconst pc=new paramconst(10);
        System.out.println("i have assigned value to parameter "+pc.y);

    }
}