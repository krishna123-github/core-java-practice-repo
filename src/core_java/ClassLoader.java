
package core_java;

class Hello{
    
}
public class ClassLoader {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class type = Class.forName("core_java.Hello");
        System.out.println(type.getName());
        Hello hello = (Hello) type.newInstance();
        System.out.println(hello.hashCode()+"   "+hello.getClass());
        
        Class type1 =  Hello.class;
        System.out.println("Instance of class: "+type1.getName()+"   hashcode: "+type1.hashCode());
    }
}
