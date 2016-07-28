package Strings;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by AMAN on 7/27/2016.
 */
public class Anagrams {
    public boolean isAnagram(String s, String t) {
        int s_length = s.length();
        int t_length = t.length();

        if(s_length != t_length){
            return false;
        }

        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        new HashSet<Integer>().



        Arrays.sort(s_arr);
        Arrays.sort(t_arr);
        if(String.valueOf(s_arr).equals(String.valueOf(t_arr))){
            return true;
        }else{
            return false;
        }




    }

    public static void main(String[] args){
        new Anagrams().isAnagram("","");
    }
}
