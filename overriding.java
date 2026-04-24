class transport {
    public void move (){
        System.out.println("transport is moving");
    }
    public void fuel(){
        System.out.println("transport uses fuel");
    }
}
class bus extends transport {
    public void move(){
        System.out.println("bus moves on road");
    }
    public void fuel(){
        System.out.println("it uses diesel");
    }
}
class train extends transport {
    public void move(){
        System.out.println("train moves on track");
    }
    public void fuel(){
        System.out.println("it uses coal");
    }
}
class aeroplane extends transport{
    public void move(){
        System.out.println("aeroplane flies in sky");
    }
    public void fuel(){
        System.out.println("it uses special fuel");
    }
}
public class overriding{
    public static void main (String[] args){
        transport t;
        t = new bus();
        t.move();
        t.fuel();
        System.out.println();

        t = new train();
        t.move();
        t.fuel();
        System.out.println();

        t = new aeroplane();
        t.move();
        t.fuel();
        System.out.println();

    }
}