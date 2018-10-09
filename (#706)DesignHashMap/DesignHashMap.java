import javafx.util.*;
class MyHashMap {
    private final int SIZE = 100000;
    private List<Pair<Integer, Integer>> bucket[];
    
    /** Initialize your data structure here. */
    public MyHashMap() {
        bucket = new ArrayList[SIZE];
    }
    
    private int hash(int key){
        return key % SIZE;
    }
    
    private int getPos(int key, int index){
        List<Pair<Integer, Integer>> temp = bucket[index];
        if(temp == null) return -1;
        for(int i = 0; i < temp.size(); i++){
            if(temp.get(i).getKey() == key)
                return i;
        }
        return -1;
    }
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index = hash(key);
        int pos = getPos(key, index);
        if(pos < 0){
            if(bucket[index] == null)
                bucket[index] = new ArrayList<Pair<Integer, Integer>>();
            
            Pair<Integer, Integer> pair = new Pair<Integer, Integer>(key, value);
            bucket[index].add(pair);
        }
        else{
            bucket[index].set(pos, new Pair<Integer, Integer>(key, value));
        }
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = hash(key);
        int pos = getPos(key, index);
        if(pos < 0) return -1;
        else{
            return bucket[index].get(pos).getValue();
        }
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index = hash(key);
        int pos = getPos(key, index);
        if(pos < 0) return;
        else{
            bucket[index].remove(pos);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */