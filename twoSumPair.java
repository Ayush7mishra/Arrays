//13 oct
import java.util.*;
public class twoSumPair {
    
    public static boolean twoSumPair(int arr[],int x){
      int n=arr.length;
      int sum=0;
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            sum = arr[i]+arr[j];

            if(sum==x){
                return true;
            }
            
        }
      }
      //if no pair found it will return always false
      return false;
    }
    public static void main(String[] args) {
        int arr[]={0,  3, 5,7};
        int x=-2;
      if(twoSumPair(arr, x)){
      System.out.println(true);
      }
      else{
        System.out.println(false);
      }
    }
}
