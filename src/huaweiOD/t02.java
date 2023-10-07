package huaweiOD;

import java.util.*;

public class t02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();


        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }


        String word = list.remove(k);//当前字母
        List<String> resList = new ArrayList<>();
        while(word!=null){
            resList.add(word);
            word = getNextWord(word,list);
        }
        System.out.println(String.join("", resList));

    }
    //由上一个单词 去决定下一个单词
    public static String getNextWord(String str,List<String> list){
        if(str==null||str.isEmpty()){
            return null;
        }
        String res = null;
        String next;
        int index =-1;

        for (int i = 0; i < list.size(); i++) {
            next = list.get(i);
            //首字母与上一个单词的尾字母相同
            if (next.charAt(0)==str.charAt(str.length()-1)){
                if(res==null){//如果是空，这个单词暂存为结果
                    res = next;
                    index = i;
                }else{
                    //先比较长度
                    if(next.length()>res.length()){
                        res = next;
                        index = i;
                    }else if(next.length()==res.length()){
                        //长度相等时，比较顺序
                        if(next.compareTo(res)<0){
                            res = next;
                            index = i;
                        }
                    }
                }
            }
        }
        if(index==-1){
            return  null;//表示已经结束
        }
        return list.remove(index);//返回字符串，并且删掉了已经接龙的单词
    }
}
