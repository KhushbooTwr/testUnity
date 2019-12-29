package PackageOne;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TripAvisor {

	
	WebDriver driver;
	 
	
	public TripAvisor(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchoption=By.xpath("//div[@title='Search']");
	By mainsearch=By.id("mainSearch");
	By searchbutton=By.id("SEARCH_BUTTON");
	By searchList = By.xpath("//div[@class='ui_column is-9-desktop is-8-mobile is-9-tablet content-block-column']");
	By reviewUrl = By.xpath("//a[text()='Write a review']");
	
	
	public void clubmahindra(String product) throws InterruptedException {
	
		driver.findElement(searchoption).click();
		Thread.sleep(3000);
		driver.findElement(mainsearch).click();
		driver.findElement(mainsearch).sendKeys(product);
		Thread.sleep(2000);
		driver.findElement(searchbutton).click();
	}
	public void clickFirstOptionOfSearch(int option)
	{
		List<WebElement> optionList = new ArrayList<WebElement>();
		optionList = driver.findElements(searchList);
		optionList.get(option).click();
	}
	public void clickOnReview() throws InterruptedException
	{
		driver.findElement(reviewUrl).click();
		Thread.sleep(5000);
	}
}
