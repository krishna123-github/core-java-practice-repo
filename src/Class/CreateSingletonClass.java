/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 * 1 private contructor
 * 2 Staic class obj variable
 * 3 public static getInstamce method
 * @author krishna
 */
class CreateSingletonClass {
    private static CreateSingletonClass obj = null;
    private  CreateSingletonClass() {
    }
    
    public static CreateSingletonClass getInstance(){
        if(obj == null){
            obj = new CreateSingletonClass();
        }
        return obj;
    }
}
