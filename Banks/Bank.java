package Banks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    public static void main(String[] args) {
        Map<Client, List<Account>>personAccount = getPersonAccount();

        // нашла клиента тут
        Client client = findClientByName(personAccount, "Зауербрей Алена");

        if (client == null) {
            System.out.println("No client");
        } else {
            // ищем счета по клиенту
            List<Account> ryzhkovatatyanaAccount = personAccount.get(client);
            for (Account account : ryzhkovatatyanaAccount) {
                System.out.println(account.scorenumber + " " + account.balance);
            }
        }


        Integer scorenumber = 277463787;
        Account account = findClientByAccount(personAccount, scorenumber);
        if (account == null) {
            System.out.println("no found");
        } else {
            System.out.println("scorenumber = " + scorenumber + " Принадлежит " + account.client.name);
        }
    }

    private static Map<Client, List<Account>> getPersonAccount() {
        Client zauerbreyalena = new Client("Зауербрей Алена");
        List<Account> zauerbreyalenaAccountList = new ArrayList<>();
        zauerbreyalenaAccountList.add(new Account(277463787, 2000, zauerbreyalena));
        zauerbreyalenaAccountList.add(new Account(277463799, 2908685, zauerbreyalena));

       /* Client grishaninsergey = new Client("Гришанин Сергей");
        Client ryzhkovatatyana = new Client("Рыжкова Татьяна");*/

        Map<Client, List<Account>> personAccount = new HashMap<>();
        personAccount.put(zauerbreyalena, zauerbreyalenaAccountList);
      /*  personAccount.put(grishaninsergey, new Account(277948499, 1000));
        personAccount.put(ryzhkovatatyana, new Account(277388847,3000));*/
        return personAccount;
    }

    private static Client findClientByName(Map<Client, List<Account>>personAccount, String clientName) {
        for (Map.Entry<Client, List<Account>> entry : personAccount.entrySet()) {
            if (entry.getKey().name.equals(clientName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    private static Account findClientByAccount(Map<Client, List<Account>> personAccount, Integer scorenumber) {
        List<Account> accountList = getAllAccounts(personAccount);
        for (Account account : accountList) {
            if (account.scorenumber.equals(scorenumber)) {
                return account;
            }
        }

        return null;
    }

    private static List<Account> getAllAccounts(Map<Client, List<Account>> personAccount) {
        List<Account> accountList = new ArrayList<>();
        for (List<Account> clientAccount : personAccount.values()) {
            accountList.addAll(clientAccount);
        }

        return accountList;
    }
}