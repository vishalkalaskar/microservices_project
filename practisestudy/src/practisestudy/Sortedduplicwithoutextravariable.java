package practisestudy;

import java.util.Arrays;

public class Sortedduplicwithoutextravariable {
    
     static int[] removingduplicat(int[] num)
	{
		if(num ==null||num.length==0)
		{
			return new int[0];
		}
	    Arrays.sort(num);
	    int WriteIndex=1;
	    for(int i=1;i<num.length;i++)
	    {
	    	if(num[i] != num[i-1]) 
	    	{
	    		num[WriteIndex++]=num[i];
	    	}
	    	
	    }
		return Arrays.copyOf(num, WriteIndex);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[0,0,1,1,1,2,2,3,3,4]-[0,1,2,3,4]
		int[] num = {0,0,1,1,1,2,2,3,3,4};
		num=removingduplicat(num);
		System.out.println(Arrays.toString(num));
		

	}

}
