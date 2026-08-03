package ru.netology.unit;

import org.junit.jupiter.api.Test;
import ru.netology.service.BonusService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {

    @Test
    void shouldReturnZeroWhenAmountIs1000() {
        BonusService service = new BonusService();

        int actual = service.remain(1000);

        assertEquals(0, actual);
    }
}

