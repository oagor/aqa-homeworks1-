package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BonusServiceTest {

    @Test
    public void shouldReturnZeroWhenAmountIs1000() {
        BonusService service = new BonusService();

        int actual = service.remain(1000);

        assertEquals(0, actual);
    }
}
