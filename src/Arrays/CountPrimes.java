package Arrays;

import java.util.Arrays;

/**
 * Created by AMAN on 7/27/2016.
 */
public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] notPrimes = new boolean[n];
        int count =0;
        for(int i=2; i<n;i++){
            if(!notPrimes[i]){
                count++;
                for(int j=i;j*i<n;j++){
                    notPrimes[i*j] = true;
                }


            }

        }
        return count;
    }

    public static void main(String[] args){
        CountPrimes primes = new CountPrimes();
        primes.countPrimes(100);
    }
}
