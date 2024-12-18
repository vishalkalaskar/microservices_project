package stringproblem;

public class Stringlefandrightrotation {

	
	public static String leftroatation(String str,int d)
	{
		int n=str.length();
		char[] rotated=new char[n];
		
		for(int i=0;i<n-d;i++)
		{
			rotated[i]=str.charAt(i+d);
		}
		for(int i=n-d,j=0;i<n;i++,j++)
		{
			rotated[i]=str.charAt(j);
		}
		return new String(rotated);
	}
	
	public static String rightrotation(String str,int d)
	{
		int n= str.length();
		char[] roatated= new char[n];
		for(int i=0;i<d;i++)
		{
			roatated[i]=str.charAt(n-d+i);
		}
		for(int i=d,j=0;i<n;i++,j++)
		{
			roatated[i]=str.charAt(j);
		}
		return new String(roatated);
	}
	public static void main(String[] args) {
		String str="GreeksforGreeks";
		int d=2;
		System.out.println("left roatation : "+leftroatation(str,d));
		System.out.println("right roatation : "+rightrotation(str,d));
	}

}
