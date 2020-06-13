package Demo_TestNG.Demo_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {
	
public static WebDriver driver =null;
	
	static void launchBrowser(String sBrowser) {
	
		if(sBrowser.startsWith("ch")) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\schavalmane\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else
		{
			System.out.println("you have not given browser type correctly");
		}
		
		driver.manage().window().maximize();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		}
	
          static void quitBrowser()
          {
	           driver.quit();
          }
	
          
          
      static void loginTOBrowser(String sUserName, String sPassword) throws Exception {
    	
    	driver.get("https://qa-tekarch.firebaseapp.com/"); 
        	  
        WebDriverWait Wait = new WebDriverWait(driver,30);
		Wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email_field"))));
		
		
		//driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		driver.findElement(By.id("email_field")).sendKeys(sUserName);
		//driver.findElement(By.id("password_field")).sendKeys("admin123");
		driver.findElement(By.id("password_field")).sendKeys(sPassword);
		String sText=driver.findElement(By.xpath("//div[@id='login_div']/h3")).getText();
		System.out.println(sText);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Web login')]")).getText());

		driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]")).click();
		Wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"))));
			
	}
        static void waitForPageElementToVisible(WebElement eleToWait)  
        {
        WebDriverWait Wait = new WebDriverWait(BrowserUtility.driver,30);
     	Wait.until(ExpectedConditions.visibilityOf(eleToWait));
        }
	
}