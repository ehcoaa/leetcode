package com.littlestar;

import java.util.Scanner;

/**
 * 小美有一个由数字字符组成的字符串。现在她想对这个字符串进行一些修改。
 * 具体地,她可以将这个字符串中任意位置字符修改为任意的数字字符。
 * 她想知道,至少进行多少次修改，可以使得修改后的字符串不包含两个连续相同的字符?
 * 例如，对于字符串”111222333”。她可以进行3次修改将其变为”121212313。
 */
public class 字符串修改 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int res = 0;
        char[] chars = string.toCharArray();
        for(int i=1;i<chars.length-1;i++){
            if(chars[i]==chars[i-1]&&chars[i]==chars[i+1]){
                res++;
            }
        }
        System.out.println(res);
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int res = 0;
        char[] chars = string.toCharArray();

        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                chars[i] = 'i';
                res++;
            }
        }
        System.out.println(res);
    }

}

