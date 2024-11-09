package Oct.ex_25102024_Arrays;

public class Lab193_Arrays_2D {
    public static void main(String[] args) {
        // 2D
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // {1, 2, 3} - A1
        // {4, 5, 6} - A2
        // {7, 8, 9} - A3
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }

        //System.out.println(matrix);
        // R_C
        int [][] martix_3_2 = { {1,2}, {3,4},{5,6}};
        int [][] martix_3_1 = { {1}, {3},{5}};
        int [][] martix_2_2 = { {1,2},{3,4}};
        //System.out.println(martix_2_2);
       // System.out.println(martix_3_1);
        //System.out.println(martix_3_2);
    }
}