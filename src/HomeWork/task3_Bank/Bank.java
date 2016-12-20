package HomeWork.task3_Bank;

import java.util.Arrays;

/**
 * Created by Jerald_PC on 20.12.2016.
 */
public class Bank {
    private String nameOfBank;
    private Deposit[] deposits = new Deposit[10];
    private int i = 0;

    public Bank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    public void addDeposit(Deposit deposit) {
        deposits[i++] = deposit;
    }

    public int payment(int years) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            count += deposits[i].profit(years);
        }
        return count;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "nameOfBank='" + nameOfBank + '\'' +
                ", \ndeposits=" + Arrays.toString(deposits) +
                ",\n i=\n" + i +
                '}';
    }
}
