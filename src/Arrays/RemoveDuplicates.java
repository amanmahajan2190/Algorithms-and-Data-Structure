package Arrays;

/**
 * Created by AMAN on 6/26/2016.
 */
public class RemoveDuplicates {
        public int removeDuplicates(int[] nums) {
            int i = 0;
            for(int n : nums)
                if(i < 1 || n > nums[i - 1])
                    nums[i++] = n;
            return i;
        }

    public static void main(String[] args){
        RemoveDuplicates dups = new RemoveDuplicates();
        dups.removeDuplicates(new int[]{1,2,2,2,3,4,4,4});
    }
}
