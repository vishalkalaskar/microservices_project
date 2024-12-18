package practisestudy;

public class Sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};//1+2+3+4+5
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			int element = arr[i];
			//sum=sum+element;
			sum+= element;
		}
       System.out.println("sum of array is "+sum);
	}

}
