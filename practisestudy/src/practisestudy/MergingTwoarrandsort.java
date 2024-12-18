package practisestudy;

public class MergingTwoarrandsort {
	
	public static void mergingsort(int[] arr1,int[] arr2)
	{
		int  newarrylen=arr1.length+arr2.length;
		int[] newarr=new int[newarrylen];
		System.arraycopy(arr1, 0, newarr,0,arr1.length);
		System.arraycopy(arr2, 0, newarr,arr1.length,arr2.length);
		
		for(int i=0;i<newarr.length-1;i++)
		{
			for(int j=0;j<newarr.length-i-1;j++)
			{
				if(newarr[j]>newarr[j+1])
				{
					int temp=newarr[j];
					newarr[j]=newarr[j+1];
					newarr[j+1]=temp;
				}
			}
		}
		for(int num:newarr)
		{
			System.out.print(num+" ");
		}
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2= {21,23,43,45};
		mergingsort(arr1,arr2);
		

	}

}
