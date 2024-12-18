package practisestudy;

import java.util.ArrayList;

public class Searchingelementin2d {
	
	public static void searchningele(int[][] arr,int k)
	{
		int row = arr.length;
		int col = arr[0].length;
		
		boolean found =false;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(arr[i][j]==k)
				{
					System.out.println("element of positon is "+i+" "+j);
					found=true;
					break;
					
				}
				
				
				
			}
		}
		if(!found)
		{
			System.out.println("-1");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] mat= { {1, 5, 9},
//                {14, 20, 21},
//                {30, 34, 43} };
//        int  x = 14;

//		searchningele(mat,x);
		
int[][] mat = { {1, 5, 9, 11},
                {14, 20, 21, 26},
                {30, 34, 43, 50} };
   int x = 42;
    searchningele(mat,x);
//Output : -1

	}

}
