package HackerRank;

/**
 * Created by AMAN on 8/11/2016.
 */
public class LongestSubaaray {
    int max = 0;
     int maxLength(int[] a, int k) {
        int len = a.length-1;
        if(len<0){
            return 0;
        }
        int j=0;
        int sum =0;
        int i=0;
        while(i<=len){
            while(j<=len){
                sum =sum + a[j];
                if(sum>k){
                    break;
                }else{
                    if((j-i)>=max){
                        max = j-i;
                    }
                }
                j++;

            }
            while (i<=len && sum>k){
                sum = sum-a[i];
                i++;
            }
            if(j<len){
                j++;
            }else{
                break;
            }

        }
        return max+1;






    }

    public static void main(String[] args){
        int[] a = new int[]{1,2,3,4,5};
        System.out.print(new LongestSubaaray().maxLength(a,10));
    }
}
