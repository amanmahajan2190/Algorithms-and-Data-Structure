package Strings;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by AMAN on 8/21/2016.
 */
public class LargestNumber  {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) return "";
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = nums[i]+"";
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String i, String j) {
                String s1 = i+j;
                String s2 = j+i;
                return s1.compareTo(s2);
            }
        });
        if (strs[strs.length-1].charAt(0) == '0') return "0";
        String res = new String();
        for (int i = 0; i < strs.length; i++) {
            res = strs[i]+res;
        }
        return res;
    }
    /*public String largestNumber(int[] nums) {
        int len  = nums.length;
        if(len<=0){
            return "";
        }
        String[] strings = new String[len];
        for(int i=0;i<len;i++){
            strings[i] = nums[i] +"";
        }
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 +o2;
                String s2 = o2 +o1;
                return s1.compareTo(s2);
            }
        });
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<len;i++){
            builder.append(strings[i]);
        }
        return builder.toString();
    }*/
    public static void main(String[] args){
        int[] num = new int[]{1,10,4};
        new LargestNumber().largestNumber(num);
    }
}
