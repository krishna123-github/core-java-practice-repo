package Array;

public class Insert_Array {

    public static void main(String[] args) {
//        Integer  arr[] =new Integer[]{10,20,30,40,50};
        Integer a[] = {10, 20, 30, 40, 50};
        int value = 66;
        int index = 3;
        Integer b[] = new Integer[a.length + 1];  // new array is instantiated 
                                // beacuse once the array created , its size beacome fixed
                                // so we cant perform insertion operation on same array.
        
        //logic for insertion at Last 
        int i= 0;
        while(i < a.length){
            b[i] = a[i];
            i++;
        }
        b[i] = value;
        
        for (int j : b) {
            System.out.println(j);
        }
    }

}
