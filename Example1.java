
public class Example1 {

	

		  public static void main(String[] args) {
		    //create a string variable
		    String greet="Hello World";//declaration and assignment
		    String wish;//declaration
		    wish="Good Morning";//assignment
		    
		    //print a string variable
		    System.out.println("String:"+greet);
		    System.out.println("Wish Message:"+wish);
		    
		    //get the length of string
		    int lengthGreet=greet.length();
		    int lengthWish=wish.length();
		    System.out.println("Length of greet:"+lengthGreet);
		    System.out.println("Length of wish:"+lengthWish);
		    
		    //join two java strings
		    String firstName="John";
		    String lastName="Doe";
		    String fullName;
		    
		    //string join with + operator
		    fullName="Mr. "+firstName+" "+lastName;
		    System.out.println(fullName);
		    
		    //string join with concat() function
		    fullName="Mr. ".concat(firstName).concat(" ").concat(lastName);
		    System.out.println(fullName);
		    
		    //compare two strings
		    
		    String x="Hello";
		    String y="Hello";
		    
		    System.out.println(x==y);
		    
		    String a=new String("Hello");
		    String b=new String("hello");
		    
		    System.out.println(a.equals(b));//false
		    System.out.println(a.equalsIgnoreCase(b));//true
		    

		  }

		}
	
