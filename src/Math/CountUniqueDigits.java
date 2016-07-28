package Math;

/**
 * Created by AMAN on 7/3/2016.
 */
public class CountUniqueDigits {
     public int countNumbersWithUniqueDigits(int n){
         if(n==0){
             return 1;
         }
         int count =9;
         int result =10;
         for(int i=2; i<=n;i++){
             count = count*(10-i+1);
             result = result+count;
         }
         return result;
     }
}
