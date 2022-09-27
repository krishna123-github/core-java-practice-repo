package contructorExample;

import java.lang.reflect.Constructor;
import java.util.Arrays;

//  java Reflection example ...get all constructor throw the Reflection methods

public class PrintConstructorList {

    PrintConstructorList constructorList;

    public PrintConstructorList() {
        System.out.println("constructor 1 ");
    }

    public PrintConstructorList(PrintConstructorList constructorList) {
        this.constructorList = constructorList;
    }

}

class Test {

    public static void main(String[] args) throws ClassNotFoundException {
        Constructor<?>[] list = Class.forName("contructorExample.PrintConstructorList").getConstructors();
        System.out.println(Arrays.toString(list));
    }
}
