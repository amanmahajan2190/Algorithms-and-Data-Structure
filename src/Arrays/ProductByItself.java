package Arrays;

/**
 * Created by AMAN on 7/31/2016.
 */
public class ProductByItself {
    public int[] productExceptSelf(int[] nums){
        int len = nums.length;
        int[] result = new int[len];
        if(len<=0){
            return result;
        }

        int[] t1 = new int[len];
        int[] t2 = new int[len];
        t1[0] =1;
        t2[len-1] =1;

        for(int i=0;i<len-1;i++){
            t1[i+1] = t1[i]*nums[i];
        }
        for(int i=len-1;i>=1;i--){
            t2[i-1] = t2[i] * nums[i];
        }

        for(int i=0;i<len;i++){
            result[i] = t1[i] * t2[i];
        }
        return result;


    }

    public static void main(String[] args){
        int[] a = new int[]{1,2,3,4};
        ProductByItself i = new ProductByItself();
        i.productExceptSelf(a);
    }
}
