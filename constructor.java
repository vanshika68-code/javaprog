public class constructor {
    int x ;

    constructor() {
        x = 10;
    }
    void display (){
        System.out.println("value of x = " + x);
    }
    public static void main (String[] args) {
        constructor c = new constructor();
        c.display();
    }
}