 
package corejava_Logic_prctice;
 
public class star {
 
    public static void main(String[] args) {
         for(int i=1; i<=5; i++){
             for(int l=1; l<i; l++){
                 System.out.print(" ");
             }
             for(int j=i; j<=5; j++){
                 System.out.print("*");
                
             }
             for(int k=5; k>i; k--){
                 System.out.print("*");
               
             }
             System.out.println();
             
         }
    }
    
}
