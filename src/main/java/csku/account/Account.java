package csku.account;

public class Account {
    private double income;
    private double expense;
    private double account;

    public Account(double account){
//        this.income = income;
//        this.expense = expense;
        this.account = account - expense;

    }
    public void addIncome(double newIn){
        account = account + newIn;
        income = income + newIn;

    }
    public  void pay(double newEx){
        account = account - newEx;
        expense = expense + newEx;
    }
    public String toString(){
        return "Account : " + account + " Income : " + income +
                " Expense : " + expense;
    }

    public double getIncome() {
        return income;
    }

    public double getExpense() {
        return expense;
    }
    public double getAccount(){
        return account;
    }
}
