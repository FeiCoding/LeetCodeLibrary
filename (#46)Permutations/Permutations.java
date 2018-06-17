class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> allList = new ArrayList<List<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        backtrack(allList, list, nums);
        return allList;
    }
    public void backtrack(List<List<Integer>> allList, ArrayList<Integer> tempList, int[]nums){
        if(tempList.size() == nums.length)
            allList.add(new ArrayList<>(tempList));
        else{
            for(int i = 0; i < nums.length; i++){
                if(tempList.contains(nums[i])) continue;//ignore the existed number
                tempList.add(nums[i]);
                backtrack(allList, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}