
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[]{nums.length, -1};
        int start = 0, end = nums.length - 1;
        helper(start, end, nums, target, res);
        if(res[0] > res[1]) res[0] = -1;
        return res;
    }
    
    public void helper(int start, int end, int []nums, int target, int res[]){
        if(start > end) return;
        int mid = (start + end) / 2;
        if(nums[mid] == target){
            if(res[0] > mid){
                res[0] = mid; 
                helper(start, mid - 1, nums, target, res);
            }
            if(res[1] < mid) {
                res[1] = mid;
                helper(mid + 1, end, nums, target, res);
            }            
        }
        else if(nums[mid] > target)
            helper(start, mid - 1, nums, target, res);
        else
            helper(mid + 1, end, nums, target, res);
    }
}