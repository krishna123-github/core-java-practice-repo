package Design_Patterns;

import java.io.Serializable;
import java.lang.reflect.Constructor;

/**
 *
 * @author krishna
 */
public class SingletonDesignPattern implements Serializable, Cloneable {

    private static volatile SingletonDesignPattern sb;

    private SingletonDesignPattern() {
        // Resttrict in Reflection
        if (sb != null) {
            throw new RuntimeException("Create object by getInstance method");
        }

    }

    // Resttrict in Serialization
    protected Object readResolve() {
        return sb;
    }

    //  Resttrict in Clonable
    @Override
    protected Object clone() {
        return sb;
    }

    public static SingletonDesignPattern getInstance() {
        if (sb == null) {
            synchronized (SingletonDesignPattern.class) {
                if (sb == null) {
                    sb = new SingletonDesignPattern();
                }
            }
        }
        return sb;
    }
}

class Test {

    public static void main(String[] args) {
        System.out.println(SingletonDesignPattern.getInstance());
        System.out.println(SingletonDesignPattern.getInstance());
        System.out.println(SingletonDesignPattern.getInstance());

        SingletonDesignPattern newInst = null;
        try {
            // Get metadata using Reflecction 
            Constructor[] cc = SingletonDesignPattern.class.getDeclaredConstructors();
            for (Constructor c : cc) {
                c.setAccessible(true);
                newInst = (SingletonDesignPattern) c.newInstance();
                break;
            }

        } catch (Exception e) {

        }
        System.out.println(newInst);

    }
}
