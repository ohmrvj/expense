package csku.account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTestAccount {
    Account account;
    @BeforeEach
    void init(){
        account = new Account(1000);
    }
    @Test
    public void testIncome(){
        account.addIncome(1000);
        assertEquals(2000,account.getAccount());
    }
    @Test
    public void testExpense(){
        account.pay(800);
        assertEquals(200,account.getAccount());
    }
    @Test
    public void testCheckAccount(){
        assertEquals(1000,account.getAccount());
    }
    @Test void testCheckIncome(){
        account.addIncome(400);
        assertEquals(400,account.getIncome());
    }
    @Test void testCheckExpense(){
        account.pay(5000);
        assertEquals(5000,account.getExpense());
    }


}
