public class name {
    String x ;

    name() {
        x = "vanshika";
    }
    void display (){
        System.out.println("my name is " + x );
    }
    public static void main (String[] args) {
        name c = new name();
        c.display();
    }
}