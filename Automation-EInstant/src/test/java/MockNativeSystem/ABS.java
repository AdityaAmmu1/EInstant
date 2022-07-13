package MockNativeSystem;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ABS {
	static WebDriver driver;
	static String filePath = "Rgsimages";
	static File file = new File(filePath);
	static String absPath = file.getAbsolutePath();
	//System.out.println(absPath1);
	public static void main(String[] args) throws IOException, FindFailed {
	
//		String filePath = "Rgsimages";
//		File file = new File(filePath);
//		String absPath = file.getAbsolutePath();
		System.out.println(absPath);
     
//		String localDir = System.getProperty("user.dir");
//		File file1 = new File(localDir);
//		String absPath1 = file1.getCanonicalPath();
//		System.out.println(absPath1);
     
	  	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mns-ps02.lab.wagerworks.com:8080/MNS2/login.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("aditest1");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		Screen screen = new Screen();
		Pattern pattern = new Pattern(absPath+"//screenshot.png");
		screen.click(pattern);
	}
}
