package Anudip;
class person
{
    private String name;

    public  String getName()
    {
        return name;
    }
    public void setName(String nm)
    {
           this.name =nm;
    }
}




public class encap
{
    public static void main(String args[])

    {
            person p=new person();
            p.setName("sumit");
            System.out.println(p.getName());
    }
}