import java.util.*;
public class pyramid_star_pattern {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        for (int i = 0 ; i<=n-1; i++){
            for (int j=0;j<=2*n-2;j++){
                if(i+j>=n-1 && i>=j-n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
    
}
