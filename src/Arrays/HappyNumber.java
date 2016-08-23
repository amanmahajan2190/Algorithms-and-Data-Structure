package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by AMAN on 8/1/2016.
 */
public class HappyNumber {
    Set<String> numberSet = new HashSet<String>();
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        String num =n+"";
        int sum =0;
        if(numberSet.contains(num)){

            return false;
        }else{
            numberSet.add(num);

            for(int i=0 ;i<num.length();i++){
                int number = Integer.parseInt(num.charAt(i)+"");
                sum += number*number;

            }
        }
        return isHappy(sum);


    }

    public static void main(String[] args){
        HappyNumber n = new HappyNumber();
        n.isHappy(19);
    }
}
