 
package Object_Cloning;
 
import java.util.logging.Level;
import java.util.logging.Logger;

public class Student implements Cloneable{    // firstly implements the Cloneable interface
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
     
    // override clone() method in Cloneable interface..used to make clone of object... it throw a Exception 
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
    
    public static void main(String[] args) {
        try {
            Student s1 = new Student(102, "krishna");
            
            Student s2 = (Student) s1.clone();
     
            System.out.println(s1.rollno+"    "+s1.name+"     s1---> "+s1.hashCode()+"   "+s1);
            System.err.println(s2.rollno+"    "+s2.name+"     s2---> "+s2.hashCode()+"   "+s2);
            
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
}

/** 
 As you can see in the above example, both reference variables have the same value. Thus, the clone() copies the values of an object to another.
 * So we don't need to write explicit code to copy the value of an object to another.

If we create another object by new keyword and assign the values of another object to this one,
* it will require a lot of processing on this object. So to save the extra processing task we use clone() method.
 **/