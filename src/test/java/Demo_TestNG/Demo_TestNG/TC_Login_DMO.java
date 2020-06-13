package Demo_TestNG.Demo_TestNG;

import org.testng.annotations.Test;

public class TC_Login_DMO {
	//if login is pased then only i have to run home screen related test
	
		//TC_login_01()--->success then only i have to run TC_LOgin_02
		
	@Test
	public void TC_Login_01()throws Exception {//username and pasword fiels are present or not
		System.out.println("TC_Login_01 Executed");
		//throw new Exception("Intentionally");
	}
   @Test(dependsOnMethods="TC_Login_01")
	public void TC_Login_02() {//pas valid username and check whether it is login or not
		System.out.println("TC_Login_02 Executed");
	}
   @Test
	public void TC_Login_03() {
		System.out.println("TC_Login_03 Executed");
	}
   @Test 
 void TC_Login_04() {
  		System.out.println("TC_Login_04 Executed");
  	}

}
