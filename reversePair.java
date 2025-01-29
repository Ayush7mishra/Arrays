import java.util.*;
public class reversePair{
    public static int reverse(int arr[]){
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > 2* arr[j]){
                  count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,1,20};
        System.out.println("reverse pair is:"+reverse(arr));
    }

}