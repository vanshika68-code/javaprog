public class one_array_to_another {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            arr2[i] = arr[i];
        }
        System.out.println("elements of arr2 :");
        for(int i = 0;i<arr2.length;i++){
            System.out.print(arr2[i]+ " ");
        }
    }
}
