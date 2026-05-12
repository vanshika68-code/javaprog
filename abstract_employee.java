abstract class employee{
    String name ;
    int ID;
    abstract void calculate_salary();
}
void display_details(){
    System.out.println("Name: " + name);
    System.out.println("ID: " + ID);
}
class full_time extends employee{
    int monthly_salary;
    void calculate_salary(){
        System.out.println("Monthly Salary: " + monthly_salary);
    }
}
class part_time extends employee{
    int salary;
    void calculate_salary(){
        System.out.println("Monthly Salary: " + salary);
    }
}
public class abstract_employee {
    public static void main(String[] args) {
        full_time f = new full_time();
        f.name = "John Doe";
        f.ID = 12345;
        f.monthly_salary = 5000;
        f.display_details();
        f.calculate_salary();

        part_time p = new part_time();
        p.name = "Jane Smith";
        p.ID = 54321;
        p.salary = 2000; 
        p.display_details();
        p.calculate_salary();
    }
    
}
