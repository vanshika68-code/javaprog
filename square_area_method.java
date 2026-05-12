class square{
    int side = 10;
    void area(){
        int result = side*side;
        System.out.println("area = " + result);
    }
}
public class square_area_method {
    public static void main(String[] args) {
        square s = new square();
        s.area();
    }
}
