import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import ru.netology.service.CashbackHackService;

public class Tests {
    @Test
    public void firstTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void secondTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 880;

        int actual = service.remain(amount);
        int expected = 120;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void thirstTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 1000;

        Assertions.assertEquals(expected,actual);
    }

}
