class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> allList = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        backtrack(allList, list, nums, 0);
        return allList;
    }
    
    private void backtrack(List<List<Integer>> allList, List<Integer> tempList, int[] nums, int count){
        allList.add(new ArrayList(tempList));
        while(count < nums.length){
            if(tempList.contains(nums[count])) continue;
            tempList.add(nums[count]);
            backtrack(allList, tempList, nums, ++count);
            tempList.remove(tempList.size() - 1);
        }
    }
}