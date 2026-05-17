public class constructor_attendence {
    int maths;
    int software;
    int java;
    int dbms;
    int design_tookit;

    constructor_attendence() {
        maths = 85;
        software = 90;
        java = 88;
        dbms = 92;
        design_tookit = 95;
    }
    void display (){
        System.out.println("attendance for maths = " + maths );
        System.out.println("attendance for software = " + software );
        System.out.println("attendance for java = " + java );
        System.out.println("attendance for dbms = " + dbms );
        System.out.println("attendance for design_tookit = " + design_tookit );
    }
    public static void main (String[] args) {
        constructor_attendence c = new constructor_attendence();
        c.display();
    }
}