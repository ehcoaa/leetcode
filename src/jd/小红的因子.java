package jd;

import java.util.Scanner;

public class 小红的因子 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < t; i++) {
            //找到因子
            for(int j=1;j<=a[i];j++){
                if(a[i]%j==0){
                    if(j*j>a[i])
                    {
                        System.out.println(j+" ");
                        break;
                    }
                }
            }
        }
    }
}
