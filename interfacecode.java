interface vehicle{
    void start();
}
class car implements vehicle{
    public void start(){
        System.out.println("car starts with key.");
    }
}  
class scooty implements vehicle{
    public void start(){
        System.out.println("scooty starts with kick.");
    }
}
public class interfacecode {
    public static void main(String[] args){
        car c = new car();
        c.start();
        scooty s = new scooty();
        s.start();
    }
    
}
