package BinaryTrees;

import java.util.*;

/**
 * Created by AMAN on 7/11/2016.
 */
public class VerticalOrderTraversal {
    List<List<Integer>> nodesList = new ArrayList<List<Integer>>();
    public List<List<Integer>> verticalOrder(TreeNode root) {
        Map<Integer,ArrayList<Integer>> columnMap = new HashMap<Integer, ArrayList<Integer>>();
        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        Queue<Integer> columnQueue = new LinkedList<Integer>();

        nodeQueue.add(root);
        columnQueue.add(0);
        int min=0;
        int max =0;
        while (!nodeQueue.isEmpty()){
            TreeNode node = nodeQueue.poll();
            int column = columnQueue.poll();
            ArrayList<Integer> sameColumNode = new ArrayList<Integer>();
            if(!columnMap.containsKey(column)){

                sameColumNode.add(node.val);
                columnMap.put(column,sameColumNode);
            }else{
                sameColumNode = columnMap.get(column);
                sameColumNode.add(node.val);

            }

            if(node.left != null){
                nodeQueue.add(node.left);
                columnQueue.add(column-1);
                if(min>(column-1)){
                    min = column-1;
                }
            }
            if(node.right != null){
                nodeQueue.add(node.right);
                columnQueue.add(column+1);
                if(max<(column+1)){
                    max = column+1;
                }
            }

        }
        for(int i=min;i<=max;i++){
            nodesList.add(columnMap.get(i));
        }
        return nodesList;




    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        VerticalOrderTraversal traversal =  new VerticalOrderTraversal();
        traversal.verticalOrder(root);

    }
}
