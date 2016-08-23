package Strings;

import java.util.HashMap;

/**
 * Created by AMAN on 8/20/2016.
 */
public class LongestSubstring {

    HashMap<Character,Integer> map = new HashMap<Character, Integer>();


    public int lengthOfLongestSubstring(String s) {
        int len =s.length();
        if(len<=0){
            return len;
        }
        int start =0;
        int end=0;
        int max = -1;
        for(end=0;end<len;end++){
            char c= s.charAt(end);
            if(!map.containsKey(c)){
                map.put(c,end);
            }else{
                if(max<(end-start)){
                    max = end-start;
                }
                int idx = map.get(c);

                while (start<idx+1){
                    map.remove(s.charAt(start));
                    start++;
                }

                map.put(c,end);

            }
        }
        if(max <(end-start)){
            max = end-start;
        }
        return max;
    }

    public static void main(String[] args){
        LongestSubstring s = new LongestSubstring();
        System.out.println(s.lengthOfLongestSubstring("abba"));
    }
}
