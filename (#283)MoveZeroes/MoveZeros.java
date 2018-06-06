class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length <= 1) return;
        int numPos = 0;
        for(int num : nums)
            if(num != 0) nums[numPos++] = num;
        while(numPos <nums.length)
            nums[numPos++] = 0;
    }
}