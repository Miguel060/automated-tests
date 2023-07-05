package entities;

public class Account {
    private static double DEPOSIT_FEE_PERCENTAGE = 0.02;
    private long id;
    private double balance;
    public Account(){

    }

    public Account(long id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        if(amount >0) {
            amount -= amount * DEPOSIT_FEE_PERCENTAGE;
            balance += amount;
        }
    }
    public void withdraw (double amount){
        if(amount > balance) {
            throw new IllegalArgumentException();
        }
        balance -= amount;
    }
    public double fullWithDraw(){
        double aux = balance;
        balance = 0;
        return aux;
    }

}
