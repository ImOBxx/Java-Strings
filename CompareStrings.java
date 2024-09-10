
public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "This is Exercise 1";
		String s2 = "This is Exercise 2";
		
		int res = s1.compareTo(s2);
		
		if (res < 0)
		{
			System.out.println("This is Exercise 1 is less than This is Exercise 2");
		}
		else 
		{
			System.out.println("This is Exercise 1 is Greater than This is Exercise 2");
		}

	}

}
