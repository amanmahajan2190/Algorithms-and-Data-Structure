package Strings;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.*;

/**
 * Created by AMAN on 6/19/2016.
 */
public class GroupAnangram {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , ArrayList<String>> anagramsMap = new HashMap<String,ArrayList<String>>();
        List<List<String>> anagramList = new ArrayList<List<String>>();
        for(int i=0;i<strs.length;i++){
            String str = strs[i];
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);
            str = String.valueOf(strArray);
            if(anagramsMap.containsKey(str)){
                ArrayList<String> stringList = anagramsMap.get(str);
                stringList.add(strs[i]);
                anagramsMap.put(str,stringList);
            }else{
                ArrayList<String> stringList = new ArrayList<String>();
                stringList.add(strs[i]);
                anagramsMap.put(str,stringList);
            }
        }
        for(String key : anagramsMap.keySet()){
            ArrayList<String> anagrams = anagramsMap.get(key);
            anagramList.add(anagrams);

        }

        return anagramList;
    }

    public static void main(String [] args){
        GroupAnangram anangram = new GroupAnangram();
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        anangram.groupAnagrams(str);
    }





}
