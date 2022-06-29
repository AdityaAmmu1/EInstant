package MockNativeSystem;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoReveal {
	static WebDriver driver;
  @BeforeTest
  public void BeforeTest() throws InterruptedException {
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
public void celtic() throws FindFailed, InterruptedException, AWTException{
	  driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/section[2]/div/div/div/div[1]/div/div[2]/div/div/input")).sendKeys("celtic");
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
 	Pattern sound = new Pattern("C:\\Users\\pdf57170\\git\\EInstant\\EInstant\\Rgsimages\\MNS\\celtic\\sound1.png");
 	screen.wait(sound,40000);
 	screen.click(sound);
 	
// 	Pattern buy = new Pattern("C:\\Users\\pdf57170\\git\\EInstant\\EInstant\\Rgsimages\\MNS\\celtic\\buy2.png");
// 	screen.wait(buy,10000);
// 	screen.click(buy);
// 	Thread.sleep(5000);
// 	
// 	Pattern auto1 = new Pattern("C:\\Users\\pdf57170\\git\\EInstant\\EInstant\\Rgsimages\\MNS\\celtic\\Mns-Auto1.png");
// 	screen.wait(auto1,20000);
// 	screen.click(auto1);
// 	
// 	Pattern auto2 = new Pattern("C:\\Users\\pdf57170\\git\\EInstant\\EInstant\\Rgsimages\\MNS\\celtic\\Mns-Auto2.png");
// 	screen.wait(auto2,20000);
// 	screen.click(auto2);
 	Thread.sleep(2000);
 	driver.close();
 	driver.switchTo().window(parentID);
 	driver.navigate().refresh();
 	Thread.sleep(2000);
 	Robot robot = new Robot();
    //CTRL+T is pressed
 	robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_T);

    // CTRL+T is released
    robot.keyRelease(KeyEvent.VK_T);
    robot.keyRelease(KeyEvent.VK_CONTROL);

    
    //Switch focus to new tab
    Thread.sleep(4000);
    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
    
    Thread.sleep(2000);
 	driver.get("https://rgs-cust03-admin.lab.wagerworks.com/ng/#/newlogin");
 	driver.findElement(By.xpath("//*[@id=\"uname1\"]")).sendKeys("Santhis");
 	driver.findElement(By.xpath("//*[@id=\"pwd1\"]")).sendKeys("Test123$");
 	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]/span")).click();
 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 	driver.findElement(By.xpath("//*[@id=\"gamesInProgress\"]/span[2]")).click();
 	Thread.sleep(2000);
 	driver.findElement(By.xpath("//*[@id=\"ui-panel-2-content\"]/div/div[3]/search-condition-operator-section/div[1]/div[1]/p-dropdown/div/label")).click();
 	driver.findElement(By.xpath("//*[@id=\"ui-panel-2-content\"]/div/div[3]/search-condition-operator-section/div[1]/div[1]/p-dropdown/div/div[4]/div[1]/input")).sendKeys("Georgia Lottery"+Keys.ARROW_DOWN+Keys.ENTER);
 	WebElement ddown = driver.findElement(By.xpath("//*[@id=\"ui-panel-2-content\"]/div/div[3]/search-condition-operator-section/div[1]/div[2]/p-dropdown/div/label"));
 	ddown.click();
 	//driver.findElement(By.xpath("//*[@id=\"ui-panel-2-content\"]/div/div[3]/search-condition-operator-section/div[1]/div[2]/p-dropdown/div/div[4]/div[1]/input")).sendKeys("GA SIT2"+Keys.ENTER);
 	Select select = new Select(ddown);
 	select.selectByIndex(2);
 	driver.findElement(By.xpath("//*[@id=\"ui-panel-2-content\"]/div/div[3]/search-condition-operator-section/div[1]/div[2]/p-dropdown/div/div[4]/div[2]/ul/li/span")).click();
 	driver.findElement(By.xpath("//*[@id=\"ui-panel-2-content\"]/div/div[4]/button[2]/span")).click();
 	Thread.sleep(2000);
 	driver.findElement(By.cssSelector("#showResultDiv > div.pagination-table-div > div > p-table > div > div.ui-table-scrollable-wrapper.ng-star-inserted > div > div.ui-table-scrollable-body > table > tbody > tr > td:nth-child(1) > a")).click();
 	Thread.sleep(2000);
 	driver.findElement(By.className("//*[@id=\"showResultDiv\"]/div[2]/div/p-table/div/div[1]/div/div[2]/table/tbody/tr/td[5]/label")).click();
 	driver.findElement(By.xpath("//*[@id=\"showResultDiv\"]/div[1]/div[1]/button[1]/span")).click();
 	Thread.sleep(2000);
 	driver.findElement(By.xpath("/html/body/app-root/app-home-page/div/ul/li[2]/div[2]/app-games-inprogress/search-actions/div/p-dialog/div/div[3]/p-footer/button[2]/span")).click();
 	Thread.sleep(2000);
 	driver.findElement(By.xpath("/html/body/app-root/app-home-page/div/ul/li[2]/div[2]/app-games-inprogress/search-actions/div/p-dialog/div/div[3]/p-footer/button[2]/span")).click();
 	Thread.sleep(1000);
 	driver.switchTo().window(parentID);
	}
}
 	