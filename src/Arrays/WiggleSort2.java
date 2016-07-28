package Arrays;

/**
 * Created by AMAN on 7/22/2016.
 */

//Find median .Elements less than median go left of median and element greater than median go right.And then
//do wiggle sort on each side
public class WiggleSort2 {

    //First Write partion function

    public int partition(int[] a , int low , int high){
        int i =low+1;
        int j =high;
        int pivot = a[low];
        while(i<=j){
            while(i<=j && pivot>a[i]){
                i++;
            }
            while(i<=j && pivot<=a[j]){
                j--;
            }
            if(i<=j){
                swap(a,i,j);
            }

        }
        swap(a,low,j);
        return j;
    }

    //Step 2 find median using partiion

    public int median(int[] a , int low , int high , int k){
        if(low>=high){
            return low;
        }
        int p = partition(a,low, high);
        if(p==k){
            return p;
        }else if(p<k){
          return   median(a, p+1, high,k);
        }else{
           return median(a,low,p-1,k);
        }
    }

    public void wiggleSort(int[] nums){
        if (nums == null || nums.length <= 1) {
            return;
        }

        int n = nums.length;

        int[] temp = new int[n];
        int median = median(nums,0,n-1, (n-1)/2);
        int left =0;
        int right = n-1;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[median]){
                temp[left++] = nums[i];
            }
            if(nums[i]>median){
                temp[right--] = nums[i];
                right--;
            }
        }
        for(int i=left ;i<= right; i++){
            temp[i] = nums[median];
        }

        //Step 3 put the element from temp to nums

         left = (n-1)/2;
        right = n;
        for(int i=0;i<n;i++){
            if(n%2==0){
                nums[i] = temp[left];
                left--;
            }else{
                nums[i] = temp[right];
                right--;

            }
        }

    }

    public void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args){
        int[] a = new int[]{2,3,4,1,3,4,3,3,5,2};
        WiggleSort2 w = new WiggleSort2();
        w.wiggleSort(a);
    }
}
