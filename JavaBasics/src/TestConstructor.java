
public class TestConstructor {

	TestConstructor()
	{
		System.out.println("Inside constructor");
	}
	
	public void add()
	{
		System.out.println("Inside add method");
	}

	public static void main(String[] args) {
		
		TestConstructor obj = new TestConstructor();
		//obj.add();
	}

}
