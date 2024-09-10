import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		String rev="";
		Scanner in = new Scanner (System.in);
		System.out.println("Enter String: ");
		s = in.nextLine();
		int x = s.length();
		
		x--;
		for (int i = x; i >= 0; i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		
	}

}
