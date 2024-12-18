package practisestudy;

public class ReverserArray {
	
    public static void reverarrymethod(int[] arr)
    {
    	int end=arr.length;
    	for(int i=0;i<end;i++)
    	{
    		int temp=arr[i];
    		arr[i]=arr[end];
    		arr[end]=temp;
    		end --;
    		
    	}
    	for(int num:arr)
    	{
    		System.out.print(num+" ");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,32,45,67,32};
		reverarrymethod(arr);

	}

}
