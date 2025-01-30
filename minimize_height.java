import java.util.*;
public class minimize_height {
    public static int height(int arr[],int k,int n){
        Arrays.sort(arr);
        int res=arr[n-1]-arr[0];
        int small=arr[0]+k;
        int lar=arr[n-1]-k;

        int sum=0;
        int la=0;
        for(int i=0;i<n-1;i++){
            sum=Math.min(small,arr[i+1]-k);
            la=Math.max(lar,arr[i]+k);
            if(sum<0)
            continue;
            res=Math.min(res,la-sum);
        }
        return res;
        }
        public static void main(String[] args) {
            int arr[]={1,5,8,10};
            int k=2;
           int res= height(arr, k, arr.length);
            System.out.println(res);
        }

    }
