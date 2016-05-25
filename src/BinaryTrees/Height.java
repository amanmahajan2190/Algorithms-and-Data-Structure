package BinaryTrees;

/**
 * Created by AMAN on 5/23/2016.
 */
public class Height {

    public int getHeight(Node root){
        if(root == null){
            return 0;
        }
        int left = getHeight(root.left)+1;
        int right = getHeight(root.right)+1;
        if(left>right){
            return right;
        }else{
            return left;
        }
    }
}
