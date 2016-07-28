package Arrays;

/**
 * Created by AMAN on 7/24/2016.
 */
public class TwoSumBS {
    public int[] twoSum(int[] numbers, int target) {
        int length = numbers.length;
        int[] result = new int[2];
        if(length>1){
            for(int i=0;i<length;i++){
                int num = BinarySearch(numbers,0,length-1,target-numbers[i]);
                if(num !=-1){
                    if(num == i){
                        if(numbers[num] == numbers[i+1]){
                            result[0] = num+1;
                            result[1] = num+2;
                            break;
                        }
                    }else {
                        result[0] = i+1;
                        result[1] = num+1;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public int BinarySearch(int[] a , int low , int high, int t){
        if(low<=high){
            int mid = low + (high-low)/2;
            if(a[mid] == t){
                return mid;
            }else if(a[mid]<t){
                return BinarySearch(a,mid+1, high,t);
            }else{
                return BinarySearch(a, low , mid-1,t);
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] a = new int[]{1,2,3,4,4,9,56,90};
        TwoSumBS bs = new TwoSumBS();
        bs.twoSum(a,8);

    }
}
