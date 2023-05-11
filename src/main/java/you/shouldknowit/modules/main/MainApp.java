package you.shouldknowit.modules.main;

//import you.shouldknowit.modules.hello.HelloWorldModule;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.core.lookup.JndiLookup;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting ...");
        Thread.sleep(5000);
        var l = new JndiLookup();
        try {
            System.out.printf("JndiLookup: %s\n", l.lookup("a"));
        } catch (Exception e) {
            System.out.println("JndiLookup catch!");
        }
        //
        ObjectMapper mapper = new ObjectMapper();
        var srcMap = new HashMap<String, String>();
        srcMap.put("a", "b");
        var json = mapper.writeValueAsString(srcMap);
        var map = mapper.readValue(json, Map.class);
        System.out.printf("Result is: %s\nPress Enter to exit!", map.get("a"));
        System.in.read();
    }
}