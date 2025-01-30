package assignment01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H_RetrieveText {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://signup.heroku.com/login");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("xyz@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("xyz@gmail.com");

	}

}
