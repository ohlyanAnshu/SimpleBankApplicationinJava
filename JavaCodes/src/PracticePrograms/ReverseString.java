package PracticePrograms;

import java.util.Scanner;

public class ReverseString implements ReverseMethods{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		
		ReverseMethods rs = new ReverseString();
		System.out.println(rs.reverse(sc.nextLine()));
		
	}
	
	public String reverse(String toreverse) { 
		
		if(toreverse == null)
		{
			throw new IllegalArgumentException("Please enter a valid value. Null not allowed.");
		}
		
		char[] in = toreverse.toCharArray();
		
		StringBuilder out = new StringBuilder();
		
		for(int i = in.length - 1; i >= 0; i--) {
			
			out.append(in[i]);
		}
				
		return out.toString();
	}
	
}

interface ReverseMethods {
	String reverse(String str);
}

