import java.util.*;
public class element {

    public static int maxDistance(int [] arr,int n){
    int maxD = -1;
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){

            if(arr[i]==arr[j]){
                int temp = Math.abs(j-i);
                maxD = maxD > temp ?maxD :temp;
            }

        }
    }
    return maxD;
}
public static void main(String[] args) {
    int []arr = {1,2,4,1,3,4,2,5,6,5};
    System.out.println("maximum distance between two occurrence of same element in arr");
    maxDistance(arr, 10);
}
}
