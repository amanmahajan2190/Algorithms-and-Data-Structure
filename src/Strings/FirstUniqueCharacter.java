package Strings;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by AMAN on 8/22/2016.
 */
public class FirstUniqueCharacter {
    LinkedHashMap<Character,Integer> charSet = new LinkedHashMap<Character,Integer>();
    Set<Character> checked = new HashSet<Character>();
    public int firstUniqChar(String s) {
        int len =s.length();
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            if(charSet.containsKey(c)){
                charSet.remove(c);
                checked.add(c);
            }else if(!charSet.containsKey(c)&& !checked.contains(c)){
                charSet.put(c,i);
            }
        }
        if(charSet.isEmpty()){
            return -1;
        }else{
            for(char c:charSet.keySet()){
                return charSet.get(c);
            }
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.print(new FirstUniqueCharacter().firstUniqChar("loveleetcode"));
    }
}
