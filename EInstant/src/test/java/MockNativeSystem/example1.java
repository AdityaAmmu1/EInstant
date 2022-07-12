package MockNativeSystem;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import com.util.JiraPolicy;
import io.github.bonigarcia.wdm.WebDriverManager;

public class example1{
	static WebDriver driver;
	static String filePath = "Rgsimages";
	static File file = new File(filePath);
	static String absPath = file.getAbsolutePath();
	
	@org.testng.annotations.BeforeTest
	public void BeforeTest() throws InterruptedException{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("http://mns-ps02.lab.wagerworks.com:8080/MNS2/login.html");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("0012");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345");
			driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
			Thread.sleep(30000);
			driver.findElement(By.cssSelector("#ixfInstantWin > div > div.inner > h3")).click();// click on ixf Instant win tag
			Thread.sleep(15000);
			driver.findElement(By.xpath("//*[@id=\"resources\"]/form/div/div[1]/div/span/span[1]/span/span[2]")).click();// Click on drop down RGS server 
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("RGS-CUST05" +Keys.ENTER);// enter server name
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"resources\"]/form/div/div[2]/div/span/span[1]/span/span[2]")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("PSo1" +Keys.ENTER);
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"resources\"]/form/div/div[3]/div/span/span[1]/span/span[2]")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Demo" +Keys.ENTER);
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"skbEInstant_player\"]")).sendKeys("kam" +Keys.ENTER);
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"skbEInstant_password\"]")).sendKeys("12345" +Keys.ENTER);
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"resources\"]/form/div/div[6]/div/span/span[1]/span/span[2]")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("USD" +Keys.ENTER);
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"resources\"]/form/div/div[7]/div/span/span[1]/span/span[2]")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("US" +Keys.ENTER);
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"resources\"]/form/div/div[8]/div/span/span[1]/span/span[2]")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("en" +Keys.ENTER,Keys.TAB);
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"resources\"]/form/div/div[9]/div[1]/button")).click();
		    Thread.sleep(5000);
	  }
	 
	@Test
	 public void Ruby() throws FindFailed, InterruptedException{
		  driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/section[2]/div/div/div/div[1]/div/div[2]/div/div/input")).sendKeys("sdgzd");
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"skb-gamelist-wrapper\"]/div[1]/table/tbody/tr/td[4]/table/tbody/tr[3]/td[2]/a[2]")).click();
		   
		  Set<String> ids = driver.getWindowHandles();
		    Iterator<String> i = ids.iterator();
		    String parentID = i.next(); //Parent Window
		    while(i.hasNext())
		    {
		        String childID = i.next(); //Child Windows
		        driver.switchTo().window(childID); // Iterating over child windows
		    }
		    driver.manage().window().maximize();
		Screen screen = new Screen();
	   	Pattern sound = new Pattern(absPath+"\\MNS\\colorcubes\\audio.png");
	   	screen.wait(sound,40000);
	   	screen.click(sound);
	   	
	   	Pattern close = new Pattern(absPath+"\\MNS\\colorcubes\\close.png");
	   	screen.wait(close,40000);
	   	screen.click(close);
	   	  	
	   	Pattern inc = new Pattern(absPath+"\\MNS\\colorcubes\\increase.png");
	   	screen.wait(inc,20000);
	   	screen.click(inc);
	   	
	   	Pattern buy = new Pattern(absPath+"\\MNS\\colorcubes\\buy.png");
	   	screen.wait(buy,20000);
	   	screen.click(buy);
	   		   	
	   	Pattern revealall = new Pattern(absPath+"\\MNS\\colorcubes\\autoreveal.png");
	   	screen.wait(revealall,20000);
	   	screen.click(revealall);
	   	Thread.sleep(40000);
	   	
	   	driver.close();
	   	driver.switchTo().window(parentID); //switching back to Parent window
	   	driver.navigate().refresh();
	   	
	  }
}
