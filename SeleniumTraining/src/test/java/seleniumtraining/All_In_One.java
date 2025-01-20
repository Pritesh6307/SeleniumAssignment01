package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All_In_One {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Pritesh");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("Wagh");
		Thread.sleep(1000);
		driver.findElement(By.id("day")).sendKeys("8");
		Thread.sleep(1000);
		driver.findElement(By.id("month")).sendKeys("Aug");
		Thread.sleep(1000);
		driver.findElement(By.id("year")).sendKeys("1995");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("priteshwagh@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("pritesh@1234");
		Thread.sleep(1000);
		driver.findElement(By.name("websubmit")).click();

	}

}