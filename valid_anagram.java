import java.util.*;
public class valid_anagram {
    public static void main(String[] args) {
        String s = "neet";
        String t = "teem";
        boolean p = isAnagram(s, t);
        System.out.println(p);


    }
    public static boolean isAnagram(String s, String t) {

        int m = t.length();//length of the string t
        int n= s.length(); //length of the string s
        if(n!=m)return false;

        HashMap<Character,Integer> hm = new HashMap<>();


        // its for inserting the all characters of string s in hashmap
        for(int i =0 ;i<n;i++){
            char x = s.charAt(i);

            hm.put(x,hm.containsKey(x)?hm.get(x)+1:1);
        }

        // now removing the second string
        for(int i=0;i<n;i++)
        {
            char x = t.charAt(i);
            if(hm.containsKey(x))
            {

                if(hm.get(x)==1)hm.remove(x);
                else hm.put(x,hm.get(x)-1);
            }
            else{
                return false;
            }
        }

        return hm.size()==0?true:false;
    }
}
