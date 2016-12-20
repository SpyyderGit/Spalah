package HomeWork.task3_Bank;

import java.util.Scanner;

/**
 * Created by Jerald_PC on 20.12.2016.
 */
public class MainBank {
    public static void main(String[] args) {
        Bank bank = new Bank("ProstoBank");
        bank.addDeposit(new Deposit(10000, 20, "Vasya"));
        bank.addDeposit(new Deposit(100, 20, "Petya"));
        bank.addDeposit(new Deposit(12300, 20, "Olya"));
        bank.addDeposit(new Deposit(100, 20, "Kolya"));

        Scanner year = new Scanner(System.in);


        System.out.println(bank.toString() + " " + bank.payment(year.nextInt()));


    }
}
