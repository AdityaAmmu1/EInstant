package MockNativeSystem;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class example{
	static WebDriver driver;
	@org.testng.annotations.BeforeTest
	public void BeforeTest() throws InterruptedException{
		  System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://mns-ps02.lab.wagerworks.com:8080/MNS2/login.html");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("aditest1");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
			Thread.sleep(30000);
			driver.findElement(By.cssSelector("#ixfInstantWin > div > div.inner > h3")).click();// click on ixf Instant win tag
			Thread.sleep(15000);
			driver.findElement(By.xpath("//*[@id=\"resources\"]/form/div/div[1]/div/span/span[1]/span/span[2]")).click();// Click on drop down RGS server 
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("RGS-CUST03" +Keys.ENTER);// enter server name
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"resources\"]/form/div/div[2]/div/span/span[1]/span/span[2]")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("GALT" +Keys.ENTER);
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"resources\"]/form/div/div[3]/div/span/span[1]/span/span[2]")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("GG02" +Keys.ENTER);
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"skbEInstant_player\"]")).sendKeys("aditest1" +Keys.ENTER);
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"skbEInstant_password\"]")).sendKeys("123456" +Keys.ENTER);
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"resources\"]/form/div/div[6]/div/span/span[1]/span/span[2]")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("USD" +Keys.ENTER);
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"resources\"]/form/div/div[7]/div/span/span[1]/span/span[2]")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("GB" +Keys.ENTER);
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
		  driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/section[2]/div/div/div/div[1]/div/div[2]/div/div/input")).sendKeys("ruby");
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
	   	Pattern sound = new Pattern("EInstant\\RgsImages\\MNS\\ruby\\sound1.png");
	   	screen.wait(sound,40000);
	   	screen.click(sound);
	   	
	   	Pattern buy = new Pattern("EInstant\\RgsImages\\MNS\\ruby\\buy2.png");
	   	screen.wait(buy,20000);
	   	screen.click(buy);
	   	
	   	Pattern revealAll = new Pattern("EInstant\\RgsImages\\MNS\\ruby\\revealAll3.png");
	   	screen.wait(revealAll,20000);
	   	screen.click(revealAll);
	   	Thread.sleep(10000);
	   	
	   	Pattern playAgain4 = new Pattern("EInstant\\RgsImages\\MNS\\ruby\\playAgain4.png");
	   	screen.wait(playAgain4,20000);
	   	screen.click(playAgain4);
	   	
	   	driver.close();
	   	driver.switchTo().window(parentID); //switching back to Parent window
	   	driver.navigate().refresh();
	  }
}
