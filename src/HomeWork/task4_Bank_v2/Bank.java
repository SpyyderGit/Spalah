package HomeWork.task4_Bank_v2;

import java.util.ArrayList;

/**
 * Created by Jerald_PC on 25.12.2016.
 */
public class Bank {
    private ArrayList<Client> clients = new ArrayList<>();

    public void addClient(Client client) {
        clients.add(client);
    }

    public ArrayList<Client> getAllClents() {

        return clients;
    }

    public void getClientInfo(String clientName) {
        for (Client client : clients) {
            if (client.getClientName().equals(clientName)) {
                System.out.println(client);
                System.out.println("Total balance: " + client.getTotalBalance());
            }
        }
    }
}
