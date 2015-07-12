package sg.edu.moe.github.unitest;

/**
 * It is Test programming to github usages.
 * @author jinhui
 * @since 2015
 * @version 1.0
 */

public class TestApplication {

	// This is for version control and it will be managed and synced with the tag in comment in header. 
	private final static String VERSION = "1.0";
	
	
	private final String AUTHOR = "Jin Hui";
	
	public static void main(String[] args) { 
		System.out.println("Hello World, it is from MOE!");
		(new TestApplication()).print("abc");
	}
	
	private void print(String value) { 
		
		System.out.println("Yes, the value is: " + value);
		
		AnotherTest test = new AnotherTest();
		System.out.println("Value from AnotherTest is" + test.getVALUE());
	}	
}
