package core_java;

public class CommandLine_without_main_method {

    // this code will rum without main method
    public void Krishna(String[] args) {
        // TODO code application logic here
        int size = args.length;
        System.out.println("length of the size ; " + size);

        for (int i = 0; i < size; i++) {
            System.out.println(args[i]);
        }
    }

}
