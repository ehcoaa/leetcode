package com.littlestar;

import java.util.Arrays;
import java.util.Scanner;

public class 最优规划 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n ,m , k;
        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextInt();
        scanner.nextLine();

        char [][]color = new char[n][m];
        for(int i=0;i<n;i++){
            String str = scanner.nextLine();
            for(int j=0;j<m;j++){
                color[i][j]  = str.charAt(j);
            }
        }

        int [][]gold = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                gold[i][j]  = scanner.nextInt();
            }
        }
        int [][]dp = new int[n][m];
        dp[0][0] = 0;
        //第一列
        for(int i=1;i<n;i++){
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][0] + gold[i][0] -(color[i-1][0]==color[i][0] ? 0:1 )*k) ;
        }
        //第一行
        for(int i=1;i<m;i++){
            dp[0][i] = Math.max(dp[0][i-1],dp[0][i-1]+ gold[0][i] - (color[0][i-1]==color[0][i] ? 0:1) *k);
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                int a = Math.max(dp[i-1][j]+gold[i][j] - (color[i-1][j]==color[i][j]?0:1) * k,dp[i-1][j]);
                int b = Math.max(dp[i][j-1]+gold[i][j] - (color[i][j-1]==color[i][j]?0:1) * k,dp[i][j-1]);

                dp[i][j] = Math.max(a,b);
            }
        }
        System.out.println(Arrays.deepToString(dp));
        System.out.println(dp[n-1][m-1]);
    }
}
