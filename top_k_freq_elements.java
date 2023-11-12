import java.util.*;
public class top_k_freq_elements {
    public static void main(String[] args) {

        int nums[] = {1,1,1,2,2,3};
        int k = 2;

        int res[] = topKFrequent(nums,k);
        for(int i: res) System.out.print(i+" ");

    }
    public static int[] topKFrequent(int[] nums, int k) {

        // hashmap for storing number with its freequency
        HashMap<Integer,Integer> hm = new HashMap<>();


        // all values with the currect frequency are stored
        for(int i: nums)
            hm.put(i,hm.containsKey(i)?hm.get(i)+1:1);



        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> fre = new ArrayList<>();


        int j=0;
        for(int i: hm.keySet())
        {
            num.add(i);
            fre.add(hm.get(i));
        }


        int arr[] = new int [k];
        int x=0;
        while(x<k)
        {
            int max = 0;
            for(int i=0;i<num.size();i++)
            {
                if(fre.get(i)>fre.get(max))
                {
                    max=i;
                }
            }

            arr[x]= num.get(max);
            num.remove(max);
            fre.remove(max);

            x++;
        }

        return arr;



    }

}
