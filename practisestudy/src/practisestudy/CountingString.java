package practisestudy;

public class CountingString {
	
	public static void countingString(String str)
	{
		
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) !=' ' && str.charAt(i) != ',')
			{
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ab, cd, xyz";
		countingString(str);

	}

}
