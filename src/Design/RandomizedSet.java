package Design;

import java.util.*;

/**
 * Created by AMAN on 8/20/2016.
 */
public class RandomizedSet {
    /** Initialize your data structure here. */
    List<Integer> list;
    HashMap<Integer,Integer> integerMap;
    int size=0;
    public RandomizedSet() {
        list = new ArrayList<Integer>();
        integerMap = new HashMap<Integer,Integer>();

    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!integerMap.containsKey(val)){
            list.add(val);
            integerMap.put(val,list.size()-1);
            size++;
            return true;
        }
        return false;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(integerMap.containsKey(val)){
            int idx = integerMap.get(val);
            if(idx != size-1){
                int last = list.get(size-1);
                list.remove(size-1);
                list.remove(idx);
                list.add(idx,last);
                integerMap.remove(val);

            }else{
                list.remove(size-1);
                integerMap.remove(val);
            }


            size--;
            return true;

        }
        return false;

    }

    /** Get a random element from the set. */
    public int getRandom() {
        int index = new Random().nextInt(size);
        return list.get(index);
    }

    public static void main(String[] args){
        RandomizedSet set = new RandomizedSet();
        set.insert(1);
        set.insert(2);
        set.insert(3);
        set.insert(4);
        set.insert(5);
        set.remove(4);
        System.out.print(set.getRandom());
    }

}
