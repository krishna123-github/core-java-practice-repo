
package String;

public class AddingString {

    void check() {
        String a = "Krishna";
        String b = "pooja";
        System.out.println("a: "+a.hashCode()+"    b: "+b.hashCode() +"     "+(a==b)+"  "+a.equals(b));
        a = a.concat(b);        //here new object will assign to a .
        System.out.println("a concate: "+a+ "   "+a.hashCode());
        System.out.println("---------------------------------------");
        
        StringBuilder sb = new StringBuilder(a);
        System.out.println(sb.hashCode());
        sb.append(123);     // here is will modify to same object, new Object not assign to exiting object
        a = new String(sb);
        System.out.println("sb sb.append: "+sb.hashCode()+"    "+a+" "+a.hashCode()+"    sb: "+sb);
        
        System.out.println("----------------------------------------");
         StringBuffer sr = new StringBuffer(a);
        System.out.println(sr.hashCode());
        sr.append(123);     // here is will modify to same object, new Object not assign to exiting object
        a = new String(sr);
        System.out.println("sr sr.append: "+sr.hashCode()+"    "+a+" "+a.hashCode()+"    sb: "+sr);
        
        System.out.println("----------------------------------------");
    
        
        String c = "asdfghj";
        a += c;              //here new object will assign to a .
        System.out.println("a '+': "+a.hashCode()+"   "+a);
         
        
    }   
}

class TestString1{
    public static void main(String[] args) {
        AddingString as = new AddingString();
        as.check();
    }
}