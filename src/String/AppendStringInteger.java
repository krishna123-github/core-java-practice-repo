 
package String;
 
public class AppendStringInteger {
 
    public static void main(String[] args) {
        // TODO code application logic here
        Integer num = 31332;
        String str = "krishna";
        
        StringBuilder sb = new StringBuilder(str);
        sb.append(num);
        
        System.out.println(sb);
    }
    
}
