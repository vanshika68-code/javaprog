import java.util.Scanner;
public class driving_licence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("enter your age :");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("person is eligible to get driving licence");
        }
        else{
            System.out.println("person is not eligible to get driving licence");
        }
    }
}
