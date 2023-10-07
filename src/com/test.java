package com;

import java.util.Arrays;

/**
 * 表现良好的最长时间段
 * 给你一份工作时间表hours，上面记录着某一位员工每天的工作小时数。
 *
 * 我们认为当员工一天中的工作小时数大于8 小时的时候，那么这一天就是「劳累的一天」。
 *
 * 所谓「表现良好的时间段」，意味在这段时间内，「劳累的天数」是严格 大于「不劳累的天数」。
 *
 * 请你返回「表现良好时间段」的最大长度。
 *
 * 示例 1：
 * 输入：hours = [9,9,6,0,6,6,9]
 * 输出：3
 * 解释：最长的表现良好时间段是 [9,9,6]。
 *
 * 示例 2：
 * 输入：hours = [9,9,6,0,6,9,9]
 * 输出：7
 *
 * 示例 3：
 * 输入：hours = [6,6,9,9,9,6,6]
 * 输出：5
 */
public class test {
    public static int goodDay(int[] hours){
        int len = hours.length;
        int[] days = new int[len];
        int count =0;
        int res =0;
        for (int i = 0; i < len; i++) {
            if(hours[i]>8){
                days[i] = 1;
            }else {
                days[i] = -1;
            }
            count+=days[i];
            if(count>0){
                res=i+1;
                res=Math.max(i,res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(goodDay(new int[]{9, 9, 6, 0, 6, 6, 9}));
        System.out.println(goodDay(new int[]{9, 9, 6, 0, 6, 9, 9}));
        System.out.println(goodDay(new int[]{6, 6, 9, 9, 9, 6, 6}));
    }
}
