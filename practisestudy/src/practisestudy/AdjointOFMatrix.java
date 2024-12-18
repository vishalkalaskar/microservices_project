package practisestudy;

public class AdjointOFMatrix {
	
	public static void adj(int[][] A)
	{
		int row=A.length;
		int col=A[0].length;
		int a00 = 0;
		int a01=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(A[i][j]==A[0][0])
				{
					a00 =A[1][1]*A[2][2]-A[2][1]*A[1][2];
					
				}
				else if(A[i][j]==A[0][1])
				{
					a01= -A[1][0]*A[2][2]+A[1][2]*A[2][0];
				}
			}
			
		}
		System.out.println("a00 "+ a00 + " a01 "+a01);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat= { {1,2,3},
				       {1,3,4},
				       {1,4,3}
				     };
		adj(mat);
	}

}
