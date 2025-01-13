package assignmet01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D_InputText {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.findElement(By.name("firstname")).sendKeys("Pritesh");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("Wagh");

	}

}
