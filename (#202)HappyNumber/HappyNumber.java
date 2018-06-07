class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        int res, squareSum;
        while(set.add(n)){
            squareSum = 0;
            while(n > 0){
                res = n % 10;
                squareSum += res * res;
                n = n / 10;
            }
            if(squareSum == 1)
                return true;
            else n = squareSum;
        }
        return false;
    }
}