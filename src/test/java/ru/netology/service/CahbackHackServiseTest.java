package ru.netology.service;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class CahbackHackServiseTest {


    @Test
    void calcCashbackEqual(){
    CashbackHackService service =new CashbackHackService();
int amount = 1000;
int actual = service.remain(amount);
int expected = 0;
assertEquals(actual,expected);
}
@Test
    void calcCashbackBelow(){
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(actual,expected);
}

}
