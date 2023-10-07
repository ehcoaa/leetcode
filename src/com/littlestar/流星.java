package com.littlestar;

import java.util.*;

public class 流星 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 读取流星数量
            int n = scanner.nextInt();

            // 读取每个流星的出现和消失时间
            int[] starts = new int[n];
            int[] ends = new int[n];
            for (int i = 0; i < n; i++) {
                starts[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                ends[i] = scanner.nextInt();
            }

            // 将每个时间点的流星数量统计出来
            List<int[]> events = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                events.add(new int[]{starts[i], 1});
                events.add(new int[]{ends[i] + 1, -1});
            }
            Collections.sort(events, new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    return Integer.compare(a[0], b[0]);
                }
            });

            // 找出最佳时刻
            int maxCount = 0;
            int bestTimes = 0;
            int count = 0;
            for (int i = 0; i < events.size(); i++) {
                count += events.get(i)[1];
                if (count > maxCount) {
                    maxCount = count;
                    bestTimes = 1;
                } else if (count == maxCount) {
                    bestTimes++;
                }
            }

            System.out.println(maxCount + " " + bestTimes);
        }
}
