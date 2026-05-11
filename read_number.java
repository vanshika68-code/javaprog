import java.util.*;
public class read_number {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        System.out.println("you entered: " + n);
        sc.close();
    }
}
