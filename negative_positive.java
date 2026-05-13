import java.util.Scanner;
public class negative_positive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int a = sc.nextInt();
        if(a<0){
            System.out.println("number is negative");
        }
        else if(a>0){
            System.out.println("number is positive");
        }
        else{
            System.out.println("number is zero");
        }
    }
    
}
