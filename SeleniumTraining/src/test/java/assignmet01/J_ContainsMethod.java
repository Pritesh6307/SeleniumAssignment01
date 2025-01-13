package assignmet01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J_ContainsMethod {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://signup.heroku.com/login");
		driver.findElement(By.xpath("//input[contains(@id,'company')]")).sendKeys("ABC Pvt Ltd");

	}

}
