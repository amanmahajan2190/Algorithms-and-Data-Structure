package Design;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by AMAN on 8/20/2016.
 */
public class LRUCache {
    LinkedList<Integer> list;
    HashMap<Integer,Integer> map ;
    int capacity = 0;
    int list_size =0;

    public LRUCache(int capacity) {
        list = new LinkedList<Integer>();
        this.capacity=capacity;
        map = new HashMap<Integer, Integer>();

    }

    public int get(int key) {
        if(map.containsKey(key)){
            list.remove((Integer) key);
            list.addFirst(key);
            return map.get(key);
        }
        return -1;

    }

    public void set(int key, int value) {
        if(map.containsKey(key)){
            list.remove((Integer)key);
            map.put(key,value);
            list.addFirst(key);
        }else{
            if(list_size<capacity){
                map.put(key,value);
                list.addFirst(key);
                list_size++;

            }else{
                int k = list.removeLast();
                map.remove(k);
                list.addFirst(key);
                map.put(key,value);
            }
        }

    }

    public static void main(String[] args){
        LRUCache l = new LRUCache(2);
        l.set(2,1);
        l.set(1,1 );
        System.out.println(l.get(2));
        l.set(4,1);
        System.out.println(l.get(1));
        System.out.println(l.get(2));
    }
}
