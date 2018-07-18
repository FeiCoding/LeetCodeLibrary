class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0) return new int[0];
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> interset = new HashSet<>();
        
        for(int i = 0; i < nums1.length; ++i){
            set.add(nums1[i]);
        }
        
        for(int j = 0; j < nums2.length; ++j){
            if(set.contains(nums2[j])){
                interset.add(nums2[j]);
            }
        }
        
        int res[] = new int[interset.size()];
        int i = 0;
        for(Integer num : interset){
            res[i] = num;
            i++;
        }
        
        return res;
    }
}