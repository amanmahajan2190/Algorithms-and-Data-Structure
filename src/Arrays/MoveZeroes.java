package Arrays;

/**
 * Created by AMAN on 7/9/2016.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j =0;
        int length =nums.length-1;
        while(j<= length){
            if(nums[j] !=0){
                nums[i]=nums[j];
                i++;
            }
            j++;
        }
        while (i<=nums.length-1){
            nums[i]=0;
            i++;
        }


    }



    public static void main(String[] args){
        MoveZeroes m = new MoveZeroes();
        int [] a = new int[]{1,0,1};
        m.moveZeroes(a);
    }
}
