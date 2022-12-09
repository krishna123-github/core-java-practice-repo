/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author krishna
 */
class TestSingletonClass {

    public static void main(String[] args) {
        CreateSingletonClass obj = CreateSingletonClass.getInstance();
        System.out.println(obj.hashCode());
        
        CreateSingletonClass obj1 = CreateSingletonClass.getInstance();
        System.out.println(obj1.hashCode());
    }
}
