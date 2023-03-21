package org.baazigames;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(3, 2, "Arjun");
        Account account2 = new Account(9, 0, "Karn");
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account2.compareTo(account1));
    }
}
