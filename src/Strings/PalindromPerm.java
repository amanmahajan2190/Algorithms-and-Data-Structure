package Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AMAN on 8/17/2016.
 * NOt a backtracking problem
 */
public class PalindromPerm {
    Map<Character ,Integer> map = new HashMap<Character, Integer>();
    public boolean canPermutePalindrome(String s) {
        int len =s.length();
        if(len<=0){
            return false;
        }
        boolean even = s.length()%2==0;
        for(int i=0;i<len;i++){
            char c= s.charAt(i);
            if(map.containsKey(c)){
                int freq = map.get(c);
                freq--;
                if(freq==0){
                    map.remove(c);
                }else{
                    map.put(c,freq);
                }

            }else{
                map.put(c,1);
            }
        }
        if(even && map.size()==0){
            return true;
        }
        if(!even && map.size()==1){
            return true;
        }
        return false;

    }

    public static void main(String[] args){
        PalindromPerm perm = new PalindromPerm();
        System.out.print(perm.canPermutePalindrome("aab"));
    }

}
