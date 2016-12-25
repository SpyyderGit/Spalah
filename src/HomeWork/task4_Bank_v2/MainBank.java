package HomeWork.task4_Bank_v2;

import java.util.Scanner;

/**
 * Created by Jerald_PC on 25.12.2016.
 */
public class MainBank {
    public static void main(String[] args) {
        Bank bank = new Bank();


        Client petya = new Client("Petya", Sex.W);
        petya.addAcc(new SavingAccount("45656786546462313", 2365.45));
        petya.addAcc(new CheckingAccount("45652365465451212", 23.45, 25));
        petya.addAcc(new SavingAccount("262556232154421", 233.23));
        petya.addAcc(new CheckingAccount("39025631321231", 7895.36, 15));
        petya.addAcc(new SavingAccount("4564231312131231", 23631.4));
        petya.activateAcc("45652365465451212");
        bank.addClient(petya);

        Client masha = new Client("Masha", Sex.W);
        Account deposit = new SavingAccount("3800123123132465", 100);
        Account credit = new CheckingAccount("13215613213565163", 200, 25);
        masha.addAcc(deposit);
        masha.addAcc(credit);

        deposit.addMoney(20);
        deposit.getMoney(40);

        bank.addClient(masha);


        bank.addClient(new Client("Anya", Sex.W));

        System.out.println("Введите имя клиента: ");
        Scanner nameOfClient = new Scanner(System.in);

        bank.getClientInfo(nameOfClient.next());

    }
}
