import java.util.*;
public class reverse_of_no {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :");
        int num = sc.nextInt();
        int original = num;
        int rev = 0;
        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("reverse of " + original + " is " + rev);
    }
    
}
