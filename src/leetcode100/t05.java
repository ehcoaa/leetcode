package leetcode100;

public class t05 {

    //暴力法 时间不通过
    public int maxArea(int[] height) {

        int res = 0;
        for (int i = 0; i < height.length-1; i++) {
            for(int j=i+1;j<height.length;j++){
                int index  = j-i * Math.min(height[i],height[j]);
                res = Math.max(res,index);
            }
        }
        return res;
    }

    //双指针法
    public int maxArea0(int[] height) {
        int maxArea = 0, left=0,right = height.length-1;
        while (left<right){
            int area = (right-left)*Math.min(height[left],height[right]);
            maxArea = Math.max(area,maxArea);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }


}
