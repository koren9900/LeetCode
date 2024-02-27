package org.problems.medium;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int cur = 0;
        int tank = 0;
        int priv = 0;
        for(int i = 0; i < gas.length; i++){
            tank += gas[i] - cost[i];
            if(tank < 0){
                priv += tank;
                tank = 0;
                cur = (i + 1)% gas.length;
            }
        }
        return tank + priv >= 0 ? cur : -1;
    }
}
