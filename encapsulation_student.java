class student{
    private String name;
    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
}
public class encapsulation_student {
    public static void main(String [] args){
        student s = new student();
        s.setname("aman");
        System.out.println("student name: " + s.getname());
    }
}
