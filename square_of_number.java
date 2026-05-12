import java.util.Scanner;
public class square_of_number {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = num * num;
        System.out.println("Square of " + num + " is: " + result);

    }
}
