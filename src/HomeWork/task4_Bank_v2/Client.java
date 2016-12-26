package HomeWork.task4_Bank_v2;


import java.util.ArrayList;

/**
 * Created by Jerald_PC on 25.12.2016.
 */

enum Sex {
    M, W
};

public class Client {
    private String clientName;
    private Sex sex;
    private ArrayList<Account> listOfAcc = new ArrayList<>();
    private String activeAcc;


    public Client(String clientName, Sex sex) {
        this.clientName = clientName;
        this.sex = sex;
    }

    public String getClientName() {
        return clientName;
    }

    public Sex getSex() {
        return sex;
    }

    public String getActiveAcc() {
        return activeAcc;
    }

    public void addAcc(Account acc) {
        if (listOfAcc.isEmpty()) {
            activeAcc = acc.getAcc();
        }
        listOfAcc.add(acc);
    }

    public void activateAcc(String acc) {
        for (Account account : listOfAcc) {
            if (account.getAcc().equals(acc)) {
                activeAcc = acc;
            }
        }
    }

    public double getTotalBalance() {
        double balance = 0;
        for (Account account : listOfAcc) {
            balance += account.balance;
        }
        return balance;
    }

    @Override
    public String toString() {
        return  "clientName='" + clientName + '\'' +
                ",\nsex=" + sex +
                ",\nlistOfAcc=" + listOfAcc +
                ",\nactiveAcc='" + activeAcc + '\'' +
                '}' ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (!clientName.equals(client.clientName)) return false;
        return sex == client.sex;
    }

    @Override
    public int hashCode() {
        int result = clientName.hashCode();
        result = 31 * result + sex.hashCode();
        return result;
    }
}
