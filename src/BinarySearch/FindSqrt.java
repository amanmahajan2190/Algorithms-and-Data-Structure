package BinarySearch;

/**
 * Created by AMAN on 7/10/2016.
 */
public class FindSqrt {
    public int mySqrt(int x) {
        if(x>Integer.MAX_VALUE){
            return 0;
        }
        return BinarySearch(x,0,x/2);

    }

    public int BinarySearch(int x , int low ,int high){
        if(x ==0 || x ==1){
            return x;
        }
        int ans =1;

        while (true){
            if(low>high)break;
            else{
                int mid = low +(high-low)/2;
                if (mid ==0){
                    return ans;
                }
                if(mid== x/mid){

                    return mid;
                }else if(mid<x/mid){
                    low = mid +1;
                    ans =mid;
                }else{
                    high = mid-1;
                }
            }
        }
        return ans;


    }

    public static void main(String[] args){
        FindSqrt sqrt = new FindSqrt();
        System.out.print(sqrt.mySqrt(3));
    }
}
