import java.util.Scanner ;

class calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b){
        return a - b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public double divide (double a, double b){
        if (b != 0){
            return a / b;
        }
        else{
            System.out.println("division by 0 is not possible");
            return 0;
        }
    }
}

public class calculator_test{
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        calculator calc = new calculator();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));
        System.out.println("Division: " + calc.divide(num1, num2));

        
    }
}