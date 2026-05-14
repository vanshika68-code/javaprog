class parent{
    void display(){
        System.out.println("parent class");
    }
}
class child extends parent{
    void display(){
        System.out.println("child class");
    }
}
public class runtime_polymorphism {
    public static void main(String[] args) {
        parent p = new child();
        p.display();
    }
}
