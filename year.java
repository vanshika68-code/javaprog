import java.util.Scanner;
public class year {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter a year : ");
       int year = sc.nextInt();
       if(year == 1){
        System.out.println("january");
       }
       else if(year == 2){
        System.out.println("february");
       }
       else if(year == 3){
        System.out.println("march");
       }
       else if(year == 4){
        System.out.println("april");
       }
       else if(year == 5){
        System.out.println("may");
       }
       else if(year == 6){
        System.out.println("june");
       }
       else if(year == 7){
        System.out.println("july");
       }
       else if(year == 8){
        System.out.println("august");
       }
       else if(year == 9){
        System.out.println("september");
       }
       else if(year == 10){
        System.out.println("october");
       }
       else if(year == 11){
        System.out.println("november");
       }
       else{
        System.out.println("december");
       }
   } 
}

