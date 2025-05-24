package week2day3hw;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		 opt.addArguments("guest");
		 ChromeDriver driver = new ChromeDriver(opt);
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		// driver.findElement(By.id("email")).sendKeys("test@testleaf.com");
		// driver.findElement(By.id("pass")).sendKeys("sample");
		 driver.findElement(By.linkText("Create new account")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.findElement(By.name("firstname")).sendKeys("Test1");
		 driver.findElement(By.name("lastname")).sendKeys("Test2");
		 driver.findElement(By.name("reg_email__")).sendKeys("Test@testleaf.com");
		 driver.findElement(By.id("password_step_input")).sendKeys("Sample");
		 Thread.sleep(3000);
		 WebElement day = driver.findElement(By.name("birthday_day"));
		 Select Day1 = new Select(day);
		 Day1.selectByVisibleText("23");
		 WebElement month = driver.findElement(By.name("birthday_month"));
		 Select Month1 = new Select(month);
		 Month1.selectByValue("6");
		 WebElement year = driver.findElement(By.name("birthday_year"));
		 Select Year1 = new Select(year);
		 Year1.selectByValue("1980");
		driver.findElement(By.xpath("//label[normalize-space()='Male']//input[@id='sex']")).click();
		 

	}

}
