package Anudip;
public class hollowpattern3
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=4;j++)
            {
              if(i==1|| j==1 || i==5 || j==4)                              
              {
                System.out.print("*");
              }else
              {
                System.out.print(" ");
              }
            }
            System.out.println();

        }
    }
}

              
