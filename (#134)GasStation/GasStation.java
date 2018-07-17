class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0, start = 0, total = 0;
        for(int i = start; i < gas.length; i++){
            tank += gas[i] - cost[i];
            if(tank < 0){
                start = i + 1;
                total += tank;
                tank = 0;
            }
        }
        
        return (total + tank < 0) ? -1 : start;
    }
}