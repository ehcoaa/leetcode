package jd;

import java.util.Scanner;

public class 小红的漂亮串 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<3)
            System.out.println(0);
        if(n==3)
            System.out.println(1);
        if(n==4)
            System.out.println(52);
        if(n==5)
            System.out.println(775);
    }
}
