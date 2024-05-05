package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class CahbackHackServiseTest {


    @Test
    public void calcCashbackEqual() {
    CashbackHackService service =new CashbackHackService();
int amount = 1000;
int actual = service.remain(amount);
int expected = 0;
assertEquals(actual,expected);
}

    @Test
    public void calcCashbackBelow() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(actual,expected);
}

}
