package leetcode100.二分查找;

public class 二维矩阵 {
    public static boolean  searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;//行
        int col = matrix[0].length;//列

        int row_l = 0;
        int row_r = row-1;
        //第一次二分 找到第一列中第一个小于target的值所在的行 row_l
        while (row_l<=row_r){
            int mid = (row_l+row_r)/2;
            //往左边找
            if(matrix[mid][0]==target) return true;
            if(matrix[mid][0]>target){
                row_r = mid-1;
            }
            //往右边找
            if(matrix[mid][0]<target){
                row_l = mid+1;
            }
        }

        int col_l = 0;
        int col_r = col-1;
        while(col_l<=col_r){
            int mid = (col_l+col_r)/2;
            if(matrix[row_l][mid]==target){
                return true;
            }
            if(matrix[row_l][mid]>target){
                col_r = mid-1;
            }
            if(matrix[row_l][mid]<target){
                col_l = mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        searchMatrix(matrix,13);
    }
}
