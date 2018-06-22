class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 1 && n == 1) return 1;
        if(m < n){ // swap to make m the bigger one
            m = m + n;
            n = m - n;
            m = m - n;
        }
        --m;
        --n;
        int i = m + 1, j = 1;
        long res = 1;
        for(;i <= m + n; ++i, ++j){
            res *= i;
            res /= j;
        }
        return (int)res;
    }
}