

class add {
    int sum(int a , int b){
        return a+b;
    }
    int sum (int a , int b , int c){
        return a+b+c;
    }
}
public class overloading {
    public static void main(String [] args){
        add a = new add();
        System.out.println(a.sum(5,7));
        System.out.println(a.sum(14,7,5));
    }
}
