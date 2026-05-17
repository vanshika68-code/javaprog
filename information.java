public class information {
    int rollno;
    String name ;
    int age;
    long phoneno;

    information() {
        rollno = 1;
        name = "vanshika";
        age = 18;
        phoneno = 1234567890;
    }
    void display (){
        System.out.println("rollno = " + rollno);
        System.out.println("name = " + name );
        System.out.println("age = " + age);
        System.out.println("phone number = " + phoneno);
    }
    public static void main (String[] args) {
        information i = new information();
        i.display();
    }
}