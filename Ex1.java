import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String s;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter String: ");
		s = in.next();
		int x = s.length();
		for(char ch='A';ch<='Z';ch++)
		{
			count=0;
			//System.out.println(ch);
			for(int i=0;i<x;i++)

			{
				char  chr=s.charAt(i);
				if(chr==ch)
				{
					count++;
				}
			}
			if(count>0)
			{
				
				System.out.println("Character "+ ch + " frequency is " + count);
			}
			
		}	
		/*for (int i = 0; i < x; i++)
		{
			
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U')
			{
				count += 1;	
			}
		}*/
	
		
		//System.out.println("No of Vowels" + count);
		
		

	}

}
