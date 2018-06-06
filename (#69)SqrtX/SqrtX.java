class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        
        int left = 1, right = Integer.MAX_VALUE; // pay attention to the exceed problems
        
        while(true){
            int mid = left + (right - left) / 2; //cannot write as (left + right) / 2
            if (mid > x/mid) // cannot write as mid * mid > x 
                right = mid - 1;
            else {
                if (mid + 1 > x/(mid + 1)) // cannot write as mid * mid > x 
                    return mid;
                left = mid + 1;
            }
        }
    }
}
