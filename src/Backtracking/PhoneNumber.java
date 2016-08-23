package Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by AMAN on 8/17/2016.
 */
public class PhoneNumber {
    Map<Integer,String> map;
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        int len = digits.length()-1;
        if(len<=0){
            return result;
        }
        map =new HashMap<Integer, String>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        backtrack(result,0,digits,new StringBuilder());
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
        return result;


    }

    public void backtrack(List<String> res, int i , String digit,StringBuilder temp){
        if(i>digit.length()-1){
            res.add(temp.toString());
            return;
        }
        int dig = Integer.parseInt(digit.charAt(i)+"");
        String val = map.get(dig);
        for(int j=0;j<val.length();j++){
            temp.append(val.charAt(j));
            backtrack(res,i+1,digit,temp);
            temp.deleteCharAt(temp.length()-1);
        }

    }
    public static void main(String[] args){
        String digit ="29";
        PhoneNumber p = new PhoneNumber();
        p.letterCombinations(digit);
    }
}
