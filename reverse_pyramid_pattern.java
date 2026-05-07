import java.util.*;
public class reverse_pyramid_pattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        for (int i = n-1 ; i>=0; i--){
            for (int j=1;j<=n-i;j++){
                    System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                    System.out.print("*");
            }
            
            System.out.println(" ");
        }

    }
    
}
