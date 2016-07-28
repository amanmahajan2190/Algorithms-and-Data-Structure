package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by AMAN on 7/10/2016.
 */
public class OneEditDistance {
    public boolean isOneEditDistance(String s, String t) {
        if(Math.abs(s.length()-t.length())>1){
            return false;
        }
        if(Math.abs(s.length()-t.length())==0){
            return sameLength(s, t);
        }


        if(s.length() ==0 || t.length() == 0){
            return true;
        }

        int count =0;






        String shorter = s.length()<t.length()?s:t;
        String longer = s.length()>t.length()?s:t;
        int i=0,j=0;
        while(i<shorter.length() && j<longer.length()){
            if(shorter.charAt(i) != longer.charAt(j)){
                j++;
                count++;

            }else{
                i++;
                j++;
            }
        }
        if(count>1){
            return false;
        }
        return true;





    }
    private boolean sameLength(String s ,String t){
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != t.charAt(i)){
                count++;
                if(count>1){
                    return false;
                }
            }
        }
        return true;

    }


    public static void main(String[] args){
        OneEditDistance distance = new OneEditDistance();
        distance.isOneEditDistance("123","1234");
    }
}
