
public class MatrixReplace {

	public void setZeros(int[][] matrix)
	{
		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
		boolean row[] = new boolean[matrix.length];
		boolean column[] = new boolean[matrix[0].length];
		
		for(int i=0 ; i<matrix.length ; i++)
		{
			for(int j=0;j<matrix[0].length; j++)
			{
				if(matrix[i][j] == 0)
				{
				    row[i] = true;
				    column[j] = true;
				}
			}
		}
		for(int i=0 ; i<matrix.length ; i++)
		{
			for(int j=0;j<matrix[0].length; j++)
			{
				
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
