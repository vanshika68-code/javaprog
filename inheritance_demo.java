class parent{
    void show(){
        System.out.println("this is parent class");
    }
}
class child extends parent{
    void display(){
        System.out.println("this is child class");
    }
}
public class inheritance_demo {
    public static void main (String [] args){
        child c = new child();
        c.show();
        c.display();
    }
    
}
