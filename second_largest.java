public class second_largest {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 34, 89, 56};

        int largest = arr[0];
        int secondlargest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }

        if (secondlargest == arr[0]) {
            System.out.println("No second largest element found");
        } else {
            System.out.println("Second Largest Element is : " + secondlargest);
        }
    }
}