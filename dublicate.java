  //10 oct
  import java.util.*;
public class dublicate {

   public static ArrayList<Integer> dublicate(int []arr){
    int n=arr.length;
    ArrayList<Integer>re=new ArrayList<>();
    for(int i=0;i<n;i++){
        arr[arr[i]%n]+=n;
    }
    for(int i=0;i<n;i++){
        if(arr[i]>=2*n){
            re.add(i);
        }
        if(arr[i]>=2*n){
            re.add(i);
            }
        }
        if(re.isEmpty()){
            re.add(-1);
        
        }
        return re;

    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,3,7,55,3};
        ArrayList<Integer> re = dublicate(arr);
        System.out.println(re);
    }
}
