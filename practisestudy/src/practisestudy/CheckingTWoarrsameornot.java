package practisestudy;

public class CheckingTWoarrsameornot {

	public static boolean twoArraycehc(int[] arr1,int[] arr2)
	{
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i] !=arr2[i])
			{
				//System.out.println("it is same");
				return false;
				
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {1,2,3,4,5};
		boolean valid =twoArraycehc(arr1,arr2);
		if(valid)
		{
			System.out.println("array are equal");
		}
		else{
			System.out.println("array are not equal");
		}

	}

}
