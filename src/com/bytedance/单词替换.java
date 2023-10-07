package com.bytedance;

import java.util.ArrayList;
import java.util.List;

public class 单词替换 {
    public static String replaceWords(List<String> dictionary, String sentence) {
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            for (String s1 : dictionary) {
                if(s[i].startsWith(s1)){
                    s[i] = s1;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length-1; i++) {
            sb.append(s[i]);
            sb.append(" ");
        }
        sb.append(s[s.length-1]);
        return sb.toString();
    }

    public static void main(String[] args) {
        List<String>  dictionary = new ArrayList<>();
        dictionary.add("cat");
        dictionary.add("rat");
        dictionary.add("bat");
        String sentence = "the cattle was rattled by the battery";

        replaceWords(dictionary,sentence);
    }
}
