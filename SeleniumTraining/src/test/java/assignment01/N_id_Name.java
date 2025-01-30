package assignment01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class N_id_Name {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("pritesh@gmail.com");
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.findElement(By.name("firstname")).sendKeys("Pritesh");
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Already have an account?")).click();
		driver.findElement(By.partialLinkText("Already have an")).click();
	}

}
