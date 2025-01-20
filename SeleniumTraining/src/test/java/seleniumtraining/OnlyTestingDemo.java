package seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OnlyTestingDemo {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://only-testing-blog.blogspot.com/");
		driver.findElement(By.name("gparent1")).sendKeys("Pandu");
		driver.findElement(By.name("parent1")).sendKeys("Arjun");
		driver.findElement(By.name("child1")).sendKeys("Abhimanyu");
		WebElement web = driver.findElement(By.xpath("//input[@type='checkbox']"));
	}

}
