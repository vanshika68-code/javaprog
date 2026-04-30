import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter your age :");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("person is eligible to vote");
        }
        else{
            System.out.println("person is not eligible to vote");
        }
    }
}
