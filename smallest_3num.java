import java.util.Scanner;
public class smallest_3num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number :");
        int a = sc.nextInt();
        System.out.print("enter second number :");
        int b = sc.nextInt();
        System.out.print("enter third number :");
        int c = sc.nextInt();

        if (a<b && a<c){
            System.out.print("smallest = " +a);
        }
        else if(b<a && b<c){
            System.out.print("smallest = " +b);
        }
        else{
            System.out.print("smallest = " +c);
        }
    }    
}
