package HomeWork.task3_Bank;

/**
 * Created by Jerald_PC on 20.12.2016.
 */
public class Deposit {

    private int cash;
    private int percent;
    private String name;

    public Deposit(int cash, int percent, String name) {
        this.cash = cash;
        this.percent = percent;
        this.name = name;
    }

    public int profit(int years) {
        return (years * cash * percent);
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "cash=" + cash +
                ", percent=" + percent +
                ", name='" + name + '\'' +
                '}';
    }
}
