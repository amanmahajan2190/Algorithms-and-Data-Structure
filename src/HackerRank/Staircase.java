package HackerRank;

/**
 * Created by AMAN on 8/9/2016.
 */
public class Staircase {
    static void StairCase(int n) {
        if(n<=0){
            return;
        }
        int k = n-1;
        for(int i=0;i<n;i++){
            String str ="";
            int j=0;
            for(j=0;j<k;j++){
                str =str +" ";
            }

            for(int m= j;m<=n-1;m++){
                str =str + "#";
            }
            k--;
            System.out.println(str);
        }


    }

    public static void main(String[] args){
        StairCase(5);
    }
}
