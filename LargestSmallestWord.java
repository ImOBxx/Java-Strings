
public class LargestSmallestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This Is An Umbrella";
		String[] words = s.split(" ");
		
		String smallestWord = words[0];
		String largestWord = words[0];
		
		for (String word : words) {
			if (word.length() < smallestWord.length()) {
				smallestWord = word;
			}
			if (word.length() > largestWord.length()) {
				largestWord = word;
			}
		}
		
		System.out.println("Smallest Word: " + smallestWord);
		System.out.println("Largest Word: " + largestWord);
		

	}

}
