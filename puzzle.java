import java.util.*;

public class puzzle {

    static int[] puzzles(int nums[]){
        int n=nums.length;
        int[] prod=new int[n];
       int left=1;
        int right=1;
        Arrays.fill(prod,1);

        for(int i=0;i<n;i++){
            prod[i]=left;
            left*=nums[i];
        }
        for(int j=n-1;j>=0;j--){
            prod[j]*=right;
            right*=nums[j];
        }
        return prod;
        }
        public static void main(String[] args) {
            int[] arr={10,3,5,6,2};
            int[] res=puzzles(arr);
            for(int val:res){
            System.out.println(val);
        }
    }
}