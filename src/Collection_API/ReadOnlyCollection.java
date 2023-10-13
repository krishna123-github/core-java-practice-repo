package Collection_API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ReadOnlyCollection {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        String[] str = new String[5];
        for (int i = 0; i < 5; i++) {
            str[i] = br.readLine();
        }

        List stuff = Arrays.asList(str);
        List list = new ArrayList(stuff);
        list = Collections.unmodifiableList(list);
        list.set(5, "krishna"); 
        
        Set set = new HashSet(stuff);
        set = Collections.unmodifiableSet(set);
        
        Map map = new HashMap((Map) stuff);
        map = Collections.unmodifiableMap(map);
        map.put("s", "ff");
        
        System.out.println("Collectiion is read only now");
    }

}
