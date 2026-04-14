import java.util.Scanner;

public class frequency_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter digit to find frequency: ");
        int digit = sc.nextInt();

        int count = 0;
        int temp = num;
        while (temp > 0) {
            int rem = temp % 10;  
             if (rem == digit) {
                count++;
            }
            temp = temp / 10;  
        }
        System.out.println("Frequency of " + digit + " is: " + count);

        sc.close();
    }
}