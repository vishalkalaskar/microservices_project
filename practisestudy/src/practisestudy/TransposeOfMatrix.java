package practisestudy;

public class TransposeOfMatrix {
	
	public static void transpose(int[][] A)
	{
		int row=A.length;
		int col=A[0].length;
		//int[][] B = new int[row][col]; // this is using M*N space
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				//B[j][i]=A[i][j];  // this is using M*N space
				int temp=A[i][j];  // this is using N*N space
				A[i][j]=A[j][i];
				A[j][i]=temp;
				
			}
		}
		System.out.print("Result matrix is \n"); 
        for (int i = 0; i < row; i++)
        { 
            for (int j = 0; j <col; j++)
            {
            	// System.out.print(B[i][j] + " ");
            	System.out.print(A[j][i] + " ");
            }
                
                System.out.println(); 
        } 
		
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][] = { { 1, 1, 1, 1 }, 
                { 2, 2, 2, 2 }, 
                { 3, 3, 3, 3 }, 
                { 4, 4, 4, 4 } }; 
		transpose(A);
	}

}
