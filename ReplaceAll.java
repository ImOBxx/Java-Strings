
public class ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "The quick brown fox jumps over the lazy dog.";
		
		String ns = s1.replaceAll("fox", "cat");
		
		System.out.println("Original string: " + s1);
        System.out.println("New String: " + ns);

	}

}
