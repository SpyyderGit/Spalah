package HomeWork.task4_Bank_v2;

/**
 * Created by Jerald_PC on 25.12.2016.
 */
public class CheckingAccount extends Account {


    private double balance;
    private double overdraft;

    public CheckingAccount(String acc, double balance, double overdraft) {
        super(acc, balance);
        this.overdraft = overdraft;

        if (balance < 0) {
            System.err.println("Некорректный ввод");
            super.balance = 0;
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void addMoney(double summa) {
        balance += summa;
    }

    @Override
    public void getMoney(double summa) {
        if ((balance - summa) >= overdraft) {
            balance -= summa;
        } else {
            System.err.println("Баланс не может быть меньше овердрафта");
        }
    }
}
