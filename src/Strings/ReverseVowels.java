package Strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by AMAN on 7/12/2016.
 */
public class ReverseVowels {
    public String reverseVowels(String s) {
        if(s.length()<=1){
            return s;
        }
        char[] s_aray = s.toCharArray();
            Set<Character> characterSet = new HashSet<Character>();
            characterSet.add('a');
            characterSet.add('e');
            characterSet.add('i');
            characterSet.add('o');
            characterSet.add('u');
            characterSet.add('A');
            characterSet.add('E');
            characterSet.add('I');
            characterSet.add('O');
            characterSet.add('U');

        int i=0;
        int j = s_aray.length-1;
        while(i<=j){
            if(characterSet.contains(s_aray[i]) && characterSet.contains(s_aray[j])){
                swap(s_aray,i,j);
                i++;
                j--;
            }else if(characterSet.contains(s_aray[i]) && !characterSet.contains(s_aray[j])){
                j--;
            }else{
                i++;
            }

        }
        return new String(s_aray);
    }

    public void swap(char[] s_array, int i, int j){
        char temp = s_array[i];
        s_array[i] = s_array[j];
        s_array[j] = temp;
    }
}
