import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringTemplate {
    public String renderSingle(String template, String attribute, String placeholder){
        return template.replace(placeholder, attribute);
    }

    public String renderMultiple(String aTemplate, HashMap<String, String> map) {
        for (String key : map.keySet()) {
            String attribute = map.get(key);
            aTemplate = aTemplate.replace(key, attribute);
        }
        return aTemplate;
    }
}
