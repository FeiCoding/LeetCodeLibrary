class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if(N < 0){
            x = 1.0 / x;
            N = -N;
        }
        double ans = 1;
        double currAns = x;
        for(long i = N; i > 0; i /= 2){
            if(i % 2 == 1)
                ans = ans * currAns;
            currAns = currAns * currAns;
        }
        return ans;
    }
}
