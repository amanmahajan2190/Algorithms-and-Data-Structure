package Arrays;

/**
 * Created by AMAN on 7/24/2016.
 */
public class SelfProduct {
    public int[] productExceptSelf(int[] nums) {
        int[] p = new int[nums.length];

        int product = 1;
        for(int i=0;i<p.length;++i){
            p[i] = product;
            product *= nums[i];
        }

        product = 1;
        for(int i=p.length-1;i>=0;--i){
            p[i]*=product;
            product*=nums[i];
        }
        return p;
    }

    public static void main(String[] args){
        int[] a = new int[]{1,2,3,4};
        SelfProduct p = new SelfProduct();
        p.productExceptSelf(a);
    }
}
