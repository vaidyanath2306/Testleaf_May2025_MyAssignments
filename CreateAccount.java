package week2day2hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
		 driver.findElement(By.id("accountName")).sendKeys("Selenium_MayMonth");
		 Thread.sleep(3000);
		 driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		 driver.findElement(By.id("numberEmployees")).sendKeys("45");
		 driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		 driver.findElement(By.className("smallSubmit")).click();
		 Thread.sleep(4000);
		String Title1= driver.getTitle();
		System.out.println(Title1);
		driver.close();
	}

}
