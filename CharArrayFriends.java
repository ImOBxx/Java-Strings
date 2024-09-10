import java.util.Arrays;

public class CharArrayFriends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] friends = {
				"Alice",
				"Bob",
	            "Charlie",
	            "Jack",
	            "David",
	            "Eva",
	            "Frank",
	            "Grace",
	            "Hannah",
	            "Ivy",
	            "Jack"
		};
		
		Arrays.sort(friends);
		
		System.out.println("Friends sorted in alphabetical order: ");
		for (String friend : friends)
		{
			System.out.println(friend);
		}

	}

}
