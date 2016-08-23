package Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AMAN on 8/13/2016.
 */
public class Duplicate2 {
    public int removeDuplicates(int[] nums) {
        int count =1;
        int k=0;
        int len =nums.length;
        int size =1;
        nums[k++] = nums[0];

        for(int i=1;i<len;i++){
            if(nums[i] == nums[i-1]){
                count++;
                if(count<=2){
                    nums[k++] = nums[i];
                    size++;
                }
            }else{
                nums[k++] = nums[i];
                count =1;
                size++;
            }

        }

        return size;

    }

    public static void main(String[] args){
        int[] a = new int[]{1,1,1,2,2,3};
        System.out.print(new Duplicate2().removeDuplicates(a));
    }
}
