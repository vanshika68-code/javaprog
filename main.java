class bank{
    private int balance;
    public void setbalance(int b){
        balance = b;
    }
    public int getbalance(){
        return balance;
    }
}
public class main {
    public static void main(String[] args) {
        bank bank1 = new bank();
        bank1.setbalance(1000);
        System.out.println("balance: " + bank1.getbalance());
    }
    
}
