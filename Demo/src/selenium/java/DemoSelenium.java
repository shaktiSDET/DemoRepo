package selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSelenium {

	public static void main(String[] args) throws InterruptedException {
		String s="s";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hasher\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("guide-icon")).click();
	}

}
