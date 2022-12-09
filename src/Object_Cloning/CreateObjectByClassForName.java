/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object_Cloning;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author krishna
 */
public class CreateObjectByClassForName {
    public void display(){
        System.out.println("Create object by class for name method");
    }
}

class Test{
    public static void main(String[] args) {
        CreateObjectByClassForName obj = null;
        try {
            obj = (CreateObjectByClassForName) Class.forName("Object_Cloning.CreateObjectByClassForName").getConstructor().newInstance();
        obj.display();
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}