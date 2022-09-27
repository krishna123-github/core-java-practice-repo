 
package Serializable_Interface;

import java.io.Serializable;

 // this pojo class should implements Serialisable interface 
public class Emp implements Serializable{
    int id;
    String name;
    transient String dept;
}
