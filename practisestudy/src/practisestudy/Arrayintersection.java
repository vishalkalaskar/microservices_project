package practisestudy;

import java.util.ArrayList;

public class Arrayintersection {
	
	public static void arrayintersection(int[] arr1,int[] arr2)
	{
		//ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i] ==arr2[j])
				{
					System.out.print(" "+arr1[i]);
					//list.add(arr1[i]);
					
					
				}
			}
		//System.out.print(list);
			
		}
		/*
		 * for(int num:arr1) { System.out.println(num+" "); }
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,7,8};
		int[] arr2 = {11,2,31,17,8};
		arrayintersection(arr1,arr2);

	}

}
