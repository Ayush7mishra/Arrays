//13
import java.util.*;
public class rotate {
    
    public static void rotateArray(int arr[],int d){
        ArrayList<Integer>list=new ArrayList<>();
        int n=arr.length;
        if (d>n){
            d=d%n;
        }
        for(int i=0;i<d;i++){
            list.add(arr[i]);
        }
        int count=0;
        for(int i=d;i<n;i++){
            arr[count]=arr[i];
            count++;
        }
        for(int i=0;i<d;i++){
            arr[count]=list.remove(0);
            count++;
        }
        }
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5};
            int d=2;
            rotateArray(arr, d);
            for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            }
        }
            
        }

