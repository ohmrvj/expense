package csku.account;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

class StepDefAccount {
    Account account;

    @Before
    public void init(){
        account = new Account(1000);
    }
    @Given("a user has (.*) for account")
    public void a_user_has_for_income(double a){
        account.addIncome(a);
    }

    @When("I add income amount (.*)")
    public void i_add_income_amount(double income){
        account.addIncome(income);
    }
    @When("I expense amount (.*)")
    public void i_expense_amount(double newExpense){
        account.pay(newExpense);
    }
    @When("I want to check my income that is (.*)")
    public void i_want_to_check_my_income_that_is (double income){
        assertEquals(income, account.getIncome());
    }
    @When(("I want to check my expense that is (.*)"))
    public void i_want_to_check_my_expense_that_is (double expense){
        assertEquals(expense,account.getExpense());
    }





}