package Arrays;

/**
 * Created by AMAN on 6/28/2016.
 */

//Basically sort 012 in on pass
public class SortColors {
    public void sortColors(int[] nums) {
        int start =0;
        int end = nums.length-1;
        int length = nums.length;
        int i=0;

        while(i<length){
            if(i!=start && nums[i] ==0){
                int temp = nums[i];
                nums[i]= nums[start];
                nums[start] = temp;
                start++;
            }
            else if(i<end && nums[i] ==2){
                int temp = nums[i];
                nums[i]= nums[end];
                nums[end] = temp;
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args){
        SortColors colors =new SortColors();
        int[] arr = new int[]{0,2,2,1,0,1,2,1,0};
        colors.sortColors(arr);
    }
}
