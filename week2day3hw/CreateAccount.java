package week2day3hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 ChromeOptions opt = new ChromeOptions();
		 opt.addArguments("guest");
		 ChromeDriver driver = new ChromeDriver(opt);
		 driver.get("http://leaftaps.com/opentaps/.");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("democsr");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.className("crmsfa")).click();
		 Thread.sleep(4000);
		 String value1=driver.getTitle();
		System.out.println(value1);
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create Account")).click();
		Thread.sleep(3000);
	  driver.findElement(By.id("accountName")).sendKeys("Selenium_MayMonth10");
	  	 Thread.sleep(3000);
		 WebElement Industry = driver.findElement(By.name("industryEnumId"));
		 Select option1 = new Select(Industry);
		 option1.selectByValue("IND_SOFTWARE");
		 Thread.sleep(3000);
		 WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
		 Select option2 = new Select(Ownership);
		 option2.selectByVisibleText("S-Corporation");
		 Thread.sleep(3000);
		 WebElement Source = driver.findElement(By.name("dataSourceId"));
		 Select option3 = new Select(Source);
		 option3.selectByValue("LEAD_EMPLOYEE");
		 
		 
		 WebElement Marketing = driver.findElement(By.name("marketingCampaignId"));
		 Select option4 = new Select(Marketing);
		 option4.selectByIndex(6);
		 
		 WebElement State = driver.findElement(By.name("generalStateProvinceGeoId"));
		 Select option5 = new Select(State);
		 option5.selectByValue("TX");
		Thread.sleep(3000);
		 driver.findElement(By.className("smallSubmit")).click();
		 Thread.sleep(6000);
		 String AccountName=driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/span[1]")).getText();
		//String AccountName =driver.findElement(By.xpath("//span[@id='ext-gen1092']")).getText();
		
		 if (AccountName.contains("Selenium"))
			{
			System.out.println("The Account name matches");	
			}
			driver.close();
	}

	
}
