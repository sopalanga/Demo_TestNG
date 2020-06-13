package Demo_TestNG.Demo_TestNG;

import org.testng.annotations.Test;

public class priority_TestNg {
	
	//Priority in ranking wise first rank is good or tenth rank is good.
	//when you have same annotations for more than one methods and if you used priority to it
	//it works on priority
	//higher the priority (in terms of number)higher the order
	//when you have not given an priority to any of the method then annotations will assume the priority as 0
	//priority can be used only for @Test annotations only
	//-1,0,1,10
	//enable is the tag which used to block the execution of methods
	

	@Test(priority=10)
	public void A3() {
		System.out.println("@Test A3");
	}
	@Test(priority=-1,enabled=true)
	//@Test(priority=-1,enabled=false)
	public void am4() {
		System.out.println("@Test am4");
	}
	
	@Test
	public void a2m1() {
		System.out.println("@Test a2m1");
	}
	
	@Test(priority=1)
	public void b3m1() {
		System.out.println("@Test b3m1");
	}
	
	/*@Test()
	public void a1() {
		System.out.println("@Test a1");
	}
	
	@Test
	public void a2() {
		System.out.println("@Test a2");
	}
	@Test
	public void a3() {
		System.out.println("@Test a3");*/
	

}
