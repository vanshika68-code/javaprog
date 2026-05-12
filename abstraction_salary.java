abstract class employee{
    abstract void salary();
}
class manager extends employee{
    void salary(){
        System.out.println("manager salary = 50000");
    }
}
class developer extends employee{
    void salary(){
        System.out.println("developer salary = 30000");
    }
}
public class abstraction_salary {
    public static void main(String[] args) {
        employee e1 = new manager();
        employee e2 = new developer();
        e1.salary();
        e2.salary();
    }
}
