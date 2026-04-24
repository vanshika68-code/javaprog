import java.util.Scanner;
public class natural_number{
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        else{
            return n+sum(n-1);
        }
    }
        
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
        int result = sum(n);
        System.out.println("sum of "+n+" natural number is : " + result);

    }
}