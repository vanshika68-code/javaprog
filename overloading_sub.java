class sub {
    int diff(int a , int b){
        return a-b;
    }
    int diff (int a , int b , int c){
        return a-b-c;
    }
}
public class overloading_sub {
    public static void main(String [] args){
        sub s = new sub();
        System.out.println(s.diff(10,7));
        System.out.println(s.diff(14,4,5));
    }
}

