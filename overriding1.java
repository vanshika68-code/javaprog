class animal {
    public void move (){
        System.out.println("animal is moving");
    }
    public void eat(){
        System.out.println("animal eats food");
    }
}
class lion extends animal {
    public void move(){
        System.out.println("lion moves on land");
    }
    public void eat(){
        System.out.println("lion eats non veg");
    }
}
class cow extends animal {
    public void move(){
        System.out.println("cow moves on land");
    }
    public void eat(){
        System.out.println("cow eats veg");
    }
}

public class overriding1{
    public static void main (String[] args){
        animal a;
        a = new lion();
        a.move();
        a.eat();
        System.out.println();

        a = new cow();
        a.move();
        a.eat();
    }
}