import java.util.*;
public class trapping {
    public static int rainWater(int height[]){
      int n=height.length;
         //calculate left max boundry-array 
         int leftMax[]=new int [n];
         leftMax[0]=height[0];
         for(int i=1;i<n;i++){
          leftMax[i]=Math.max(height[i],leftMax[i-1]);
         }
       //calculate right max 
       int rightMax[]=new int [n];
       rightMax[n-1]=height[n-1];
       for(int i=n-2;i>=0;i--){
        rightMax[i]=Math.max(height[i],rightMax[i+1]);
       }
       int trapWater=0;
       for(int i=0;i<n;i++){
        int waterLevel=Math.min(leftMax[i],rightMax[i]);

         trapWater+=waterLevel-height[i];
       }
       return trapWater;
      }

      public static void main(String[] args) {
        int arr[]={3,0,0,2,0,4};
        System.out.println(rainWater(arr));
      }
      }
