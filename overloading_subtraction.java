class subtract {
    int sub(int a , int b){
        return a-b;
    }
    int sub(int a , int b , int c){
        return a-b-c;
    }
}
public class overloading_subtraction {
    public static void main(String [] args){
        subtract a = new subtract();
        System.out.println(a.sub(10,5));
        System.out.println(a.sub(14,7,3));
    }
}
