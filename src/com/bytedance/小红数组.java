package com.bytedance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 题目描述
 * 小红拿到了一个数组，她每次可以进行如下操作之一：
 * 选择一个元素x，将其分裂为1和x-1。
 * ·选择一个元素x，将其分裂为a和b，需要保证a*b=x
 * 小红希望用最少的操作次数，将所有数组的所有元素全部变成1。你能帮帮她吗？
 * 输入描述：
 * 第一行输入一个正整数n，代表数组的长度。
 * 第二行输入n个正整数ai，代表小红拿到的数组。
 * 1 ≤ n, ai ≤ 1e5
 * 输出描述：
 * 一个整数，代表最小的操作次数。
 *
 * input:
 * 2
 * 2 6
 *
 * output:
 * 5
 */
public class 小红数组 {
    public static int ans =0;
    static Integer[] shape(int[] a){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if(a[i]==1) continue;
            if(a[i]==2) ans++;
            //奇数
            if(a[i]%2!=0){
                ans++;
                list.add(a[i]);
                list.add(a[i]-1);
            }
            //偶数
            else
            {
                ans++;
                list.add(a[i]/2);
                list.add(2);
            }
        }
        return (Integer[]) list.toArray();
    }
    static boolean judge(int[] a)
    {
        for (int i : a) {
            if(i!=1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        while (judge(arr)!=true){
            Integer[] b = shape(arr);

        }

    }
}
