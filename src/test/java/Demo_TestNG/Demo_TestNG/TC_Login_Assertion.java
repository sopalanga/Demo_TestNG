package Demo_TestNG.Demo_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


public class TC_Login_Assertion {
	@Test
	public void TC_Login_01()throws Exception {
		System.out.println("TC_Login_01 Executed");
		//you have entered the credentials in a login screen and then you went to home screen and there you are 
		//valideting whether home screen is dsplayed or not
		
		//Assert.assertEquals(false, true);
		//Assert.assertEquals(false, true, "Home screen is not displayed");
		//you are logedinto home screen and you are getting some element
		//Assert.assertNotSame("Admin", "User", "Srinidhi is not");
		Assert.assertSame("Admin", "User", "Logged in as an user im expecting user here");
	}
  /* @Test(dependsOnMethods="TC_Login_01")
	public void TC_Login_02() {
		System.out.println("TC_Login_02 Executed");
	}
   @Test
	public void TC_Login_03() {
		System.out.println("TC_Login_03 Executed");
	}
   @Test 
 void TC_Login_04() {
  		System.out.println("TC_Login_04 Executed");
  	}*/

}
