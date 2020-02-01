
public class MatrixZeros {
    private static void printMatrix(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    private static int[][] makeZeros(int[][] matrix, int target){

        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] newMat = new int[rows][];

        for(int i=0; i<rows; i++){
            newMat[i] = matrix[i].clone();
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++) {
                if(newMat[i][j]==target){
                    matrix[i] = new int[columns];
                    for(int k=0; k<columns; k++){
                        matrix[k][j] = 0;
                    }
                    break;
                }
            }
        }

        printMatrix(matrix);
        return matrix;
    }

    public static void main(String[] args) {

        int mat[][] = {{ 2,0,7},
                       {-3,4,5,},
                       { 1,1,0}};
        makeZeros(mat, 0);
    }
}
