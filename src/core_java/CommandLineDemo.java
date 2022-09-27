
package core_java;
 
public class CommandLineDemo {
 
    public static void main(String[] args) {
        int size = args.length;
        System.out.println("Size = "+size);
        for(String s : args){
            System.out.println(s);
        }
    }
    
    
    
    
}
