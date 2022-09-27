package corejava_Logic_prctice;

public class PascalDiamond {

    public static void main(String[] args) {
        int i, j, k, number;
        for (i = 1; i <= 10; i++) {
            for (j = 10; j > i; j--) {
                System.out.print(" ");
            }
            number = 1;
            for (k = 1; k <= i; k++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
        for(i = 10; i>1; i--){
            for(k = 10; k>=i; k--){
                System.out.print(" ");
            }
            for(j = 1; j<i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
            
        }
    }

}
