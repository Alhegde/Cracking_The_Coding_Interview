
public class MatrixZero {

	
	public void setZeros(int[][]matrix)
	{
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix.length];
		
		//set the row and col containing zero to true
		for(int i = 0 ; i< matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				if(matrix[i][j] == 0)
				{
					row[i] = true;
					column[j]=true;
				}
			}
		}
		
		//set the row and col to zero
		for(int i = 0 ; i< matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				if(row[i] || column[j])
				{
					matrix[i][j] = 0;
				
				}
			}
		}
	}
	public void printMatrix(int[][]matrix)
	{
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
	public int[][] transposeMatrix(int[][]matrix)
	{
		  int [][] transposematrix = new int[3][3];
		  int temp;
		 
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				//transposematrix[j][i]= matrix[i][j];
				temp= matrix[i][j];
				 matrix[i][j]= matrix[j][i]  ;
                matrix[j][i] = temp;			
			}
		}
		return matrix;
		//System.out.println("Sets the rows and columns containing zero to 0");
		//printMatrix(matrix);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][] matrix = new int[3][3];
        int [][] tmatrix = new int[3][3];
        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[0][2]=3;
        
        matrix[1][0]=4;
        matrix[1][1]=5;
        matrix[1][2]=6;
        
        matrix[2][0]=7;
        matrix[2][1]=8;
        matrix[2][2]=9;
        
        MatrixZero matrixObj = new MatrixZero();
        
        matrixObj.printMatrix(matrix);
       // matrixObj.setZeros(matrix);
        tmatrix=matrixObj.transposeMatrix(matrix);
        System.out.println("Sets the rows and columns containing zero to 0");
        matrixObj.printMatrix(tmatrix);
        
       
        		 
        		
        
	}

}
