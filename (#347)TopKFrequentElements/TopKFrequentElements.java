class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> bucket[] = new List[nums.length + 1];
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for(int key : map.keySet()){
            int frequence = map.get(key);
            if(bucket[frequence] == null)
                bucket[frequence] = new ArrayList<>();
            bucket[frequence].add(key);
        }
        
        List<Integer> res = new ArrayList<>();
        for(int i = bucket.length - 1; i >= 0 && res.size() < k; i--){
            if(bucket[i] != null)
                res.addAll(bucket[i]);
        }
        return res;
        
    }
}




