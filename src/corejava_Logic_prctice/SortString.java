

package corejava_Logic_prctice;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortString {
 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        ArrayList<String>  arrayList = new ArrayList<String>();
        for(int i=1 ; i<=5; i++){
            System.out.print("Enter A String = ");
            arrayList.add(kb.next());
        }
        System.out.println("Before Sorting ------>");
        for(String s : arrayList){
            System.out.println(s);
        }
        System.out.println("==========================");
       
        Collections.sort(arrayList);   //  directly we can Sort the STring using Collection class
        
        System.out.println("After Sorting ------>");
        for(String s : arrayList){
            System.out.println(s);
        }
    }
    
}
