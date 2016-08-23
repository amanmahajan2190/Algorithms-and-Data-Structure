package DynamicProgramming;

/**
 * Created by AMAN on 8/1/2016.
 */
public class UniqueBST {
    int[] G;
    public UniqueBST(int n){
        int[] G = new int[n];
    }
    public int findUnique(int n){
        G[0] =1;
        G[1] =1;
        for(int i =2;i<=n;i++){
            for(int root =1; root<=i;root++){
                G[i] = G[root-1]*G[i-root];
            }
        }
        return G[n];
    }
}
