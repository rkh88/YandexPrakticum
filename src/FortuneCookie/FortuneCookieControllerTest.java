package FortuneCookie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static java.util.Collections.singletonList;

public class FortuneCookieControllerTest {

    private static FortuneCookieController goodController;
    private static FortuneCookieController badController;

    @BeforeAll
    static void beforeAll() {
        FortuneCookieFactory goodFcf = new FortuneCookieFactory(
                new FortuneConfig(true),
                singletonList("positive"), singletonList("negative")
        );
        goodController = new FortuneCookieController(goodFcf);
        FortuneCookieFactory badFcf = new FortuneCookieFactory(
                new FortuneConfig(false), singletonList("positive"), singletonList("negative")
        );
       badController = new FortuneCookieController(badFcf);
    }

    @Test
    public void shouldReturnPositiveFortune() {
        String cookieText = goodController.tellFortune().getFortuneText();
        Assertions.assertEquals("positive", cookieText);
    }

    @Test
    public void shouldReturnNegativeFortune() {
        String cookieText = badController.tellFortune().getFortuneText();
        Assertions.assertEquals("negative", cookieText);
    }

}
