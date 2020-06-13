package Demo_TestNG.Demo_TestNG;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC_Login {
	
	Logger log = Logger.getLogger(getClass().getSimpleName());
	
	@BeforeSuite
	public void settingLog4j() throws Exception {
		propertiesLoader.loadLog4jPropertyFile(System.getProperty("user.dir")+"\\src\\test\\java\\properties\\log4j.properties");
	}
	
	@Test
	public void TC_Login_01() {
		System.out.println("TC_Login_01 Executed");
		log.info("TC_Login_01 Executed");
	}
   @Test
	public void TC_Login_02() {
		System.out.println("TC_Login_02 Executed");
		log.info("TC_Login_02 Executed");
	}
   @Test(enabled=true)
	public void TC_Login_03() {
		System.out.println("TC_Login_03 Executed");
		log.error("TC_Login_03 Executed");
	}
   @Test 
 void TC_Login_04() {
  		System.out.println("TC_Login_04 Executed");
  		log.debug("TC_Login_04 Executed");
  	}

}
