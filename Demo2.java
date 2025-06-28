package Anudip;
    class plane
    {
        void fly()
        {
            System.out.println("The plain flies");
        }
    }
    class cargoplane extends plane
    {
        void fly()
        {
            System.out.println("Flies at low leve");
        }
    }
    class passangerplane extends plane
    {
        void fly()
        {
            System.out.println("Flies at medium leve");
        }
    }
    class fighterplane extends plane
    {
        void fly()
        {
            System.out.println("Flies at high leve");
        }
    }
public class Demo2
{
    public static void main(String args[])
    {
        cargoplane      cp=new cargoplane();
        passangerplane  pp=new passangerplane();
        fighterplane    fp= new fighterplane();

        cp.fly();
        pp.fly();
        fp.fly();
    }
}

//tight coupling ->obj of child class is created so no poly