package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by AMAN on 6/19/2016.
 */

class TrieNode{
    char c;
    Map<Character,TrieNode> trieNodeMap;
    boolean isWord;
    TrieNode(){
        trieNodeMap = new HashMap<Character, TrieNode>();
    }
    TrieNode(char c){
        this.c =c;
        trieNodeMap = new HashMap<Character, TrieNode>();
        isWord=false;
    }
}
public class Trie {
    TrieNode root;
    Trie(){
        root = new TrieNode();
    }

    public void insert(String s){
        Map<Character,TrieNode> children = root.trieNodeMap;
        for(int i=0;i<s.length();i++){
            TrieNode t;
            if(children.containsKey(s.charAt(i))){
                t= children.get(s.charAt(i));
            }else{
                t= new TrieNode(s.charAt(i));
                children.put(s.charAt(i),t);
            }
            children = t.trieNodeMap;
            if(i==s.length()-1){
                t.isWord=true;
            }
        }
    }

    public boolean search(String s){

        if(s.isEmpty()){
            return root.isWord;
        }
        if(root.trieNodeMap.containsKey(s.charAt(0))){
            root = root.trieNodeMap.get(s.charAt(0));
            return (search(s.substring(1)));
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String word1 = "Aman";
        String word2 = "Mahajan";
        Trie t = new Trie();
        t.insert(word1);
        t.insert(word2);
        System.out.print(t.search(word1));

        System.out.print(t.search(word2));
    }

}
