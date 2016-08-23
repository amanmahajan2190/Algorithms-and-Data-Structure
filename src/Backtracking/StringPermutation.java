package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AMAN on 8/17/2016.
 */
public class StringPermutation {

    public List<String> permute(String s){
        List<String> result = new ArrayList<String>();
        if(s== null){
            return result;
        }
        backTrack(s,0,result,"");
        return result;
    }

    public void backTrack(String permute,int i,List<String> res,String builder){
        if(i>=permute.length()-1){
            res.add(builder);

        }

        for(int j=0;j<permute.length();j++){
            if(!builder.contains(permute.charAt(i)+"")){
                builder =builder+permute.charAt(i);
                backTrack(permute,i+1,res,builder);
                builder.replace(builder.charAt(builder.length()-1)+"","");
            }

        }

    }
    public static void main(String[] args){
        StringPermutation p = new StringPermutation();
        p.permute("abc");
    }
}
