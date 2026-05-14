class student{
    student(){
        System.out.println("default constructor");
    }
    student(String name){
        System.out.println("student name: " + name);
    }
    student(int age){
        System.out.println("student age: " + age);
    }
    student(double marks){
        System.out.println("student marks: " + marks);
    }
}
public class constructore_overloading {
    public static void main(String[] args){
        student s1 = new student();
        student s2 = new student("john");
        student s3 = new student(20);
        student s4 = new student(85);
    }
}
