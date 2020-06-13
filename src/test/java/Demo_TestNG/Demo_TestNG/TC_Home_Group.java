package Demo_TestNG.Demo_TestNG;

import org.testng.annotations.Test;

public class TC_Home_Group {
	

	
		@Test(groups="Sanity")
		public void TC_Home_01() {
			System.out.println("TC_Home_01 Executed");
		}

		
		
		@Test(groups="regression")
		public void TC_Home_02() {
			System.out.println("TC_Home_02 Executed");
		}

	}

//The is a consecpt of suite
//When you have a concept of multiple testcases weare going to use it
//select both home and login class--->right click--->testNG------>convert to testNG
