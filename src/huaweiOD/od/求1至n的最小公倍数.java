package huaweiOD.od;

import java.math.BigInteger;
import java.util.Scanner;

public class 求1至n的最小公倍数 {
    public  static void  main0(String args[]) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        BigInteger tmp = BigInteger.ONE;
        for(int i = 1;i <= n;i++) {
            tmp = tmp.multiply(BigInteger.valueOf(i)).divide(tmp.gcd(BigInteger.valueOf(i)));
        }
        System.out.println(tmp.mod(BigInteger.valueOf(1000000007)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n+1];
        //把1~n都放到数组里面
        for (int i = 1; i <=n ; i++) {
            arr[i] = i;
        }

        //因为是顺序的1~n 可以直接前往后判断
        //如果某个大的数是某个小的数的倍数，即存在因子，那就除于因子
        for (int i = 1; i < n; i++) {
            for (int j = i+1; j <=n; j++) {
                if(arr[j]%arr[i]==0){
                    arr[j] = arr[j]/arr[i];
                }
            }
        }

        //大数相乘
        BigInteger res = BigInteger.ONE;//大数1

        for (int i = 1; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(arr[i]));
        }
        System.out.println(res);
    }
}
