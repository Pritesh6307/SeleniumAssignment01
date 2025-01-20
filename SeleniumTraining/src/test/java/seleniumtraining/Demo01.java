package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("first-name")).sendKeys("Tony");
		Thread.sleep(1000);
		driver.findElement(By.id("last-name")).sendKeys("Stark");
		Thread.sleep(1000);
		driver.findElement(By.id("postal-code")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(3000);
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
		driver1.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver1.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver1.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		driver1.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver1.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(1000);
		driver1.findElement(By.id("checkout")).click();
		Thread.sleep(1000);
		driver1.findElement(By.id("first-name")).sendKeys("Tony");
		Thread.sleep(1000);
		driver1.findElement(By.id("last-name")).sendKeys("Stark");
		Thread.sleep(1000);
		driver1.findElement(By.id("postal-code")).sendKeys("123456");
		Thread.sleep(1000);
		driver1.findElement(By.id("continue")).click();
		Thread.sleep(1000);
		driver1.findElement(By.id("finish")).click();
		Thread.sleep(1000);
		driver1.findElement(By.id("back-to-products")).click();

	}

}
