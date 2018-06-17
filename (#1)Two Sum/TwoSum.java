class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                result[1] = i;
                result[0] = map.get(comp);
            }
            map.put(nums[i], i);
        }
        
        return result;
    }
}