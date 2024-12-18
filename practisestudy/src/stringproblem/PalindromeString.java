package stringproblem;

public class PalindromeString {
	
	public static void checking(String str)
	{
		String newstr="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			newstr=ch+newstr;
			
		}
		
		System.out.println("nestr "+newstr);
		if(str.equals(newstr))
		{
			System.out.println("string is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}
		
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="greeks";
		//String str="racecar";
		 str.toLowerCase();
		 checking(str);
		
	}

}
