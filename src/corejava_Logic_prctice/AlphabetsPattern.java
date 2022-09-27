package corejava_Logic_prctice;

public class AlphabetsPattern {
    // 65 to 91 is equal to A to Z..
    public static void main(String[] args) {
        
        for (int i = 1; i < 27; i++) {
            int alphabet = 97;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) alphabet);
                alphabet++;
            }
            System.out.println();
        }
    }

}
