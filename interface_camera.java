interface camera1{
    void capture();
}
interface camera2{
    void record();
}
class mobile implements camera1 , camera2{
    public void capture(){
        System.out.println("capturing photo");
    }
    public void record(){
        System.out.println("recording video");
    }
}
public class interface_camera {
    public static void main(String[] args) {
        mobile m = new mobile();
        m.capture();
        m.record();
    }
    
}
