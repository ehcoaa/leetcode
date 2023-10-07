package com.dji;

import java.util.Scanner;

public class Test1 {
    /* Write Code Here */
    public int[] calculateFinalPositi(String instructions) {
        int[] res = {0,0};
        char[] array = instructions.toCharArray();
        int u = 0;
        int d = 0;
        int l = 0;
        int r = 0;
        for (char c : array) {
            if(c=='U'){
                u++;
            }
            if(c=='D'){
                d++;
            }
            if(c=='L'){
                l++;
            }
            if(c=='R'){
                r++;
            }
        }
        res[0] = r-l; //正负两种可能  lr控制X轴
        res[1] = u-d; //正负两种可能  ud控制Y轴

        return res;
    }

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int[] res;

            String instructions;
            try {
                instructions = in.nextLine();
            } catch (Exception e) {
                instructions = null;
            }

            res = new Test1().calculateFinalPositi(instructions);
            for(int res_i=0; res_i < res.length; res_i++) {
                System.out.println(String.valueOf(res[res_i]));
            }
    }
}
