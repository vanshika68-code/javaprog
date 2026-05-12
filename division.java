import java.util.Scanner;
public class division {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        if (num2 != 0) {
            float result = (float) num1 / num2;
            System.out.println("division = " + result);
        } else {
            System.out.println("division by 0 is not possible");
        }
    }
}
