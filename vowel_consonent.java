import java.util.Scanner;
public class vowel_consonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a character :");
        char num1 = sc.next().charAt(0);
        if((num1 == 'a')||(num1 == 'e')||(num1 == 'i')||(num1 == 'o')||(num1 == 'u')||(num1 == 'A')||(num1 == 'E')||(num1 == 'I')||(num1 == 'O')||(num1 == 'U')){
            System.out.println("it is a vowel");
        }
        else{
            System.out.println("it is a consonant");
        }
    }
}