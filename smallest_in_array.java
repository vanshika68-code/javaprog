public class smallest_in_array {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int min = a[0];

        for(int i=1;i<5;i++) {
            if (a[i]<min){
            }
        }
        System.out.println("smallest element in an array : " +min );
    }
}