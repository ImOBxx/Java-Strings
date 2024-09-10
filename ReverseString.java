import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		String a;
		System.out.println("Enter String: ");
		a = in.nextLine();
		
		String b = " ";
		int ptr = a.length() - 1;
		while (ptr >= 0)
		{
			b = b + a.charAt(ptr);
			ptr--;
			
		}
		System.out.println(b.trim());
		
		if (a.equalsIgnoreCase(b.trim()))
		{
			System.out.println("String Is A Palindrome");
		}
		else 
		{
			System.out.println("String Is Not A Palindrome");
		}
		
	}

}
