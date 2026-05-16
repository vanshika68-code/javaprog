import java.util.*;
public class attendence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the total number of classes held :");
        int total_classes = sc.nextInt();
        System.out.print("enter the number of classes attended :");
        int attended_classes = sc.nextInt();
        double percentage = (attended_classes * 100.0) / total_classes;
        System.out.println("total attendance = " + percentage + "%");
        if (percentage >= 75) {
            System.out.println("you are allowed to sit in the exam. ");
        } else {
            System.out.println("you are not allowed to sit in the exam. ");
        }
        sc.close();
    }
}
