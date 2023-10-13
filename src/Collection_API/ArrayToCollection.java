 
package Collection_API;
 
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToCollection {
 
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader in   = new BufferedReader(new Buff);
        
        System.out.println("how many Element You want to add: ");
        String nele = in.readLine();
        int n =  Integer.parseInt(nele);
        
        String[] name = new String[n];
        
        for(int i=0; i<n; i++){
            name[i] = in.readLine();       
        }
        
        List<String> list = Arrays.asList(name);
        
        System.out.println("");
        
        for(String s : list){
            System.out.println(s);
        }
        
        // call create premitive type list 
        int[] intArr = {1,2};
       // List<int> list2 = new ArrayList<int>();
    }
    
}
