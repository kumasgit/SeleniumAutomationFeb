package hrmApp;

//Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class LoginTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {

		
		
		//System.setProperty("", "");)
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Act\\Downloads\\chromedriver_win32_110\\chromedriver.exe");
		
		
		//Scenario
		//driver -v110
		//chromebrowser ----v110
		
		
		//browser updated -----v119
		//download chrome driver 119  ----- manual effort
		
		//resolve driver issue ----- auto download driver
		
		
		//app1
		//WebDriverMaanager --- v5+0
		driver = WebDriverManager.chromedriver().create();
		
		
		//app2
		//WebDriverManger  -----4.4.3
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		
		
		
		
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void test1() throws Exception {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");			//invoke API 

		//specific api --- invoke 
		//endPpoint ---
		
		//REST API ------ get/post/put/delete etc....
		Thread.sleep(5500);
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.cssSelector(".oxd-button")).click();
		Thread.sleep(5500);
	}
}