public class largest_in_array {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int max = a[0];
        
        for(int i=1;i<5;i++) {
            if (a[i]>max){
                max = a[i];
            }
            
        }
        System.out.println("largest element in an array : " +max);
    }
    
}
