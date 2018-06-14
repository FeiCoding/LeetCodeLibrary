class Solution {
    public int rob(int[] nums) {
        int preNo = 0, preYes = 0, temp;
        for(int n : nums){
            temp = preNo;
            preNo = Math.max(preNo, preYes);
            preYes = temp + n;
        }
        return Math.max(preNo, preYes);
    }
}
