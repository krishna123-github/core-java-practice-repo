 
package Wrapper_class;
 
public class Primitive_to_Wrapper {

   
    public static void main(String[] args) {
       
        Integer a = 10 ;
        int b = a.intValue();   // converting Integer to int
        
        int b2 = a;   // autoboxing. compiler will write a.intValue() fuction here
    }
    
}
