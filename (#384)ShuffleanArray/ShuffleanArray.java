import java.util.Random;


class Solution {
    
    private int[]nums;
    private Random random;
    
    public Solution(int[] nums) {
        this.nums = nums;
        random = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int newNum[] = nums.clone();
        for(int j = 0; j < nums.length; j++){
            int i = random.nextInt(j + 1);
            swap(newNum, i, j);
        }
        return newNum;
    }
    
    
    public void swap(int newNum[], int i, int j){
        int temp = newNum[i];
        newNum[i] = newNum[j];
        newNum[j] = temp;
    }
}