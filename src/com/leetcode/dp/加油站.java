package com.leetcode.dp;

/**
 * 在一条环路上有 n 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
 *
 * 你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。
 * 你从其中的一个加油站出发，开始时油箱为空。
 *
 * 给定两个整数数组 gas 和 cost ，如果你可以按顺序绕环路行驶一周，
 * 则返回出发时加油站的编号，否则返回 -1 。如果存在解，则 保证 它是 唯一 的。
 */
public class 加油站 {
    //暴力解法看每个点是否能能回来
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int currNum = 0;
        for (int i = 0; i < gas.length; i++) {
            currNum = gas[i];
            int j = i;
            while (currNum>=cost[j]){
            currNum -=cost[j];//减油
            j++;//向前
            j = j% gas.length;//取余是为了能够闭环
            currNum +=gas[j];
            if (j==i) {
                return i;
            }
            }
        }
        return -1;
    }

    public int canCompleteCircuit0(int[] gas, int[] cost) {
        int n = gas.length;
        for (int i = 0; i < gas.length; i++) {
            int currGas = gas[i];
            int j = i;
            while (currGas>=cost[j]){
                currGas = currGas-cost[j] + gas[j%n+1];
                j = j%n +1;
                if(i==j) return i;
            }
        }
        return -1;
    }


    }
