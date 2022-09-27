package core_java;

import core_java.NestedClass.Krishna;
import core_java.NestedClass.Krishna.Duraj;

public class NestedClass {

    public class Krishna {

        public class Duraj {

            public void main(String[] args) {
                for (String s : args) {
                    System.out.println(s);
                }
            }
        }
    }
}

class Test {

    public static void main(String[] args) {

        NestedClass.Krishna.Duraj n = new NestedClass().new Krishna().new Duraj();
        String[] str = {"krishna", "Duraj", "Ritesh"};
        n.main(str);

    }
}
