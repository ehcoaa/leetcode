package huaweiOD;

import java.util.Scanner;

public class t01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tag = sc.nextLine();
        String[] strings = sc.nextLine().split("\\s+");
        for (int i = 0; i < strings.length;) {
            int len = Integer.parseInt(strings[i + 2] + strings[i + 1], 16);//十六进制
            if(tag.equals(strings[i])){
                StringBuilder sb = new StringBuilder();
                for(int j=i+3;j<i+3+len;j++){
                    sb.append(strings[j]);
                    sb.append(" ");
                }
                System.out.println(sb.toString());
                break;
            }
            else{
                i = i+len+3;
            }

        }

    }
}
