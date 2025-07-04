package Anudip;
public class twoDimArry
{
    public static void main(String args[])

    {
        int [][]arrays=new int [3][3];
        arrays[0][0]=10;
        arrays[0][1]=22;
        arrays[0][2]=10;
        arrays[1][0]=55;
        arrays[1][1]=10;
        arrays[1][2]=10;
        arrays[2][0]=34;
        arrays[2][1]=43;
        arrays[2][2]=66;

        for(int i=0;i<arrays.length;i++)
        {
            for(int j=0;j<arrays.length;j++)
            {
                System.out.print(arrays[i][j]+" ");
            }
            System.out.println();
        }
    }
}