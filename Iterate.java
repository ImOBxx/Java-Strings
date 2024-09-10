import java.util.Scanner;

public class Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter String: ");
		s = in.next();
		String ns = "";
		
		for (int i = s.length() - 1; i >= 0; i--)
		{
			ns = ns + s.charAt(i);
		}
		
		System.out.println(ns);
		
		if (s.equalsIgnoreCase(ns))
		{
			System.out.println("String Is A Palindrome");
		}
		else
		{
			System.out.println("String Is A Not Palindrome");
		}

	}

}
