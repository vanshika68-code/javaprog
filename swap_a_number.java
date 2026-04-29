import java.util.Scanner;

public class swap_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("before swapping, a = " + a + " and b = " + b );

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swapping, a = " + a + " and b = " + b );
    }
}