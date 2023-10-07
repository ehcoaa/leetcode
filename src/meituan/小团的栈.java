package meituan;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class 小团的栈 {

    //对栈进行排序  顶大底小
    public static ArrayDeque<Integer> sortStack(ArrayDeque<Integer> stack){
                  int[] a = new int[stack.size()];
                  int i=0;
                  while (!stack.isEmpty()){
                      //得到第一个元素并删除
                      a[i] = stack.remove();
                      i++;
                  }
                  //对数组进行排序
                  Arrays.sort(a);
                for (int e : a) {
                    stack.push(e);
                }
                return stack;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("数组元素：");
        System.out.println(Arrays.toString(a));
        ArrayDeque<Integer> stack = new ArrayDeque();
        for (int i = 0; i < a.length; i++) {
                //弹出并输出
                if(a[i]==-1){
                    int first = (int) stack.removeFirst();
                    System.out.println(first+" ");
                }
                //排序栈
                if(a[i]==0){
                    stack = sortStack(stack);
                }
                //压栈
            System.out.println("压栈"+i);
            stack.push(a[i]);
        }

//        while (!stack.isEmpty()){
//            //得到第一个元素并删除
//            System.out.println(stack.remove());
//        }
    }
}
