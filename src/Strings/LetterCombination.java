package Strings;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by AMAN on 7/10/2016.
 */
public class LetterCombination {
    public List<String> letterCombinations(String digits) {
        String[] arrString = new String[]{"0","1","abc","def","hij","klm","mno","pqrs","tuv", "wxyz"};
        LinkedList<String> ans = new LinkedList<String>();
        ans.add("");
        for(int i=0;i<digits.length();i++){
            int d = Character.getNumericValue(digits.charAt(i));
            while (ans.peek().length()==i){
                String t = ans.remove();
                for(char  c: arrString[d].toCharArray()){
                    ans.add(t+c);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        LetterCombination l = new LetterCombination();
        l.letterCombinations("23");
    }
}
