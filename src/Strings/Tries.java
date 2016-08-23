package Strings;

import java.util.HashMap;

/**
 * Created by AMAN on 8/21/2016.
 */
public class Tries {
    class TriesNode{
        boolean isleaf=false;
        HashMap<Character,TriesNode> children = new HashMap<Character, TriesNode>();
        char val;
        TriesNode(char c){
            this.val=c;
        }
        TriesNode(){}
    }
    //Create a first root node
    TriesNode root = new TriesNode();
    public void insert(String word){
        HashMap<Character,TriesNode> child = root.children;
        for(int i=0;i<word.length();i++){
            char c =word.charAt(i);
            TriesNode node;
            if(child.containsKey(c)){
                node = child.get(c);
            }else{
                node = new TriesNode(c);
                child.put(c,node);
            }
            child = node.children;

            if(i==word.length()-1){
                node.isleaf=true;
            }
        }
    }

    public TriesNode searchNode(String str){
        HashMap<Character,TriesNode> children = root.children;
        int len = str.length();
        TriesNode node=null;
        for(int i=0;i<len;i++){
            char c =str.charAt(i);

            if(children.containsKey(c)){
                node = children.get(c);
                children = node.children;
            }else{
                return null;
            }
        }
        return node;
    }

    public boolean search(String str){
        TriesNode node = searchNode(str);
        if(node!=null && node.isleaf){
             return true;
        }
        return false;
    }

    public boolean startsWith(String prefix) {
        if(searchNode(prefix) == null)
            return false;
        else
            return true;
    }


    public static void main(String[] args){
        Tries t = new Tries();
        t.insert("abcd");
        t.insert("pqrs");
        t.insert("aman");
        System.out.print(t.search("abcd"));
    }






}
