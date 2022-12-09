 
package core_java;
 
public class WithoutSemicolon {
 
    public static void main(String[] args) {
        // only change here... write-- printf-- in place of-- 'q        println--
      if(System.out.printf("Krishna") == null){
          System.out.println("IF");
      }else{
          System.out.println("ELSE");
          System.out.printf("Krishna");
      }
        
    }
    
}
