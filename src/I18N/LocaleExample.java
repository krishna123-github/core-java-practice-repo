/*
 * Internationalization is a mechanism to create such an application that
   can be adapted to different languages and regions.

   Internationalization is one of the powerful concept of java 
   if you are developing an application and want to display messages,
   currencies, date, time etc. according to the specific region or language.
 */
package I18N;
 
import java.util.Locale;

public class LocaleExample {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        
        System.out.println(locale.getCountry());
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayName());
        System.out.println(locale.getISO3Country());
        System.out.println(locale.getISO3Language());
    }
    
}
