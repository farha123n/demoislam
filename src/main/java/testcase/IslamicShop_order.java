
package testcase;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.DriverSetup;

public class IslamicShop_order extends DriverSetup{
	
	String baseUrl="https://www.islamicshopdk.com/";

	
	@Test
	public void  IslamicShop_order() throws InterruptedException 
	{
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@aria-label='আত্মার ব্যাধি গীবত']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://www.islamicshopdk.com/checkout/']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='billing_first_name']")).sendKeys("farhan");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='billing_address_1']")).sendKeys("27 no mc roy lane");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='billing_phone']")).sendKeys("01788074113");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='billing_email']")).sendKeys("nil26566@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@role='presentation']")).click();
	    Boolean display=driver.findElement(By.xpath("//li[@id='select2-billing_state-result-1cxd-BD-05']")).isDisplayed();
	    if(display)
	    {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 By option=By.xpath("//li[@id='select2-billing_state-result-1cxd-BD-05']");
		 wait.until(ExpectedConditions.elementToBeClickable(option));
	   
	    driver.findElement(option).click();
	    Thread.sleep(2000);
	    }	
	}
}