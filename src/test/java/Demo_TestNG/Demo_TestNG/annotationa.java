package Demo_TestNG.Demo_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotationa {
	
	//Annotations
@BeforeSuite
	public void m1() {
		System.out.println("m1 @BeforeSuite");
        }

@AfterSuite
		public void m2() {
			System.out.println("m2 @AfterSuite");
            }

@BeforeClass
public void m3() {
	System.out.println("m3 @BeforeClass");
    }

@AfterClass
	public void m4() {
		System.out.println("m4 @AfterClass");
        }

@BeforeGroups
public void m5() {
	System.out.println("m5 @BeforeGroups");
    }

@AfterGroups
	public void m6() {
		System.out.println("m6 @AfterGroups");
        }

@BeforeTest
public void m7() {
	System.out.println("m7 @BeforeTest");
    }

@AfterTest
	public void m8() {
		System.out.println("m8  @AfterTest");
        }

@BeforeMethod
public void m9() {
	System.out.println("m9 @BeforeMethod");
    }

@AfterMethod
	public void m10() {
		System.out.println("m10 @AfterMethod");
        }


	@Test//always used to write your test cases
	public void m11() {
		System.out.println("m11 @Test");
		
	}
	
	//launch browser --- loin to system
	//check whether you are loin or not--->valid username and password can you login or not
	//@BeforeSuite--->launch Browser.
	//@BeforeTest : checkingloggedin or not and loggin in if it is not there
	//@Test--->valid username and password.can you login or not
	//@AfterSuite or @AfterTest
	//there is not codetion that if you have used @Before______ need not to be used@After____________

}
