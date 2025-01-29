import java.util.*;
public class dublicateEle {
   public static int dublicate(int []arr){
    int n=arr.length;
    if(n<=1)
    return n;

    int indx=1;
    for(int i=1;i<n;i++){
        if(arr[i] != arr[i-1]){
            arr[indx++]=arr[i];
        }
    }
    return indx;
}
   public static void main(String[] args) {
    int []n ={1, 2, 2, 3, 4, 4, 4, 5, 5};
   int a=dublicate(n);
   for(int i=0;i<a;i++){
   System.out.println(n[i]+" ");

   }
}
    }

