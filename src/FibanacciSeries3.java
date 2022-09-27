
import java.util.*;
 
/* Name of the class has to be 'Main' only if the class is public. */
class FibanacciSeries3
{
	public static void main (String[] args) throws java.lang.Exception
	{
// 		BufferedReader r = new BufferedReader (new InputStreamReader (System.in));
// 		String s ;
        int  a =1;
        int  b =1, c , d =0;
		Scanner kb = new Scanner(System.in);
                System.out.println("Enter ");
		int min = kb.nextInt();
		int max = kb.nextInt();
		
	   for(c = 2; max >= c; c=a+b){
	       a = b;
	       b = c;
               d = c;
               System.out.println(c);
	       
	       if((c % 3) == 0 &&  c>min && c<max){
	           System.out.println("result "+c);
	           break;
	       }
              
	   }
            if((d%3)!=0 && d < max && d>min){
                System.out.println("Not1 = "+0);
            }
            else if(min < 3 || min<0 && max<3 || max< 0){
                System.out.println("Not2 = "+0);
            }
         
		
// 		while (!(s=r.readLine()).startsWith('42')) System.out.println(s);
	}
}