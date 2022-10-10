package variousConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class logingTest {
		
	static WebDriver driver;

	public static void main(String[]args) {
		
	launchBrowser();
	logingTest1();

	
	launchBrowser();
	NegLoginTest();
	tearDown();

	
	}
	

	public static void launchBrowser() {

//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Erick Barikdar\\june22_Selenium\\crm1\\driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();

//		clear cookies
		driver.manage().deleteAllCookies();
//		Go to URL
		driver.get("https://www.techfios.com/billing/?ng=admin/");

//		//maximize window
		driver.manage().window().maximize();
//		apply implicitly wait	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void logingTest1() {

//		identify user name and insert value
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

//		identify password and button and click

		driver.findElement(By.id("password")).sendKeys("abc123");

//		identify signing button and click
		driver.findElement(By.name("login")).click();
	}

	public static void NegLoginTest() {
		
//		identify user name and insert value
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		
//		identify password and button and click

		driver.findElement(By.id("password")).sendKeys("abc12345");
		
//		identify signing button and click
		driver.findElement(By.name("login")).click();
		
	}

	public static void tearDown() {
//		close browser
//        driver.close();
		
	}

}
