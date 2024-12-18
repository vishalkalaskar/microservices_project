package practisestudy;

public class Secondlargestele {
       public static int secondlargestele(int[] arr,int total)
	
	{
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;i<total;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			 }
		}
	   return arr[total-2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,21};
		System.out.print("second elem"+ secondlargestele(arr,6));

	}

}
