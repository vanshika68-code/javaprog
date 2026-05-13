import java.util.Scanner;
public class swap_number1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number :");
        int a = sc.nextInt();
        System.out.print("enter the second number :");
        int b = sc.nextInt();
        System.out.println("before swapping, a = " + a + " and b = " + b );
        int temp = a;
        a = b;  
        b = temp;
        System.out.println("after swapping, a = " + a + " and b = " + b );
        sc.close();
    }
}
