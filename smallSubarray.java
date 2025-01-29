//12/10octber
import java.util.*;
public class smallSubarray {
    
    public static int smallsubarray(int []numbers,int n){
          if(n<2)
            return -1;
          int res = numbers[0] + numbers[1];
          for(int i=0;i<n-1;i++)
            res= Math.max(res, numbers[0] + numbers[i+1]);
            return res;
          

    }
    public static void main(String[] args) {
        int numbers[] = {4,3,1,5,6};
        int n=numbers.length;
        System.out.println(smallsubarray(numbers, n));

        
    }
}
