
public class ConstantLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "GeeksForGeeks";
		String s2 = "Geeks";
		System.out.println(s1.contains(s2));
		System.out.println(s1.equals(s2));
		int res = s1.compareTo(s2);
		String s3 = "Her";
		if (res == 0)
		{
			System.out.println(s1.compareTo(s3));
		}
		else if (res > 0)
		{
			System.out.println("S1 Greater");
		}
		else if (res < 0)
		{
			System.out.println("S1 Smaller");
		}
		System.out.print(s1.indexOf(s2, 1));
		
	}

}
