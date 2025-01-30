package assignment01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class O_LaunchingBrowsers {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.firefoxdriver();
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new EdgeDriver();
		WebDriver driver2 = new FirefoxDriver();

	}

}