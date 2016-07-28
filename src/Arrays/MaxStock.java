package Arrays;

/**
 * Created by AMAN on 6/22/2016.
 */
public class MaxStock {

    public int maxProfit(int[] prices) {
        if(prices.length<1){
            return 0;
        }
        int max =0;
        int min =Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(max< prices[i]){
                max =prices[i];
            }
            if(min>prices[i]){
                min =prices[i];
                max=prices[i];
            }
        }
        return max-min;

    }

    public static void main(String[] args){
        int[] arr = new int[] {2,1,4};
        MaxStock m = new MaxStock();
        System.out.print(m.maxProfit(arr));
    }
}
