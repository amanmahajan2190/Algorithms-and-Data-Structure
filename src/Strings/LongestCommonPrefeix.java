package Strings;

/**
 * Created by AMAN on 6/19/2016.
 */
public class LongestCommonPrefeix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length==0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }

        int minLength = Integer.MAX_VALUE;
        for(String str: strs){
            if(minLength>str.length()){
                minLength = str.length();
            }
        }

        for(int i=0;i<minLength;i++){
            for(int j=0;j<strs.length;j++){
                String s1 = strs[j];
                String s2 = strs[j+1];
                if(s1.charAt(i) != s2.charAt(i)){
                    return s1.substring(0,i);
                }
            }
        }
        return strs[0].substring(0,minLength);
    }
}
