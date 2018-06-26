
public class SetMatrixZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		setZeroes(matrix);
		printMatrix(matrix);
		
	}
	
	public static void printMatrix(int [][]matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	
    public static void setZeroes(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int col0 = -1;
        for(int i = 0; i < row; i++){
            if(matrix[i][0] == 0) col0 = 0;
            for(int j = 1; j < col; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        printMatrix(matrix);
        System.out.println();
        
        for(int i = row - 1; i > -1; i--){
            for(int j = col - 1; j > 0; j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                    printMatrix(matrix);
                    System.out.println();
                }                
            }
            if(col0 == 0) matrix[i][0] = 0;
        }
    }
	
	

}
