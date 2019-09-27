import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;

public class StringTemplateTest{

    StringTemplate st = new StringTemplate();
    @Test
    public void replaceAPlaceholderWithAnAttribute(){
        String aTemplate = "Hello %Name";
        String placeholder = "%Name";
        String attribute = "Raj";
        assertEquals("Hello Raj", st.renderSingle(aTemplate,attribute, placeholder));
    }
    @Test
    public void replaceAPlaceholderInAString(){
        HashMap map = new HashMap();
        String aTemplate = "Hello %Name";
        map.put("Name", "Raj");
        assertEquals("Hello Raj", st.renderMultiple(aTemplate,map));
    }
    @Test
    public void replaceMultiplePlaceholdersInAString(){
        HashMap map = new HashMap();
        String aTemplate = "Hello %FirstName %LastName";
        map.put("FirstName", "Raj");
        map.put("LastName", "Bharij");
        assertEquals("Hello Raj Bharij", st.renderMultiple(aTemplate,map));
    }
}