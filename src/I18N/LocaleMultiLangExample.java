 
package I18N;
 
import java.util.Locale;

public class LocaleMultiLangExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale[] locale ={new Locale("en","US"), new Locale("it","IT"), new Locale("in","IN")};
        
        for(int i =0 ;  i<locale.length; i++){
            System.out.println(locale[i].toString()+"      "+locale[i].getDisplayLanguage());
        }
    }
    
}
