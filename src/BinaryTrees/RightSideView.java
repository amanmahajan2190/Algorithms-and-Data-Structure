package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AMAN on 7/24/2016.
 */
public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> nodeList = new ArrayList<Integer>();
        makeRightSide(root,nodeList,0);
        return nodeList;


    }

    public void makeRightSide(TreeNode root, List<Integer> list, int h){
        if(root == null){
            return;
        }
        if(list.size() == h){
            list.add(root.val);
        }

        makeRightSide(root.right,list , h+1);
        makeRightSide(root.left,list , h+1);

    }
}
