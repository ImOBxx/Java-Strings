
public class ContentsEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "example.com", s2 = "Example.com";
		
		CharSequence cs = "example.com";
		
		System.out.println("Comparing: " + s1 + " and " + cs + s1.contentEquals(cs));
		
		System.out.println("Comparing: " + s2 + " and " + cs + s2.contentEquals(cs));

	}

}
