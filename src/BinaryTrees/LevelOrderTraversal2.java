package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
/*
Difference between sums of odd level and even level nodes of a Binary Tree*/

/**
 * Created by AMAN on 5/27/2016.
 */
public class LevelOrderTraversal2 {
    Queue<Node> queue;
    int oddSum=0;
    int evenSum =0;
    boolean levelOdd = true;
    LevelOrderTraversal2(){
        queue = new LinkedList<Node>();
    }

    public void doTraversal(Node root){
        if(root == null){
            return;
        }
        int size= 0;
        queue.add(root);
        while(!queue.isEmpty()){
            size = queue.size();
            while (size>0){
                Node temp = queue.remove();
                if(temp.right!=null){
                    queue.add(temp.right);
                }else{
                    if(temp.left!=null){
                        queue.add(temp.left);
                    }
                }
                if(levelOdd){
                    oddSum += temp.data;
                }else{
                    evenSum += temp.data;
                }
            }
            levelOdd = !levelOdd;
        }
        System.out.print(evenSum=oddSum);



        }
    }

