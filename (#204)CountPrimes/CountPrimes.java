class Solution {
    public int countPrimes(int n) {
        boolean table[] = new boolean[n];
        int count = 0;
        for(int i = 2; i < n; i++){
            if(!table[i]){
               count++; 
               for(int j = 2; j * i < n; j++){
                   table[i * j] = true;
               }
            }                            
        }
        return count;
        
    }
}