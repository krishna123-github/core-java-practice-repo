/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Inheritence;

/**
 *
 * @author krishna
 */
interface MySqlDbInterface {
    public void getConnection();
}

interface OracleDbInterface {
    public void getConnection();
}

// Class can extends multiple interface
class DatabaseImpl implements MySqlDbInterface, OracleDbInterface {
    @Override
    public void getConnection() {
        System.out.println("Connection made");
    }
}

public interface MultipleInterfaceTest extends MySqlDbInterface, OracleDbInterface {
    public default void getConnection(){
        System.out.println("Default getConnection");
    }
}
 class Test implements MultipleInterfaceTest{
     public static void main(String[] args) {
         OracleDbInterface b = new DatabaseImpl();
         b.getConnection();
         
         MySqlDbInterface t = new Test();
         t.getConnection();
     }
 }