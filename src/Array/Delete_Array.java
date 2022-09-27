
package Array;

public class Delete_Array {

    public static void main(String[] args) {
       int[] a={10,20,30,40,50};
       Integer[] b= new Integer[a.length-1];
       int index = 3 ;
       int i = 0;
       while(i < a.length-1 ){
           if(i < index){
               b[i] = a[i] ;
           }
           else{
               b[i] = a[i+1];
           }
           i++;
       }
        for (int j : b) {
            System.out.println(j);
        }
    }
    
}
