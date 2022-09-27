 
package String;
 
public class RemoveVovelsFromString {
 
    public static void main(String[] args) {
         String str = "krishna pal patel";
         
         String s = str.replaceAll("[aeiouAEIOU]", "");     // here keep the  ("[array with String]")
         
         System.out.println(s);
    }  
}
