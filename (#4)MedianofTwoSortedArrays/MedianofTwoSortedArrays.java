class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) { 
        int  m = nums1.length;
        int  n = nums2.length;
        if(m > n) return findMedianSortedArrays(nums2, nums1);
        int imin = 0;
        int imax = m;
        int maxleft, minright;
        while(imin <= imax){
            int i = (imin + imax) / 2;
            int j = (m + n + 1) / 2 - i;
            if(i > 0 && nums1[i - 1] > nums2[j])
                imax = i-1;
            else if(i < m && nums2[j - 1] > nums1[i])
                imin = i+1;
            else{
                
                if(i == 0)
                    maxleft = nums2[j - 1];
                else if(j == 0)
                    maxleft = nums1[i - 1];
                else
                    maxleft = Math.max(nums1[i - 1], nums2[j - 1]);
                if((m + n) % 2 == 1) return maxleft;
                if(i == m) minright = nums2[j];
                else if(j == n) minright = nums1[i];
                else{
                    minright = Math.min(nums1[i], nums2[j]);
                }
                return (maxleft + minright) / 2.0;
            }
            
        }
        return 0;        
    }
}
