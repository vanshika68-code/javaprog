abstract class animal{
    int noofwheels;
    abstract void legs();

}
class cow extends animal{
    int nooflegs = 4;
    void legs(){
        System.out.println("cow has " + nooflegs + " legs");
    }
}
class human extends animal{
    int nooflegs = 2;
    void legs(){
        System.out.println("human has " + nooflegs + " legs");
    }
}

public class abstract_animal{
    public static void main(String[] args) {
        animal obj = new cow();
        obj.legs();
        animal obj1 = new human();
        obj1.legs();

    }
}