package you.shouldknowit.modules.main;

//import you.shouldknowit.modules.hello.HelloWorldModule;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        var srcMap = new HashMap<String, String>();
        srcMap.put("a", "b");
        var json = mapper.writeValueAsString(srcMap);
        var map = mapper.readValue(json, Map.class);
        System.out.printf("Result is: %s", map.get("a"));
    }
}