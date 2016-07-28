package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by AMAN on 7/3/201i6.
 */
public class Intersection {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> unique_list = new ArrayList<Integer>();
        HashMap<Integer,Integer> integerHashMap = new HashMap<Integer,Integer>();
        for(int i=0;i<nums1.length;i++){
            if(integerHashMap.containsKey(nums1[i])){
                integerHashMap.put(nums1[i],integerHashMap.get(nums1[i])+1);
            }else{
                integerHashMap.put(nums1[i],1);
            }
        }

        for(int i=0;i<nums2.length;i++){
            if(integerHashMap.containsKey(nums2[i])){
                unique_list.add(nums2[i]);
                int val = integerHashMap.get(nums2[i]);
                val--;
                if(val==0){
                    integerHashMap.remove(nums2[i]);
                }else{
                    integerHashMap.put(nums2[i],val);
                }
            }
        }

        int[] a = new int[unique_list.size()];
        for(int i =0;i<unique_list.size();i++){
            a[i] = unique_list.get(i);
        }
        return a;


    }
}
