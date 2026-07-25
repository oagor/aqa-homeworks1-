package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BonusServiceTest {

    @Test
    public void shouldReturnZeroWhenAmountIs1000() {
        BonusService service = new BonusService();

        int actual = service.remain(1000);

        Assert.assertEquals(actual, 0);
    }
}
