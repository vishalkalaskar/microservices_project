package practisestudy;

import java.util.ArrayList;
import java.util.List;

public class OddandEveen {
     
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {1,2,3,4,5,6};
		
		List<Integer> evenum=new ArrayList<>();
		List<Integer> oddnum=new ArrayList<>();
       
		for(int num:numbers)
		{
			if(num%2 ==0)
			{
				evenum.add(num);
			}
			else {
				oddnum.add(num);
			}
		}
		System.out.println("even nubmer"+evenum);
		System.out.println("even nubmer"+oddnum);
	}

}
