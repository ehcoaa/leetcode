package com.dji;

import java.util.*;

public class Test0 {

    /* Write Code Here */
    public int[] ThreeDigitNumbers (int[] selectedDigits) {
        //去重
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<selectedDigits.length;i++){
            set.add(selectedDigits[i]);
        }
        Integer[] selectedDigits1 = (Integer[]) set.toArray();
        int len2 = selectedDigits1.length;

        List<Integer> threeNumbers = new ArrayList<>();
        for(int i=0;i<len2-2;i++){
            for(int j=i+1;j<len2-1;j++){
                for(int k=j+1;k<len2;k++){
                    int number = selectedDigits1[i]*100+
                                 selectedDigits1[j]*10+
                                 selectedDigits1[k];
                    threeNumbers.add(number);
                }
            }
        }

        //排序
        threeNumbers.sort(Integer::compareTo);

        //换成数组类型
        //Integer[] res = threeNumbers.toArray(new Integer[threeNumbers.size()]);

        int[] res = new int[threeNumbers.size()];
        for(int i=0;i<threeNumbers.size();i++){
            res[i] = threeNumbers.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] res;

        int selectedDigits_size = 0;
        selectedDigits_size = in.nextInt();
        int[] selectedDigits = new int[selectedDigits_size];
        for(int selectedDigits_i = 0; selectedDigits_i < selectedDigits_size; selectedDigits_i++) {
            selectedDigits[selectedDigits_i] = in.nextInt();
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        res = new Test0().ThreeDigitNumbers (selectedDigits);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }
    }
}
