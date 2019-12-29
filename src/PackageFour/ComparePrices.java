package PackageFour;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class ComparePrices {

	WebDriver driver;
	PackageThree.AmazonFlipkart amz;

	@BeforeClass
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhinavp1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test(priority = 1)
	public void amazoniphonesearch() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		amz = new PackageThree.AmazonFlipkart(driver);
		amz.amazoniphone("iPhonexr64 gb yellow");

	}

	@Test(priority = 2)
	public void flipkartphonesearch() throws InterruptedException

	{
		driver.get("https://www.flipkart.com/");
		amz = new PackageThree.AmazonFlipkart(driver);
		amz.flipkartiphone("iPhonexr64 gb yellow");
		amz.comparePrice();

	}

	 @AfterClass public void closebrowser() {
		 driver.quit();
	 }
	 

}
