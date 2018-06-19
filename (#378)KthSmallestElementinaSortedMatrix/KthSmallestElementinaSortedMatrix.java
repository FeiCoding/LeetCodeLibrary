class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int low = matrix[0][0];
        int hig = matrix[matrix.length - 1][matrix.length - 1];
        while(low <= hig){
            int mid = low + (hig - low) / 2;
            int count = search(matrix, mid);
            if(count < k) low = mid + 1;
            else hig = mid - 1;
        }
        return low;
    }
    
    public int search(int[][] matrix, int mid){
        int i = matrix.length - 1, j = 0;
        int res = 0;
        while(i >= 0 && j < matrix.length){
            if(matrix[i][j] > mid) i--;
            else{
                res += i + 1;
                j++;
            }
        }
        
        return res;
    }
}