package BinarySearchTrees;

/**
 * Created by AMAN on 6/6/2016.
 */
public class SuccessorPredecessor {
    public int successor, predecessor;

    public void findSuccPre(Node root , int key){
        if(root == null){
            return;
        }
        if(root.data == key){
            if(root.right!=null){
                Node temp = root.right;
                while (temp.left!= null){
                    temp = temp.left;
                }
                predecessor = temp.data;
            }
            if(root.left != null){
                Node temp = root.left;
                while (temp.right !=null){
                    temp = temp.right;
                }
                successor = temp.data;

            }
        }else if(root.data>key){
            successor =root.data;
            findSuccPre(root.left,key);

        }
        else if(root.data<key){
            predecessor =root.data;
            findSuccPre(root.right,key);

        }
    }
}
