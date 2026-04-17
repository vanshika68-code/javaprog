class lock {
    private int pin = 4444;
    private boolean isopen = false;
    public void openlocker(int enterpin){
        if (enterpin == pin){
            isopen = true;
        }
        else{
            System.out.println("wrong pin");
        }
    }
    public void checkstatus(){
        if(isopen){
            System.out.println("locker is open");
        }
        else{
            System.out.println("locker is closed");
        }
    }
}
public class locker {
    public static void main(String[] args) {
        lock a = new lock();
        a.checkstatus();
        a.openlocker(1111);
        a.openlocker(4444);
        a.checkstatus();
    }
    
}
