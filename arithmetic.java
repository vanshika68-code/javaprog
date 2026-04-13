import java.util.Scanner;
public class arithmetic{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("enter second number : ");
        int n2 = sc.nextInt();

        double add = n1+n2;
        double sub = n1-n2;
        double multi = n1*n2;
        double divide = n1/n2;

        System.out.println("addition of two number = " +add);
        System.out.println("subtraction of two number = " +sub);
        System.out.println("multiplication of two number = " +multi);
        System.out.println("division of two number = " +divide);
        sc.close();
    }
}
