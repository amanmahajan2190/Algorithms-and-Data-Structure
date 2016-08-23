package Strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by AMAN on 7/31/2016.
 */
public class WordBreak {
    public boolean wordBreak(String s, Set<String> wordDict) {
        if(s== null || wordDict.isEmpty()){
            return false;
        }
        if(s.isEmpty()){
            return false;
        }
        int len =s.length();
        boolean[] breakBoolean = new boolean[s.length()+1];
        breakBoolean[0] = true;
        for(int i=1;i<len;i++){
            for(int j=0;j<i;j++){
                if(breakBoolean[j] && wordDict.contains(s.substring(j,i))){
                    breakBoolean[i] = true;
                    break;
                }
            }
        }

        return breakBoolean[s.length()];
    }
    public static void main(String[] args){
        Set<String> stringSet = new HashSet<String>();
        stringSet.add("leet");
        stringSet.add("code");
        System.out.print(new WordBreak().wordBreak("leetcode",stringSet));
    }
}
