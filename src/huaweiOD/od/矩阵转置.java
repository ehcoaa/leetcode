package huaweiOD.od;

public class 矩阵转置 {
    public void rotate(int[][] matrix) {
    //主对角线翻转
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int index = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = index;
            }
        }
        //以每行的中点 对称反转
        int m = n/2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int index = matrix[i][j];
                matrix[i][j] = matrix[i][n-j+1];
                matrix[i][n-j+1] = index;
            }
        }
    }

}
