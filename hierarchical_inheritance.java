class shape{
    void display(){
        System.out.println("This is shape");
    }
}
class circle extends shape{
    void area(){
        System.out.println("this is a circle");
    }
}
class rectangle extends shape{
    void area(){
        System.out.println("this is a rectangle");
    }
}
public class hierarchical_inheritance {
    public static void main(String[] args) {
        circle c = new circle();
        rectangle r = new rectangle();
        c.display();
        c.area();
        r.area();
    }
}
