package DynamicProgramming;

/**
 * Created by AMAN on 7/14/2016.
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        if(n<=1){
            return 1;
        }
        int a[] =new int[n];
        a[0] =1;
        a[1] =1;
        for(int i=2;i<=n;i++){
            a[i] = a[i-1] +a[i-2];
        }
        return a[n];
    }
}
