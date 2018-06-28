import java.util.Random;

class RandomizedSet {
    List<Integer> set;
    HashMap<Integer, Integer> map;
    Random random = new Random();
    /** Initialize your data structure here. */
    public RandomizedSet() {
        set = new ArrayList<Integer>();
        map = new HashMap<Integer, Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;
        set.add(val);
        map.put(val, set.size() - 1);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;
        int index = map.get(val);
        if(index < set.size() - 1){
            int lastNumber = set.get(set.size() - 1);
            set.set(index, lastNumber);
            map.put(lastNumber, index);
        }
        set.remove(set.size() - 1);
        map.remove(val);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return set.get(random.nextInt(set.size()));
    }
}