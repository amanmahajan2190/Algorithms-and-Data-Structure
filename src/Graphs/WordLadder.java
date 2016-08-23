package Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Created by AMAN on 8/14/2016.
 */

class WordNode{
    String val;
    int distance;
    WordNode(String v){
        this.val =v;
        distance =0;
    }
    WordNode(String v, int dist){
        this.val=v;
        this.distance = dist;
    }
}
public class WordLadder {
    public int ladderLength(String beginWord, String endWord, Set<String> wordDict){
        Queue<WordNode> bfsQueue =  new LinkedList<WordNode>();
        bfsQueue.add(new WordNode(beginWord));
        while(true){
            WordNode temp = bfsQueue.poll();
            if(endWord.equals(temp.val)){
                return temp.distance;
            }
            String word = temp.val;
            int len = word.length();
            char[] arr = word.toCharArray();
            for(int i=0;i<len;i++){
                char curr = arr[i];
                for(char c='a';c<='z';c++){
                    if(arr[i] != 'c'){
                        arr[i] =c;
                    }
                }

                String w = new String(arr);
                if(word.contains(w)){
                    bfsQueue.add(new WordNode(w,temp.distance+1));
                    wordDict.remove(temp);
                }
                arr[i] = curr;
            }


        }

   // return 0;
    }



}
