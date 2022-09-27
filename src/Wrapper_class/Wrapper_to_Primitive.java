package Wrapper_class;

//import com.sun.jmx.snmp.SnmpDataTypeEnums;

public class Wrapper_to_Primitive {

    public static void main(String[] args) {

        int a = 3;
        Integer b = Integer.valueOf(a);  //converting into integer
        
        Integer b2 = a;  // autoboxing.. compiler inbult adding Integer.valueOf(.)

    }

}
