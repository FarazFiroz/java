





public class TwoDArray{
    public static void main(String[] args) {
/*         int n = 5;
        int m = 6;
        int[][] arr = {
            {1,5,7,9,10,11},
            {6,10,12,13,20,21},
            {9,25,29,30,32,41},
            {15,55,59,63,68,70},
            {40,70,79,81,95,105}
        }; */

        //spiral order matrix
/* 
        int row_start = 0;
        int row_end = n-1;
        int col_start = 0;
        int col_end = m-1;

        while(row_start<row_end && col_start<col_end){
            for(int i = col_start; i<=col_end; i++){
                System.out.print(arr[row_start][i] + " ");
            }
            row_start++;

            for(int i = row_start; i<=row_end; i++){
                System.out.print(arr[i][col_end] + " ");
            }
            col_end--;

            for(int i = col_end; i>=col_start; i--){
                System.out.print(arr[row_end][i] + " ");
            }
            row_end--;

            for(int i = row_end; i>=row_start; i--){
                System.out.print(arr[i][col_start] + " ");
            }
            col_start++;
        }
        System.out.println("");
 */



        int n = 2;
        int m = 3;
        int[][] arr = {
            {1,5,7},
            {6,10,12}
        };

        System.out.println("The transpose is : ");
        //To print transpose
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println("");
        }


    }
}