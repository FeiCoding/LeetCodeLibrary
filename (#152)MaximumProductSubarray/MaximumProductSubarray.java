class Solution {
    public int maxProduct(int[] nums) {
        int r = nums[0];
        int max = r, min = r;
        
        for(int i = 1; i < nums.length; i ++){
            if(nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }

            
            max = Math.max(nums[i] , max * nums[i] );
            min = Math.min(nums[i] , min * nums[i] );
            
            r = Math.max(r, max);
        }
        return r;
    }
    
}