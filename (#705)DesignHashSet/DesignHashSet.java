class MyHashSet {
    private final int SIZE = 100000;
    private List<Integer> bucket[];
    /** Initialize your data structure here. */
    public MyHashSet() {
        bucket = new List[SIZE];
    }
    
    private int hash(int key){
        return key % SIZE;
    }
    
    private int getPos(int key, int index){
        List<Integer> list = bucket[index];
        if(list == null) return -1;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == key)
                return i;
        }
        return -1;
    }
    
    public void add(int key) {
        int y = hash(key);
        int pos = getPos(key, y);
        if(pos < 0) {
            if(bucket[y] == null)
                bucket[y] = new ArrayList<Integer>();
            bucket[y].add(key);
        }
        
    }
    
    public void remove(int key) {
        int y = hash(key);
        int pos = getPos(key, y);
        if(pos < 0) return;
        else{
            bucket[y].remove(pos);
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int y = hash(key);
        int pos = getPos(key, y);
        if(pos < 0) return false;
        else return true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */