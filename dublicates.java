import java.util.*;
public class dublicates {
    public static int dub(int nums[]){
        HashSet <Integer> n=new HashSet<>();
        for(int i:nums){
            if(n.contains(i)){
                return i;
            }
            else{
                n.add(i);
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        dublicates d1=new dublicates();
        System.out.println("Duplicate is: " + d1.dub(nums));
    }
    
}
