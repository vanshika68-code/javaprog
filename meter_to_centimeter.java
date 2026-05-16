import java.util.*;
public class meter_to_centimeter{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length in meter :");
        int meter = sc.nextInt();
        int centimeter = meter * 100;
        System.out.print("length in centimeter = " +centimeter);
        sc.close();
    }
}