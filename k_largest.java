import java.util.*;
public class k_largest {
    public static List<Integer> largest(int arr[],int k){
        ArrayList<Integer>list=new ArrayList<>();
        Arrays.sort(arr);

        for(int i=arr.length-1;i>=arr.length-k;i--){
            list.add(arr[i]);
        }
        return list;
        }
        public static void main(String[] args) {
            int arr[]={12, 5, 787, 1, 23};
            int k=3;
            System.out.println("Kth largest elements:"+largest(arr, k));

        }
    }


