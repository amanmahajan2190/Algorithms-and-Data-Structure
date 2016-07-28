package Backtracking;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by AMAN on 7/20/2016.
 */
public class Subset {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> actualList = new ArrayList<List<Integer>>();
        backTracking(0,nums,actualList,new ArrayList<Integer>());
        return actualList;

    }

    public void backTracking(int start, int[] nums,List<List<Integer>> actualList, List<Integer> tempList ){
        actualList.add(new ArrayList<Integer>(tempList));
        for(int i=start;i<nums.length;i++){
            tempList.add(nums[i]);
            backTracking(i+1, nums, actualList,tempList);
            tempList.remove(tempList.size()-1);
        }
    }

    public static void main(String[] args){
        Subset s = new Subset();
        int[] a = new int[]{1,2,2};
        s.subsets(a);
    }
}
