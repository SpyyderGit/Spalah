package HomeWork.task4_Bank_v2;

/**
 * Created by Jerald_PC on 25.12.2016.
 */
public class SavingAccount extends Account {


    public SavingAccount(String acc, double balance) {
        super(acc, balance);

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
        if ((balance - summa) > 0) {
            balance -= summa;
        } else {
            System.err.println("Депозит не может быть < 0");
        }
    }

    @Override
    public String getAcc() {
        return super.getAcc();
    }

}
