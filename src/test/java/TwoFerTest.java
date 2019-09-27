import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoFerTest {
    TwoFer twoFer = new TwoFer();

    @Test
    public void X() {
        assertEquals("One for you, one for me.", twoFer.say(null));
    }

    @Test
    public void validInput() {
        assertEquals("One for popcorn, one for me.", twoFer.say("popcorn"));
    }
}