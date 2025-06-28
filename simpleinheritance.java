
package Anudip;
class vehicles {
    public void drive() {
        System.out.println("Super engine");
    }
}

class cars extends vehicles {
   
    public void drive() {
        System.out.println("Comfort");
    }

    public void breaks() {
        System.out.println("this is my specialized method");
    }
}

public class simpleinheritance{
    public static void main(String args[]) {
        cars c1 = new cars();
        c1.drive();
        c1.breaks();
    }
}
