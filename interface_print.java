interface printer{
    void printing();
}
interface scanner {
    void scanning();
}
interface fax{
    void fax();
}
class all_in_one implements printer , scanner , fax{
    public void printing(){
        System.out.println("is printing");
    }
    public void scanning(){
        System.out.println("is scanning");
    }
    public void fax(){
        System.out.println("is faxing");
    }
}
public class interface_print {
    public static void main (String [] args){
        all_in_one alo = new all_in_one();
        alo.printing();
        alo.scanning();
        alo.fax();
    }
    
}
