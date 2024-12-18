package stringproblem;

public class ReversendAdditionstar {
   

	// Function to print the required pattern 
	static void printPattern(char[] s, int n) 
	{ 
	    // Print the unmodified string 
	    System.out.println(s); 
	 
	    // Reverse the string 
	    int i = 0, j = n - 1; 
	    while (i < j) 
	    { 
	        char c = s[i]; 
	        s[i] = s[j]; 
	        s[j] = c; 
	        i++; 
	        j--; 
	    } 
	 
	    // Replace the first and last character 
	    // by '*' then second and second last 
	    // character and so on until the string
	    // has characters remaining 
	    i = 0; 
	    j = n - 1; 
	    while (j - i > 1) 
	    { 
	        s[i] = s[j] = '*'; 
	        System.out.println(s);
	        i++; 
	        j--; 
	    } 
	} 
	 
	// Driver Code
	public static void main(String []args)
	{
	    char[] s = "geeks".toCharArray(); 
	    int n = s.length; 
	 
	    printPattern(s, n);
	}
	}