package csku.account;

public class Main {
    public static void main(String[] args) {
        Account a = new Account(0);
        System.out.println(a.toString());
        a.addIncome(100);
        System.out.println(a.toString());
        a.pay(50);
        System.out.println(a.toString());
        a.addIncome(500);
        System.out.println(a.toString());
//        System.out.println(a.getIncome());
//        System.out.println(a.getExpense());
//        System.out.println(a.getAccount());

    }
}
