package leetcode100.二分查找;

public class 插入位置 {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int l =0;
        int r = len-1;

        while(l<=r){
            int mid = (l+r)/2;
            //此时可能这个mid并不一定是最小的
//            if(nums[mid]==target){
//                return mid;
//            }
            //去左边找,很明显，如果并不是最小的索引，也应该去左边找
            if(nums[mid]>=target){
                r = mid-1;
            }else {//去右边找
                l = mid+1;
            }
        }
        return l;
    }
}
