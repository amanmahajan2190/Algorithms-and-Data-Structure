package Strings;

import java.util.*;

/**
 * Created by amanmahajan on 8/18/2016.
 */
public class PalindromicPAir {
    public List<List<Integer>> palindromePairs(String[] words) {

        List<List<Integer>> result = new ArrayList<List<Integer>>() {
        };
        if (words.length <= 0) {
            return result;
        }

        //A map of string and their index
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }

        //Case 1: if one of the string is Empty. Check other strings are Palindrome or not
        if (map.containsKey("")) {
            int idx = map.get("");
            for (int i = 0; i < words.length; i++) {
                if (isPalindrome(words[i]) && idx != i) {
                    result.add(Arrays.asList(i, idx));
                    result.add(Arrays.asList(idx, i));
                }
            }
        }

        //Case 2: Equal length String .Reverse and check for palindrome
        for (int i = 0; i < words.length; i++) {
            String rev = reverse(words[i]);
            if (map.containsKey(rev)) {
                int idx = map.get(rev);
                if (idx != i) {
                    result.add(Arrays.asList(idx, i));
                    result.add(Arrays.asList(i, idx));

                }
            }
        }

        //Case 3 : Unequal Length String .Cut the String into (0,i) and (i+1, len-1) and search for palindrome for each part

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 1; j < word.length() - 1; j++) {
                String prefix = word.substring(0, j);
                String suffix = word.substring(j);
                if (isPalindrome(prefix)) {
                    String suff_rev = reverse(suffix);
                    if (map.containsKey(suff_rev)) {
                        int idx = map.get(suff_rev);

                        result.add(Arrays.asList(i, idx));

                    }

                }
                if (isPalindrome(suffix)) {
                    String pref_rev = reverse(prefix);
                    if (map.containsKey(pref_rev)) {
                        int idx = map.get(pref_rev);
                        result.add(Arrays.asList(idx, i));
                    }
                }
            }
        }
        return result;

    }

    public  boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }

    public String reverse(String s){
        return    new StringBuilder(s).reverse().toString();
    }
}