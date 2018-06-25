class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0) return 0;
        int tail[] = new int[nums.length];
        int len = 0;
        for(int num : nums){
            int i = 0, j = len;
            while(i < j){
                int mid = i + (j - i) / 2;
                if(tail[mid] < num)
                    i = mid + 1;
                else
                    j = mid;
            }
            tail[i] = num;
            if(i == len) len++;
        }
        return len;
    }
}
