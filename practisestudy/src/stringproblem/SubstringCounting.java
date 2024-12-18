package stringproblem;
import java.util.*;
public class SubstringCounting {
	

	// Java program to count number of 
	// substrings of s1 present in s2
	 
	static int countSubstrs(String s1, 
	                        String s2)
	{
	int ans = 0;
	 
	for (int i = 0; i < s1.length(); i++) 
	{
	     
	    // s3 stores all substrings of s1
	    String s3 = "";
	    char[] s4 = s1.toCharArray();
	    for (int j = i; j < s1.length(); j++)
	    {
	        s3 += s4[j];
	 
	        // check the presence of s3 in s2
	        if (s2.indexOf(s3) != -1) 
	            ans++;
	    }
	}
	return ans;
	}
	 
	// Driver code
	public static void main(String[] args) 
	{
	    String s1 = "aab", s2 = "aaaab";
	    System.out.println(countSubstrs(s1, s2));
	}
	}
	 