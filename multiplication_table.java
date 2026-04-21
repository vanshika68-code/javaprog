import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int num = sc.nextInt();
        int multi;
        
        for (int i = 1 ; i <= 10 ; i++){
            multi = num*i;
            System.out.println(num + " * " + i + " = " + multi);

        }
    }
}

