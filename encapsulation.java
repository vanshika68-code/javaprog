class account{
    private int balance;
    public void deposite(int amount){
        if (amount>0){
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        }
        else{
            System.out.println("invalid deposite amount");
        }
    }
    public void withdraw(int amount){
        if (amount>0 && amount <= balance){
            balance -= amount;
            System.out.println("amount withdrawn: " + amount);
        }
        else{
            System.out.println("invalid withdrawal amount");
        }
    }
    public int getbalance(){
        return balance;
    }
}
public class encapsulation {
    public static void main (String [] args){
        account ac = new account();
        ac.deposite(1000);
        ac.withdraw(500);
        System.out.println("remaining balance: " +ac.getbalance());
    } 
}
