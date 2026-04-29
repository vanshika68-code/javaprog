import java.util.*;
public class sum_of_natural_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= n ; i++ ) {
            sum += i;
        }
        System.out.println("sum of first " + n + " natural numbers is " + sum );
    }
    
}
