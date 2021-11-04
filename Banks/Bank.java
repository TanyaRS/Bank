package Banks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {

    public static void main(String[] args) {
        Map<Client, Account> personAccount = getPersonAccount();

        Client ryzhkovatatyana = new Client ("Рыжкова Татьяна");
        Account ryzhkovatatyanaAccount = personAccount.get(ryzhkovatatyana);
        System.out.println(ryzhkovatatyanaAccount.scorenumber);
    }

        private static Map<Client, Account> getPersonAccount() {
            Client zauerbreyalena = new Client("Зауербрей Алена");
            Client grishaninsergey = new Client("Гришанин Сергей");
            Client ryzhkovatatyana = new Client("Рыжкова Татьяна");

            Map<Client, Account> personAccount = new HashMap<>();
            personAccount.put(zauerbreyalena, new Account(277463787, 2000));
            personAccount.put(grishaninsergey, new Account(277948499, 1000));
            personAccount.put(ryzhkovatatyana, new Account(277388847,3000));
            return personAccount;
        }
    }


