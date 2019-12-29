package PackageThree;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonFlipkart
{

	 WebDriver driver;
	 
		
	public AmazonFlipkart(WebDriver driver) {
		this.driver = driver;
	}
	
	 By searchbar=By.id("twotabsearchtextbox");
	 By searchicon=By.xpath("//input[@type='submit']");
	 By iphoneyellow=By.xpath("//a[contains(@href,'Yellow')]");
	 By priceamazon=By.xpath("//span[contains(text(),'47,900')]");
	 
	 By searchbarflipkart=By.xpath("//input[@class='LM6RPg']");
	 By searchiconflipkart=By.xpath("//button[@type='submit']");
	 By closealert=By.xpath("//button[@class='_2AkmmA _29YdH8']");
	 By priceflipkart=By.xpath("//div[contains(text(),'51,900')]");
	 
	 static String price;
	 static String price2;
	
	public void amazoniphone(String product) throws InterruptedException 
	{
	
		driver.findElement(searchbar).sendKeys(product);
		Thread.sleep(3000);
		driver.findElement(searchicon).click();
		Thread.sleep(3000);
		driver.findElement(iphoneyellow).click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
		price=driver.findElement(priceamazon).getText();
		System.out.println(price);
		
	}
	 
	public void flipkartiphone(String pass) throws InterruptedException
	{
		
		driver.findElement(closealert).click();
		Thread.sleep(3000);
		driver.findElement(searchbarflipkart).sendKeys(pass);
		Thread.sleep(3000);
		driver.findElement(searchiconflipkart).click();
		Thread.sleep(3000);
		price2=driver.findElement(priceflipkart).getText();
		System.out.println(price2);
	}
	 
	public void comparePrice()
	{
		try
		{
			int amazonPrice = Integer.parseInt(price.substring(1, price.length()).replace(".00", "").replace(",", "").trim());
			int flipkartPrice = Integer.parseInt(price2.substring(1, price2.length()).replace(".00", "").replace(",", "").trim());
			if(amazonPrice<flipkartPrice)
			{
				System.out.println("Amazon's Price is Less: "+amazonPrice);
			}
			else
			{
				System.out.println("Flipkart's Price is Less: "+flipkartPrice);
			}
		}
		catch(Exception e)
		{
//			System.out.println("Conversion Of String To Integer is Not Working Properly");
			e.printStackTrace();
		}
	}
}
	
