package logical;

import org.testng.annotations.Test;

public class PriorityWithTestNG {
	

	@Test(priority=-1)
	public void Test1() {
		System.out.println("This is minus one");
		
	}
	
	@Test(priority=-2)

	public void Test2 () {
		
		System.out.println("This is minus two");
	}
	@Test
	public void Test () {
		System.out.println("This is zero");

	}
	
	@Test(priority=1)

	public void Test3 () {
		
		System.out.println("This is positive one");
	}
	
	
	
	
	
}
