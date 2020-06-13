package Demo_TestNG.Demo_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class attest_annotation {
	
	//same annotations are running in this script
	//all were different and we get to know which one will execute first
	
	//when u have same annotations for more then one methods.order will be depending on alphabets(CAPITAL,SMALL) NUMBERS
	
	
	@Test
	public void A3() {
		System.out.println("@Test A3");
	}
	
	@Test
	public void am4() {
		System.out.println("@Test am4");
	}
	
	@Test
	public void a2m1() {
		System.out.println("@Test a2m1");
	}
	
	@Test
	public void b3m1() {
		System.out.println("@Test b3m1");
	}
	
	@Test
	public void a1() {
		System.out.println("@Test a1");
	}
	
	@Test
	public void a2() {
		System.out.println("@Test a2");
	}
	@Test
	public void a3() {
		System.out.println("@Test a3");
	}
	
	@BeforeSuite
	public void A4() {
		System.out.println("@BeforeSuite A4");
	}
	
	@BeforeClass
	public void z4() {
		System.out.println("@BeforeClass z4");
	}
	
	@BeforeTest
  public void z5() {
	System.out.println("@BeforeTest z4");
	}
	
	@BeforeMethod
	  public void z6() {
		System.out.println("@BeforeMethod z6");
		}
	@AfterMethod
	  public void z7() {
		System.out.println("@AfterMethod z7");
		}

}
