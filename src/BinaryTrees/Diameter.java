package BinaryTrees;

/**
 * Created by AMAN on 6/9/2016.
 */
public class Diameter {

    public int hieght(Node root){
        if(root== null){
            return 0;
        }
        int left  = hieght(root.left);
        int right = hieght(root.right);
        if(left>right){
            return left+1;
        }else{
            return right+1;
        }
    }

    public int getDiameter(Node root){
        int left = hieght(root.left);
        int right = hieght(root.right);
        int diameterFromRoot = left +right+1;

        int leftSubtree = getDiameter(root.left);
        int rightSubtree = getDiameter(root.right);
        return Math.max(diameterFromRoot,Math.max(leftSubtree,rightSubtree));


    }
}
