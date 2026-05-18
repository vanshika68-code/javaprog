import java.util.Scanner;
public class search_element {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,8,8,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element to search :");
        int element = sc.nextInt();
        int found = 0;
        int frequency = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]== element){
                found = 1;
                frequency++;
            }
        }
        if(found == 1){
            System.out.println("element found in the array");
            System.out.println("frequency of the element is: " + frequency);
        }
        else {
            System.out.println("element not found in the array");
        }

    }
}
