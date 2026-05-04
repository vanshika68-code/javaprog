abstract class vehicle {
    abstract void start();
    abstract void stop();
}
class car extends vehicle{
    void start(){
        System.out.println("car started");
    }
    void stop(){
        System.out.println("car stopped");
    }
}
class bike extends vehicle {
    void start(){
        System.out.println("bike started");
    }
    void stop(){
        System.out.println("bike stopped");
    }
}
class bus extends vehicle{
    void start (){
        System.out.println("bus started");
    }
    void stop(){
        System.out.println("bus stopped");
    }
}
public class abstract_transport {
    public static void main(String [] args){
        vehicle v1 = new car ();
        v1.start();
        v1.stop();
        vehicle v2 = new bike();
        v2.start(); 
        v2.stop();
        vehicle v3 = new bus(); 
        v3.start();
        v3.stop();  
    }
    
}
