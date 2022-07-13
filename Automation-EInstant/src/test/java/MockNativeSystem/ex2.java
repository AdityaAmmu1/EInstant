package MockNativeSystem;

import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex2 {
	WebDriver driver;
  @Test
  public void f() throws URISyntaxException, FindFailed {
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mns-ps02.lab.wagerworks.com:8080/MNS2/login.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("aditest1");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		Screen screen = new Screen();
		Pattern pattern = new Pattern("screenshot.png");
		screen.click(pattern);
		
  }
}
