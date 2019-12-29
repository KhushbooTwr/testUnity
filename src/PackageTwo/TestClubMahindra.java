package PackageTwo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import PackageOne.TripAvisor;

public class TestClubMahindra {


	WebDriver driver;
	TripAvisor amz;

	@BeforeClass
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhinavp1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	
	@Test(priority = 1)
	public void amazoniphonesearch() throws InterruptedException {
		driver.get("https://www.tripadvisor.in/");
		amz = new TripAvisor(driver);
		amz.clubmahindra("Club Mahindra");
        
	
	
	
}
}