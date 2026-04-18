import java.util.Scanner;
public class inches_to_meters {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter lenght in inches : ");
        double inches = sc.nextDouble();
        double meters = inches + 0.0254;
        System.out.print("length in meters =" +meters);
        sc.close();
    }
}
