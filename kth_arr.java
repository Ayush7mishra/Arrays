import java.util.*;

public class kth_arr {
    public int kthElement(int a[], int b[], int k) {
        int arr[] = new int[a.length + b.length];
        System.arraycopy(a, 0, arr, 0, a.length);
        System.arraycopy(b, 0, arr, a.length, b.length);
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args) {
        int[] a = {100, 112, 256, 349, 770};
        int[] b = {72, 86, 113, 119, 265, 445, 892};
        int k =7;
        kth_arr obj = new kth_arr();

        
        System.out.println("The " + k + " :th smallest element is: " + obj.kthElement(a, b, k));
    }
}
