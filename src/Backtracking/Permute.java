package Backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AMAN on 7/20/2016.
 */
public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> actualList = new ArrayList<List<Integer>>();
        backTrack(nums,new ArrayList<Integer>(),actualList);
        return actualList;

    }

    public void backTrack(int[] nums, List<Integer> tempList , List<List<Integer>> actualList){
        if(tempList.size()==nums.length){
            actualList.add(new ArrayList<Integer>(tempList));
        }

        for(int i=0;i<nums.length;i++){
            if(tempList.contains(nums[i])) continue;
            tempList.add(nums[i]);
            backTrack(nums,tempList,actualList);
            tempList.remove(tempList.size()-1);
        }
    }


    public static void main(String[] args){
        Permute s = new Permute();
        int[] a = new int[]{1,2,3};
        s.permute(a);
    }


}
