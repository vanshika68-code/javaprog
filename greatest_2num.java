import java.util.*;
public class greatest_2num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number :");
        int a = sc.nextInt();
        System.out.print("enter second number :");
        int b = sc.nextInt();

        if (a>b){
            System.out.print("greatest = " +a);
        }
        else{
            System.out.print("greatest = " +b);
        }
    }    
}
