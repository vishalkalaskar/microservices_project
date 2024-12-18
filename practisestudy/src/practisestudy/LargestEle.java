package practisestudy;

public class LargestEle
{
	
	public static void laregestele(int[] arr)
	{
		int largest =arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
				
			}
		}
		System.out.print(largest);
	}
	
			
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,21};
		//int n=arr.length;
		laregestele(arr);
		//System.out.print("second elem"+ secondlargestele(arr,6));
		//System.out.print(second);
	}

}
