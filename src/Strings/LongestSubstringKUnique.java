package Strings;

import java.util.*;

/**
 * Created by AMAN on 6/17/2016.
 */
public class LongestSubstringKUnique {
    private String str;
    LongestSubstringKUnique(String s){
        this.str =s;
    }
    public void findLongestSubstring(int K){
        Map<Character,Integer> characterMap = new HashMap<Character,Integer>();
        int l=0;
        int h=0;
        int MAX =0;
        for(int i=0;i<str.length();i++){
            if(characterMap.size()<=K){
                if(characterMap.containsKey(str.charAt(i))){
                characterMap.put(str.charAt(i),characterMap.get(str.charAt(i))+1);
                }else {
                    characterMap.put(str.charAt(i),1);
                }


            }

            if(characterMap.size()>K){

                while (characterMap.size()>K){
                    int val = characterMap.get(str.charAt(l));
                    val = val-1;
                    if(val==0){
                        characterMap.remove(str.charAt(l));
                    }else{
                        characterMap.put(str.charAt(l),val);
                    }

                    l++;
                }
            }
            int max = h - l+1;
            if (max > MAX) {
                MAX = max;
            }
            h++;
        }
        System.out.print(MAX);
    }

    public static void main(String[] args){
        LongestSubstringKUnique longestSubstringKUnique= new LongestSubstringKUnique("aa");
        longestSubstringKUnique.findLongestSubstring(2);
    }
}
