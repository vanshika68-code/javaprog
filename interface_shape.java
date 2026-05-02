import java.util.Scanner;

interface shape {
    void area();
}
class circle implements shape{
    public void area(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int r = sc.nextInt() ;
        double result = 3.14*r*r;
        System.out.println("area of circle = " + result);
    }
}
public class interface_shape {
    public static void main(String[] args) {
        circle c = new circle();
        c.area();
    }
}
