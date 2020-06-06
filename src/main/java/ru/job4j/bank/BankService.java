package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        String passport = user.getPassport();
        for (User user1 : users.keySet()) {
            if (user1.getPassport().equals(passport)) {
                return;
            }
        }
        users.put(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                users.get(user).add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                List<Account> accounts = users.get(user);
                for (Account account : accounts) {
                    if (account.getRequisite().equals(requisite)) {
                        return account;
                    }
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {

        boolean rsl = false;

        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (Objects.isNull(srcAccount) || Objects.isNull(destAccount)) {
            return rsl;
        }
        double srcBalance = srcAccount.getBalance();
        double destBalance = destAccount.getBalance();
        if (srcBalance >= amount) {
            srcAccount.setBalance(srcBalance - amount);
            destAccount.setBalance(destBalance + amount);
            rsl = true;
        }

        return rsl;
    }
}