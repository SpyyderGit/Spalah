package HomeWork.task4_Bank_v2;

import java.util.Scanner;

/**
 * Created by Jerald_PC on 25.12.2016.
 */
public class MainBank {
    public static void main(String[] args) {
        Bank bank = new Bank();

//Клиент Петя
        Client petya = new Client("Petya", Sex.W);
        petya.addAcc(new SavingAccount("45656786546462313", 2365.45));
        petya.addAcc(new CheckingAccount("45652365465451212", 23.45, 25));
        petya.addAcc(new SavingAccount("262556232154421", 233.23));
        petya.addAcc(new CheckingAccount("39025631321231", 7895.36, 15));
        petya.addAcc(new SavingAccount("4564231312131231", 23631.4));
        petya.activateAcc("45652365465451212");
        bank.addClient(petya);


// Клиент Маша
        Client masha = new Client("Masha", Sex.W);
        Account deposit = new SavingAccount("3800123123132465", 100);
        Account credit = new CheckingAccount("13215613213565163", 200, 25);
// добавили счета
        masha.addAcc(deposit);
        masha.addAcc(credit);

// положил на депохит, снял с кредита
        credit.addMoney(20);
        deposit.getMoney(40);
        bank.addClient(masha);


// Клиент Василий
        Client vasya = new Client("Vasya", Sex.M);
        Account depositVasya = new SavingAccount("262556612341231115", 400);
        Account creditVasya = new CheckingAccount("39001218648656123123", 500, 5);
        Account creditVasya1 = new CheckingAccount("9853123123156514132", 200, 15);
// добавили счета


        vasya.addAcc(depositVasya);
        vasya.addAcc(creditVasya);
        vasya.addAcc(creditVasya1);

// положил на кредит, снял с депозита
        creditVasya.addMoney(20);
        depositVasya.getMoney(40);
        bank.addClient(vasya);


        bank.addClient(new Client("Anya", Sex.W));

        System.out.println("Введите имя клиента: ");
        Scanner nameOfClient = new Scanner(System.in);

        bank.getClientInfo(nameOfClient.next());

    }
}
