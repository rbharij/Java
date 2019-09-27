import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTest {

    @Test
    public void buzz() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("buzz", fb.say(5));
    }

    @Test
    public void fizzbuzz () {
    FizzBuzz fb = new FizzBuzz();
    assertEquals("fizzbuzz", fb.say(15));
    }


    @Test
    public void fizz () {
    FizzBuzz fb = new FizzBuzz();
    assertEquals("fizz", fb.say(3));
    }

    @Test
    public void Number () {
    FizzBuzz fb = new FizzBuzz();
    assertEquals("2", fb.say(2));
    }
}
