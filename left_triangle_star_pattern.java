import java.util.*;
public class left_triangle_star_pattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        for (int i = 0; i<=n ; i++){
            for (int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}


