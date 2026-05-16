interface car {
    void start();
}  
class scooty implements car{
    public void start(){
        System.out.println("scooty starts with kick.");
    }
}
public class car_interface {
    public static void main(String[] args){
        scooty s = new scooty();
        s.start();
    }
    
}
