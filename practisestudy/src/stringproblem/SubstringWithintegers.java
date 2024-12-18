package stringproblem;

import java.util.ArrayList;
import java.util.List;

public class SubstringWithintegers {
	
	public static List<Integer> numsubstring(int num)
	{
		List<Integer> substring = new ArrayList<>();
		String numstr=String.valueOf(num);
		int n=numstr.length();
		
		//Generate all possible substrings
		for(int i=0;i<n;i++)
		{
			for(int len=1;len<=n-i;len++)
			{
				int substringNum=0;
				for(int j=i;j<i+len;j++)
				{
					substringNum=substringNum*10+(numstr.charAt(j)-'0');
				}
				substring.add(substringNum);
			}
		}
		
		
		 return substring;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N1 = 12345;
        int N2 = 123;

        System.out.println("Possible Substrings for " + N1 + ": " + numsubstring(N1));
        System.out.println("Possible Substrings for " + N2 + ": " + numsubstring(N2));

	}

}
