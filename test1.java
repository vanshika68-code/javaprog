class animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
public class test1 {
    public static void main(String [] args){
        animal a = new dog();
        a.sound();

    }
    
}
