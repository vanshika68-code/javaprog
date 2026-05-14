class employee{
    private int empid;
    public void setempid(int empid){
        this.empid = empid;
    }
    public int getempid(){
        return empid;
    }
}
public class encapsulation_employee {
    public static void main(String[] args){
        employee e = new employee();
        e.setempid(12345);
        System.out.println("employee id: " + e.getempid());
    }
}
