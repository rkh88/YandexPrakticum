package FortuneCookie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.util.Collections.singletonList;

public class FortuneCookieFactoryTest {

    private static FortuneCookieFactory fcf;

    @BeforeEach
    public void beforeEach() {
        fcf =   new FortuneCookieFactory(
                new FortuneConfig(true),
                singletonList("positive"),
                singletonList("negative")
        );
    }

    @Test
    public void shouldIncrementCountByOneAfterOneCookieBaked() {
        fcf.bakeFortuneCookie();
        Assertions.assertEquals(1, fcf.getCookiesBaked());
    }

    @Test
    public void shouldIncrementCountByTwoAfterTwoCookiesBaked() {
        fcf.bakeFortuneCookie();
        fcf.bakeFortuneCookie();
        Assertions.assertEquals(2, fcf.getCookiesBaked());
    }

    @Test
    public void shouldSetCounterToZeroAfterResetCookieCreatedCall() {
        fcf.resetCookiesCreated();
        Assertions.assertEquals(0, fcf.getCookiesBaked());
    }
}
