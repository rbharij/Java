import org.junit.Ignore;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;


public class StringCalculatorTest {

    @Test
    public void calcReturnsZero(){
        assertEquals(0,Calculator.add(""));
    }

    @Test
    public void calcReturnsTheNumberSent(){ assertEquals(1,Calculator.add("1"));
    }

    @Test
    public void calcReturnsTheSumOfTwoValues(){
        assertEquals(10, Calculator.add("7,3"));
    }

    @Test
    public void calReturnsTheSumOfMultipleValues(){
        assertEquals(20, Calculator.add("5,5,5,5"));
    }

    @Test
    public void calSumOfMultipleValuesAndNewLineDelimeter(){
        assertEquals(6,Calculator.add("1\n2,3"));
    }

    @Test
    public void calSumOfValuesAnyDelimiter(){
        assertEquals(20, Calculator.add("//:\n10:5:3:2") );
    }

    @Test
    public void calcReturnsErrorMessageOnNegativeNumbers(){
        //assertThrows("negatives not allowed: -1", Calculator.add("-1"));
        assertEquals("negatives not allowed: -1", Calculator.add("-1"));
    }

    @Ignore
    public void numbersBiggerthan1000AreIgnored(){
        assertEquals(10,Calculator.add("3,5,2,1000"));
    }

    @Ignore
    public void delimiterCanBeOfAnyLength(){
        assertEquals(20, "//[***]\n10***5***5" );
    }


}



