package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {
	
	
	WebDriver driver;

	@Before
	public void launchBrowser() {


		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    driver.manage().deleteAllCookies();
	    driver.get("https://www.techfios.com/billing/?ng=admin/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void logingTest1() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
	}
	@Test
	public void NegLoginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc12345");
		driver.findElement(By.name("login")).click();
	}		

//	@After
	 public void tearDown() {
		 driver.close();
	}

}
