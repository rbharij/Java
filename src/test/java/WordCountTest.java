import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;


public class WordCountTest
{

    WordCount WC = new WordCount();

    @Test
    public void CountNumberOfWords()
    {
        //String to check
        String inputText = "John Doe says hi to John Doe";
        HashMap map2 = new HashMap();
        map2.put("John", 2);
        map2.put("Doe", 2);
        map2.put("says", 1);
        map2.put("hi", 1);
        map2.put("to", 1);
        //Compare the hashmaps
        assertEquals(map2, WC.Count(inputText));
    }
}


