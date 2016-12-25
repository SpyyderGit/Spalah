package HomeWork.task4_Bank_v2;

/**
 * Created by Jerald_PC on 25.12.2016.
 */
public abstract class Account {

    protected double balance;
    protected String acc;

    public Account(String acc, double balance) {

        this.balance = balance;
        this.acc = acc;
    }

    public abstract double checkBalance();

    public abstract void addMoney(double summa);

    public abstract void getMoney(double summa);

    public String getAcc() {
        return acc;
    }

    @Override
    public String toString() {
        return "account: " + acc
                 + ", balance: " + balance
                 + ", Type: "
                 + this.getClass().getSimpleName() + "\n";
    }
}
