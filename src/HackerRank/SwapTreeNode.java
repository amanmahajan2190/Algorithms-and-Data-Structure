package HackerRank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by AMAN on 8/11/2016.
 */
class Node{
    Node left;
    Node right;
    int val;
    Node(int v){
        left =null;
        right = null;
        val =v;
    }

}
public class SwapTreeNode {



    public void swapNodes(Node root ,int k){
        if(k<=0 || root ==null){
            return;
        }
        int h =1;
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        while(!queue.isEmpty()){
            if(h ==k){
                while (!queue.isEmpty()){
                    swap(queue.poll());
                }
                return;
            }else{
                int size =queue.size();
                while (size>0){
                    Node temp =queue.poll();
                    if(temp!=null){
                    queue.offer(temp.left);
                    queue.offer(temp.right);
                    size--;
                }
                }
            }
            h++;

        }

    }

    private void swap(Node parent){
        Node temp = parent.left;
        parent.left = parent.right;
        parent.right = temp;
    }

    private void inorder(Node root){
        if(root!= null){
            inorder(root.left);
            System.out.print(root.val+" ");
            inorder(root.right);
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i=N;
        Node root = new Node(1);
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()&& i>1&&sc.hasNextLine()){
            int size = queue.size();
            while(size>0){
                Node temp =queue.poll();
                int left =sc.nextInt();
                int right =sc.nextInt();
                if(left ==-1){
                    temp.left = null;
                }else{
                    temp.left = new Node(left);
                    queue.offer(temp.left);

                }
                if(right ==-1){
                    temp.right = null;
                }else{
                    temp.right = new Node(right);
                    queue.offer(temp.right);

                }
                size--;

            }
            i--;
        }
        SwapTreeNode n = new SwapTreeNode();


        int ops = sc.nextInt();
        while(ops>0){
            int h =sc.nextInt();
            n.swapNodes(root,h);
            n.inorder(root);
        }

    }
}
