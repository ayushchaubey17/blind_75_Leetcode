import java.util.*;
public class contains_Duplicate {
    public static void main(String[] args) {

       int arr[] = {1,2,1,2,1,2};
     boolean ak =    containsDuplicate(arr);
        System.out.println(ak);
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i: nums)
        {
            if(hs.contains(i))return true;
            hs.add(i);
        }
        return false;

    }
}
