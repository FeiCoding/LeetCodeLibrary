public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        return helper(n, left, right);
    }
    private int helper(int n, int left, int right){
        if(left > right) return -1;
        int mid = left + (right - left) / 2;
        if(guess(mid) == 0) return mid;
        if(guess(mid) == -1) return helper(n, left, mid - 1);
        else return helper(n, mid + 1, right);
    }
}