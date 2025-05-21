package week2day2hw;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

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
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vaidhy");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("EQ");
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr.");
		 driver.findElement(By.className("smallSubmit")).click();
		 Thread.sleep(4000);
		String Title1= driver.getTitle();
		System.out.println(Title1);
		driver.close();
		
	}

}
