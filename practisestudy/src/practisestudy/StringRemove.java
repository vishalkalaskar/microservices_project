package practisestudy;

public class StringRemove {
	
	
	public static void stringRemovemethod(String str,char ch)
	{
	  int n = str.length();
	  String newstring ="";
	  for(int i=0;i<n;i++)
	  {
		  if(str.charAt(i) !=ch)
		  {
			  newstring= newstring + str.charAt(i);
		  }
	  }
	  System.out.println("after removing "+ newstring);
	   
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="codeingTech";
		char ch='c';
		stringRemovemethod(str,ch);
		
		

	}

}
