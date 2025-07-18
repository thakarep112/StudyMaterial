package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utilities.ExcelReader;
import utilities.ExtentManager;
import utilities.UtilityClass;



public class BaseClass {

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\testdata.xlsx");
	public ExtentReports rep = ExtentManager.getExtRepInstance();
	public static ExtentTest test;
	
	
	@BeforeSuite
	public void setUp() throws IOException {	
		
		if(driver==null) {
			
		log.debug("Loading property files !!");
			
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
		config.load(fis);
		
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
		OR.load(fis);
		
		}
		
		if(config.getProperty("browserName").equals("chrome")) {
						
			driver = new ChromeDriver();
					
		}else if(config.getProperty("browserName").equals("firefox")) {
			
			driver = new FirefoxDriver();
			
		}else if(config.getProperty("browserName").equals("ie")) {
			
			driver = new InternetExplorerDriver();
		}
		
		log.debug("Navigating to testURL !!");
		
		driver.get(config.getProperty("testUrl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("impliciteWait"))));
		
	}
	
	// Method to verify actual & expected content from web page
	public void verifyEqualsSoftAssertions(String atual, String expected) throws IOException {
		
		try{
			
			Assert.assertEquals(atual, expected);
		
	}catch(Throwable t) {
		
		UtilityClass.captureScreenshot();
		
		// Extent Report
		test.log(Status.FAIL, " Verification failure : "+t.getMessage());
		test.addScreenCaptureFromPath(UtilityClass.screenshotName);
		
		// ReportNG Report
		Reporter.log("<br>"+"Verification failure: "+t.getMessage() +"<br>");
		Reporter.log("<a target=\"_blank\" href="+UtilityClass.screenshotName+"><img src="+UtilityClass.screenshotName+" height=200 width=200></img></a>");
		Reporter.log("<br>");
		Reporter.log("<br>");
		
	}
	}	
	
	public WebElement dropdown;
	// Method to select Drop down values
		public void selectDropdownValue(String locator, String value) {
			
			if(locator.contains("_CSS")) {
				dropdown = driver.findElement(By.cssSelector(OR.getProperty(locator)));
			}else if(locator.contains("_XPATH")) {
				dropdown = driver.findElement(By.xpath(OR.getProperty(locator)));
				}else if(locator.contains("_ID")) {
					dropdown = driver.findElement(By.id(OR.getProperty(locator)));
				   }else if(locator.contains("_CLASS")) {
					   dropdown = driver.findElement(By.className(OR.getProperty(locator)));
				                         }
			Select select = new Select(dropdown);
			select.selectByVisibleText(value);
			
			test.log(Status.INFO, "Selecting "+value +" from dropdown :" +locator);
			
		}
	
	// Method to check presence of WebElement
	public boolean isElementPresent(By by) {
		
		try {
			driver.findElement(by);
			return true;
			
		}catch(NoSuchElementException e){
			
			return false;
			
		}
		
	}
	
	// Method to click on WebElement
	public void clickWebElement(String locator) {
		
		if(locator.contains("_CSS")) {
		driver.findElement(By.cssSelector(OR.getProperty(locator))).click();
		}else if(locator.contains("_XPATH")) {
			driver.findElement(By.xpath(OR.getProperty(locator))).click();
			}else if(locator.contains("_ID")) {
				driver.findElement(By.id(OR.getProperty(locator))).click();
			   }else if(locator.contains("_CLASS")) {
				driver.findElement(By.className(OR.getProperty(locator))).click();
			                         }
		
		test.log(Status.INFO, "Clicking on: "+locator);
		
	}
	
	// Method to type in the WebElement
	public void typeIntoWebElement(String locator, String value) {
		
		if(locator.contains("_CSS")) {
			driver.findElement(By.cssSelector(OR.getProperty(locator))).sendKeys(value);
			}else if(locator.contains("_XPATH")) {
				driver.findElement(By.xpath(OR.getProperty(locator))).sendKeys(value);
				}else if(locator.contains("_ID")) {
					driver.findElement(By.id(OR.getProperty(locator))).sendKeys(value);
				}else if(locator.contains("_CLASS")) {
					driver.findElement(By.className(OR.getProperty(locator))).sendKeys(value);
				}
		
		test.log(Status.INFO, "Clicking on: "+locator+" & Typing value: "+value);
		
	}
	
	
	@AfterSuite
	public void tearDown() {
		
		log.debug("Quitting driver !!");
		
		if(driver!=null) {
		driver.quit();
		}
		
		log.debug("Suite execution is completed !!");
		
	}
	
}
