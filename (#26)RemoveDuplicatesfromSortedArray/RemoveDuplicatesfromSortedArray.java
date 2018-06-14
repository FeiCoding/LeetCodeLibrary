class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n <= 1) return n;
        int j = 0;
        for(int i = 0; i < n; i ++){
            if(nums[j] != nums[i]) nums[++j] = nums[i];
        }
        return ++j;
    }
}
