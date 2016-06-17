package BinaryTrees;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AMAN on 6/4/2016.
 */
public class PreOrderInOrder {
    Map<Integer,Integer> indexMap;
    static int pIndex=0;


    PreOrderInOrder(){
        indexMap = new HashMap<Integer, Integer>();
    }



    public Node createBinaryTree(int[] inoder, int[] preOder, int start, int end){
        Node root = new Node(preOder[pIndex]);
        int index = indexMap.get(preOder[pIndex]);
        pIndex++;

        if(start<end){

            root.left = createBinaryTree(inoder,preOder,start, index-1);
            root.right =createBinaryTree(inoder,preOder,index+1 , end);
        }
        if(start==end){
            return root;
        }
        return root;




    }

    public void mapInoderIndex(int[] inOderArray){
        for(int i=0; i<inOderArray.length;i++){
            indexMap.put(inOderArray[i],i);
        }
    }

    public static void main(String[] args){
        int[] inoder = {4,2,5,1,6,3,7};
        int[] preOrder = {1,2,4,5,3,6,7};

        PreOrderInOrder in = new PreOrderInOrder();
        in.mapInoderIndex(inoder);
        Node node = in.createBinaryTree(inoder,preOrder,0, inoder.length-1);
        System.out.print(node.data);

    }



}
