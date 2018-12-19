
public class StringMethods {
	
	String s1 ="Jitendra";
	String s2 = "Sharma";
	

	public static void main(String[] args) {
		
		String s3 = "Test Within Main method";
		String s4 = "Test";
		
		StringMethods obj1 = new StringMethods();
		System.out.println("length of string s1: " +obj1.s1.length() ); 
		System.out.println("length of string s2: " +obj1.s2.length() );    //by use of object of instance variables
		System.out.println("length of string s3: " +s3.length() );
		
		System.out.println(obj1.s1.compareTo(obj1.s2));                          //by use of object of instance variables
		System.out.println(s3.compareTo(obj1.s2)); 
		System.out.println(s4.compareTo(s3)); 
	}

}
