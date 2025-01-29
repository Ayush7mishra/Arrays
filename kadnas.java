//14 oct
import java.util.*;

public class kadnas{
    public static int maxSubArray(int arr[]){
        int sum=0;
        int res =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            res=Math.max(res,sum);

        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
       System.out.println( maxSubArray(arr));
    }
    }
      