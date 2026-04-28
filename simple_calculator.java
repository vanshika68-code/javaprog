import java.util.*;
public class simple_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number :");
        int num1 = sc.nextInt();
        System.out.print("enter second number :");
        int num2 = sc.nextInt();

        int add = num1 + num2;
        System.out.println("addition of two numbers = " +add);
        int subtract = num1 - num2;
        System.out.println("subtraction of two numbers = " +subtract);
        int multiply = num1 * num2;
        System.out.println("multiplication of two number = " +multiply);
        float divide = num1 / num2;
        System.out.println("division of two number = " +divide);

    }
}
