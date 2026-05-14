abstract class animal{
    abstract void sound();
}
class dog extends animal{
    void sound(){
        System.out.println("dog barks");
    }
}
public class abstraction_animal {
    public static void main(String[] args) {
        animal obj = new dog();
        obj.sound();
    }
}
