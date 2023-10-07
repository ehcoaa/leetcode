package meituan;

import java.util.Arrays;
import java.util.Scanner;

public class 春游 {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        //巧克力数
        n = sc.nextInt();
        //询问数
        m = sc.nextInt();
        int []qkl= new int[n];
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            qkl[i] = (int) Math.pow(temp,2);
        }
        sc.nextLine();

        int []ask = new int[m];
        for(int i=0;i<m;i++){
            ask[i] = sc.nextInt();
        }
        sc.nextLine();

        //对巧克力重量先进行排序,贪心思想先装小的
        Arrays.sort(qkl);
        System.out.println(Arrays.toString(qkl));


        int ans[] = new int[m];
        for (int i=0;i<m;i++)
        {
            int index  =0;
            for(int j=0;j<n;j++){
                index +=qkl[j];
                if(index<=ask[i]){
                    ans[i]++;
                }
                else {
                    break;
                }
            }
        }
        for(int i=0;i<m;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
