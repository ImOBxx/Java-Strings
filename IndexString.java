import java.util.Scanner;

public class IndexString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter String: ");
		str = in.nextLine();
		int a = str.indexOf(0);
		int b = str.indexOf(10);
		System.out.println("Character At Postion 0" + a);
		System.out.println("Character At Postion 10" + b);
		

	}

}
