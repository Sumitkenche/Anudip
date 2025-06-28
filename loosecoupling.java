package Anudip;
    class planee
    {
        void fly()
        {
            System.out.println("The plain flies");
        }
    }
    class cargoplanee extends planee
    {
        void fly()
        {
            System.out.println("Flies at low leve");
        }
    }
    class passangerplanee extends planee
    {
        void fly()
        {
            System.out.println("Flies at medium leve");
        }
    }
    class fighterplanee extends planee
    {
        void fly()
        {
            System.out.println("Flies at high leve");
        }
    }
public class loosecoupling
{
    public static void main(String args[])
    {
        cargoplanee      cp=new cargoplanee();
        passangerplanee  pp=new passangerplanee();
        fighterplanee    fp= new fighterplanee();

        //cp.fly();
        //pp.fly();
        //fp.fly();

        planee ref;
        ref=cp;
        ref.fly();
        ref=pp;
        ref.fly();
        ref=fp;
        ref.fly();
    }
}
// reference stores address not value
//parent class ref is assigned to child classobj ==>loose coupling
//tight coupling ->obj of child class is created so no poly