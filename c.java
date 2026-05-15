class a{
    void display1(){
        System.out.println("This is class A");
    }
}
class b extends a{
    void display2(){
        System.out.println("This is class B");
    }
}
class c1 extends b{
    void display3(){
        System.out.println("This is class C");
    }
}
public class c {
    public static void main(String[] args) {
        c1 obj = new c1();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}

