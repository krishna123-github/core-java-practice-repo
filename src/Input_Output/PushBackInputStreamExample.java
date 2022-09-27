package Input_Output;

import java.io.*;

public class PushBackInputStreamExample {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String str = "1##2#34###12";
        System.out.println(str);
        byte[] b = str.getBytes();

        ByteArrayInputStream bais = new ByteArrayInputStream(b);
        PushbackInputStream pis = new PushbackInputStream(bais);

        int i;
        while ((i = pis.read()) != -1) {
            if (i == '#') {
                int a;
                if ((a = pis.read()) == '#') {
                    System.out.print("**");
                } else {
                    pis.unread(a);
                    System.out.print((char) a);
                }
            } else {
                System.out.print((char) i);
            }
        }

    }

}
