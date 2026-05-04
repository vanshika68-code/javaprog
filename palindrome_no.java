import java.util.*;
public class palindrome_no {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter a number :");
        int num = sc.nextInt();
        int original = num;
        int rev = 0;
        int rem = 0;
        while(num != 0){
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;

        }

        if(rev == original){
            System.out.println(original + " is a palindrome number ");
        }
        else{
            System.out.println(original + " is not a palindrome number ");
        }
    }
    
}
