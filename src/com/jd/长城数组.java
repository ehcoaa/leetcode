package com.jd;

import java.util.Scanner;

/**
 * 嘤嘤觉得长城很美 ，特别是它的锯齿， 非常的优雅！ 现在有一个数组，嘤嘤想把这个数组变成"长城"，即对于"长城"中每 一个元 素左右两边的元素相等，并且与它不相等。例如[2，1，2，1，2，1，2），（1，9，1，9}是长城，{2，1，3，2，4，1，4，4，4，4）则不是长城。 你每次可以将一个元素加一，请问最少需要几次操作？
 *
 * 输入n和n个正整数。其中n<=2e5，ai<=1e9。
 *
 * 输入描述
 *
 * 6 1 1 4 5 1 4
 * 输出描述
 *
 * 11
 */
public class 长城数组 {
    public static void main(String[] args) {
        int ans = 0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]  =scanner.nextInt();
        }
        //奇数组
        int max1 = a[1];
        for (int i = 1; i < a.length; i+=2) {
            max1 = Math.max(max1,a[i]);
        }
        //偶数组
        int max2 = a[0];
        for (int i = 0; i < a.length; i+=2) {
            max2 = Math.max(max2,a[i]);
        }
        for (int i = 1; i < a.length; i+=2) {
            if(a[i]!=max1)
                ans+= max1-a[i];
        }

        for (int i = 0; i < a.length; i+=2) {
            if(a[i]!=max2)
                ans+= max2-a[i];
        }
        System.out.println(ans);
    }
}
