package DynamicProgramming;

/**
 * Created by AMAN on 7/5/2016.
 */
public class INtegerBreak {
    public int integerBreak(int n) {

        int[] table = new int[n+1];
        table[0] = 0;
        for(int i = 1;i < table.length;i++){
            table[i] = 0;
            for(int j = 1;j < i;j++){
                int max = Math.max(j,table[j]);
                int max2 = Math.max(i-j,table[i-j]);
                table[i] = Math.max((max * max2),table[i]);
            }
        }

        return table[n];
    }

    public static void main(String[] args){
        INtegerBreak giveMEbreak = new INtegerBreak();
        System.out.print(giveMEbreak.integerBreak(10));

    }
}
