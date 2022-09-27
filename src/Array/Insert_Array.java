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
//        int i = 0;
//        // logic for insertion in Given Index 
//        while (i < b.length-1) {   // length = 5... i = 0,1,2,3,4
//            if (i < index) {       //index = 3....true i = 0,1,2
//                b[i] = a[i];    
//            } 
//            else if(i == index){  //true i = 3..where index=3
//                  b[index] = value; // b[3] = value;
//                  b[i+1] = a[i];    
//            }
//            else {               // true for i = 3,4
//                b[i+1] = a[i];     // b[4] = a[3]...b[5] = a[4]
//            }
//            i++;
//        }
        
         // logic for insertion at First 
//        int i = a.length-1;  // i = 4
//        while(i >= 0 ){
//            b[i+1] = a[i] ;
//            i--;
//        }
        
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
