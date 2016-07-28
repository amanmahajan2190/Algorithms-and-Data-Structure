package BinaryTrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by AMAN on 7/24/2016.
 */



//Idea is to do PRe orderTraversal
public class SerializeDeserialize {

    public TreeNode createTree(TreeNode root){
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
       root.left.left = null;
        root.left.right =new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        return root;
    }
    StringBuffer stringBuffer = new StringBuffer("");
    public String serialize(TreeNode root) {
        if(root == null){
            stringBuffer.append("null"+",");
            return null;
        }

        stringBuffer.append(root.val+",");
        serialize(root.left);
        serialize(root.right);
        return stringBuffer.toString();



    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null){
            return null;
        }

        List<String> nodeList = Arrays.asList(data.split(","));
        TreeNode root = recoverTree(nodeList);

        return root;



    }
    int i=-1;
    public TreeNode recoverTree(List<String> nodes){
        TreeNode node =null;
        i++;
        if(i>nodes.size()-1){
            return null;
        }else{
            if(!nodes.get(i).equals("null")){
                node = new TreeNode(Integer.parseInt(nodes.get(i)));
                node.left = recoverTree(nodes);
                node.right = recoverTree(nodes);
            }else{
                return null;
            }

        }
        return node;
    }

    public static void main(String[] args){
        SerializeDeserialize d = new SerializeDeserialize();
        TreeNode root = new TreeNode(1);
        d.createTree(root);
        root =d.deserialize(d.serialize(root));
    }


}
