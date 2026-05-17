public class marks {
    int maths ;
    int physics ;
    int chemistry ;
    int english ;
    int computer ;

    marks() {
        maths = 85;
        physics = 90;
        chemistry = 88;
        english = 92;
        computer = 95;
    }
    void display (){
        System.out.println("maths = " + maths );
        System.out.println("physics = " + physics );
        System.out.println("chemistry = " + chemistry );
        System.out.println("english = " + english );
        System.out.println("computer = " + computer );
    }
    public static void main (String[] args) {
        marks m = new marks();
        m.display();
    }
}