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
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MockNativeSystem {
	static WebDriver driver;
  @org.testng.annotations.BeforeTest
  public void BeforeTest() throws InterruptedException{
	  	//System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
	  	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mns-ps02.lab.wagerworks.com:8080/MNS2/login.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("aditest1");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
		Thread.sleep(25000);
		driver.findElement(By.xpath("//*[@id=\"ixfInstantWin\"]/div/div[1]/h3")).click();// click on ixf Instant win tag
		Thread.sleep(10000);
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
   	Pattern sound = new Pattern("Rgsimages\\MNS\\ruby\\sound1.png");
   	screen.wait(sound,40000);
   	screen.click(sound);
   	
   	Pattern buy = new Pattern("Rgsimages\\MNS\\ruby\\buy2.png");
   	screen.wait(buy,20000);
   	screen.click(buy);
   	
   	Pattern revealAll = new Pattern("Rgsimages\\MNS\\ruby\\revealAll3.png");
   	screen.wait(revealAll,20000);
   	screen.click(revealAll);
   	Thread.sleep(10000);
   	
   	Pattern playAgain4 = new Pattern("Rgsimages\\MNS\\ruby\\playAgain4.png");
   	screen.wait(playAgain4,20000);
   	screen.click(playAgain4);
   	
   	driver.close();
   	driver.switchTo().window(parentID); //switching back to Parent window
   	driver.navigate().refresh();
  }
 
  @Test
  public void CelticClouds() throws FindFailed, InterruptedException {
	  driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/section[2]/div/div/div/div[1]/div/div[2]/div/div/input")).sendKeys("Celtic");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"skb-gamelist-wrapper\"]/div[1]/table/tbody/tr[1]/td[4]/table/tbody/tr[3]/td[2]/a[2]")).click();
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
     	Pattern sound = new Pattern("Rgsimages\\MNS\\celtic\\sound1.png");
     	screen.wait(sound,40000);
     	screen.click(sound);
     	
     	Pattern buy = new Pattern("Rgsimages\\MNS\\celtic\\buy2.png");
     	screen.wait(buy,40000);
     	screen.click(buy);
     	
     	Pattern revealAll = new Pattern("Rgsimages\\MNS\\celtic\\revealAll3.png");
     	screen.wait(revealAll,20000);
     	screen.click(revealAll);
     	
     	Pattern playAgain4 = new Pattern("Rgsimages\\MNS\\celtic\\playAgain4.png");
     	screen.wait(playAgain4,20000);
     	screen.click(playAgain4);
     	
     	driver.close();
     	driver.switchTo().window(parentID); //switching back to Parent window
       	driver.navigate().refresh();
  }
  
  @Test
  public void Lucky() throws FindFailed, InterruptedException{
	  driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/section[2]/div/div/div/div[1]/div/div[2]/div/div/input")).sendKeys("lucky");
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
   	Pattern sound = new Pattern("Rgsimages\\MNS\\Luckys\\audio1.png");
   	screen.wait(sound,40000);
   	screen.click(sound);
   	
   	Pattern buy = new Pattern("Rgsimages\\MNS\\Luckys\\buy1.png");
   	screen.wait(buy,20000);
   	screen.click(buy);
   	Thread.sleep(3000);
   	
   	Pattern revealAll = new Pattern("Rgsimages\\MNS\\Luckys\\revealAll2.png");
   	screen.wait(revealAll,20000);
   	screen.click(revealAll);
   	Thread.sleep(2000);
   	
   	Pattern playAgain4 = new Pattern("Rgsimages\\MNS\\Luckys\\playAgain3.png");
   	screen.wait(playAgain4,20000);
   	driver.close();
   	driver.switchTo().window(parentID); //switching back to Parent window
   	driver.navigate().refresh();
  }
  
  @Test
  public void BallooniesSwapAndPopCOM() throws FindFailed, InterruptedException{
	  driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/section[2]/div/div/div/div[1]/div/div[2]/div/div/input")).sendKeys("Balloonies Swap And Pop COM");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"skb-gamelist-wrapper\"]/div[1]/table/tbody/tr[1]/td[4]/table/tbody/tr[3]/td[2]/a[2]")).click();
    
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
   	Pattern sound = new Pattern("Rgsimages\\MNS\\BallooniesSwapAndPopCOM\\sound1.png");
   	screen.wait(sound,40000);
   	screen.click(sound);
   	
   	Pattern ok = new Pattern("Rgsimages\\MNS\\BallooniesSwapAndPopCOM\\ok2.png");
   	screen.wait(ok,20000);
   	screen.click(ok);
   	Thread.sleep(3000);
   	
   	Pattern buy = new Pattern("Rgsimages\\MNS\\BallooniesSwapAndPopCOM\\buy3.png");
   	screen.wait(buy,20000);
   	screen.click(buy);
   	Thread.sleep(10000);
   	
   	Pattern revealAll = new Pattern("Rgsimages\\MNS\\BallooniesSwapAndPopCOM\\revealAll4.png");
   	screen.wait(revealAll,20000);
   	screen.click(revealAll);
   	
   	Pattern playAgain4 = new Pattern("Rgsimages\\MNS\\BallooniesSwapAndPopCOM\\playAgain5.png");
   	screen.wait(playAgain4,200000);
   	driver.close();
   	driver.switchTo().window(parentID); //switching back to Parent window
   	driver.navigate().refresh();

  }
	@AfterTest()
	public static void closeWindow() {
		driver.close();
	}
}

