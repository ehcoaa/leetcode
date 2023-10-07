package com.littlestar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 小美比赛 {


    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        sc.nextLine();
        List<int[]> list = new ArrayList<>();
        //输入
        for(int i=0;i<T;i++){
            int n = sc.nextInt();
            int []a = new int[n];
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();
            }
            list.add(a);
            sc.nextLine();
        }

        for (int[] a : list) {
             int []ans = new int[a.length];
            for(int k=0;k<a.length;k++){
                //前面  如果颜色不同则获胜
                for(int m=0;m<k;m++){
                    if(a[k]!=a[m]){
                        ans[k]++;
                    }
                }
                //后面 如果颜色相同则获胜
                for(int x=k+1;x<a.length;x++){
                    if(a[k]==a[x])
                    {
                        ans[k]++;
                    }
                }
            }
            //输出
            for(int l=0;l<ans.length;l++){
                System.out.print(ans[l]+" ");
            }
            System.out.println();
        }




    }


}
