package com.onjava;

public class 冒泡排序 {
    //原始
    public void bubble(int[] nums){
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    //优化1
    /**
     * 假设我们现在排序ar[]={1,2,3,4,5,6,7,8,10,9}这组数据，
     * 按照上面的排序方式，第一趟排序后将10和9交换已经有序，
     * 接下来的8趟排序就是多余的，什么也没做。所以我们可以在交换的地方加一个标记，
     * 如果那一趟排序没有交换元素，说明这组数据已经有序，不用再继续下去。
     * @param nums
     */
    public void bubble1(int[] nums){
        int len = nums.length;
        int temp;
        for (int i = 0; i < len-1; i++) {//排序趟数
            int flag = 0;//标记作用，如果==1这趟没有交换 说明以及排好序。不用再排。
            for (int j = 0; j < len-i-1; j++) {//一趟比较多少次 j肯定小于len-1的，i是已经排好了多少个
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag ==0)
                return;
        }
    }

    //优化二

    /**
     * 优化一仅仅适用于连片有序而整体无序的数据(例如：1， 2，3 ，4 ，7，6，5)。
     * 但是对于前面大部分是无序而后边小半部分有序的数据(1，2，5，7，4，3，6，8，9，10)
     * 排序效率也不可观，对于种类型数据，我们可以继续优化。
     *
     * 既我们可以记下最后一次交换的位置，后边没有交换，必然是有序的，
     * 然后下一次排序从第一个比较到上次记录的位置结束即可。
     * @param nums
     */
    public void bubble2(int[] nums){
        int len = nums.length;
        int k = len-1;//最开始的，需要比较的最后一个元素的索引
        int pos = 0;  //用来记录当前交换的位置，如果只交换到这里，那么这个位置之后的元素没必要在继续比较了
        for (int i = 0; i < len - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < k; j++) {
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    flag = true;
                    pos = j; //记录
                }
            }
            k =pos; //一趟之后赋值
            if (flag==true) {
                return;
            }
        }
    }


}
