import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number :");
        int num = sc.nextInt();
        if(num>=90){
            System.out.println("A grade");
        }
        else if(num>=75 && num<=89){
            System.out.println("B grade");
        }
        else if(num>=50 && num<=74){
            System.out.println("C grade");
        }
        else{
            System.out.println("Fail");
        }

    }
}
