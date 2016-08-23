package BinarySearchTrees;

/**
 * Created by AMAN on 8/18/2016.
 */
public class FindClosestValue {
    public int closestValue(TreeNode root, double target) {
        if (root == null) {
            return 0;
        }
        return findValue(root, target);

    }

    public int findValue(TreeNode root, double target) {
        TreeNode kid = null;
        if (root.val > target && root.left != null) {
            kid = root.left;
        } else if (root.val < target && root.right != null) {
            kid = root.right;
        }
        if (kid == null) {
            return root.val;
        }

        int kid_val = findValue(kid, target);
        if (Math.abs(target - kid_val) < Math.abs(target - root.val)) {
            return kid_val;
        }
        return root.val;

    }



    public static void main(String[] args){
        FindClosestValue val = new FindClosestValue();
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(1);
      //  root.right = new TreeNode(2);
        System.out.print(val.closestValue(root,6));
    }
}
