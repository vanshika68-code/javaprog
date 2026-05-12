class rectangle{
    int length = 10;
    int breadth = 5;
    void area (){
        int result =  length * breadth;
        System.out.println("area = " + result);
    }
}
public class area_rect_using_method {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.area();
    }
}
