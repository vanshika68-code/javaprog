class bank{
    public void interest_rate(){
        System.out.println("interest rate");
    } 
}
class SBI extends bank{
    public void interest_rate(){
        System.out.println("interest rate of SBI is 7%");
    }
}
class HDFC extends bank{
    public void interest_rate(){
        System.out.println("interest rate of HDFC is 10%");
    }
}
class ICICI extends bank{
    public void interest_rate(){
        System.out.println("interest rate of ICICI is 8%");
    }
}
public class override_bank {
    public static void main(String[] args) {
        bank b ;
        b = new SBI() ;
        b.interest_rate();

        b = new HDFC();
        b.interest_rate();
        
        b = new ICICI();
        b.interest_rate();
    }
}
