package Collection_API;

import java.util.*;

public class Map_HashTable {

    public static void main(String[] args) {
        // TODO code application logic here
        Hashtable hashtable = new Hashtable();
        hashtable.put("1", "One");
        hashtable.put("2", "Two");
        hashtable.put("3", "Three");

        Enumeration e = hashtable.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        // iterate using java8
        // hashtable.forEach((k,v) -> System.out.print(v));
        Employee e1 = new Employee(1, "kp");
        Employee e2 = new Employee(1, "kp");

//        e1.setId(2);
        System.out.println("hashcode e1 " + e1.hashCode());
        System.out.println("hashcode e2 " + e2.hashCode());

        // Not implememt hashcode but equal method there
        // then hashcode will diff but equals methods returns true because values are same
        System.out.println("hashcode e2 = e1 " + e2.equals(e1));

    }

}

/**
 * Immutable class -  class final and all member are private and final Not have setter
 * method ovverride hascode and equals method.
 * Getter for Object reference(like
 * getArrayList, hashmap) must be return copy of the Object
 *
 * @author krishna
 */
final class Employee {

    private final Integer id;
    private final String name;
//    private int hash;

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
//        this.hash = Objects.hash(id, name);
    }

    public Integer getId() {
        return id;
    }

    // Setter didnt work with final class
//    public void setId(Integer id) {
//        this.id = id;
//    }
    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

}
