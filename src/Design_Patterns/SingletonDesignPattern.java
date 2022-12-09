package Design_Patterns;

/**
 *
 * @author krishna
 */
public class SingletonDesignPattern {

    private static volatile SingletonDesignPattern sb;

    private SingletonDesignPattern() {
        if (sb != null) {
            throw new RuntimeException("Create object by getInstance method");
        }
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
    }
}
