package MockNativeSystem;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Recon {
	static WebDriver driver;
	static String filePath = "Rgsimages";
	static File file = new File(filePath);
	static String absPath = file.getAbsolutePath();
  @BeforeTest
  public void BeforeTest() throws InterruptedException {
	  	WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("http://mns-ps02.lab.wagerworks.com:8080/MNS2/login.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("aditest1");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
		Thread.sleep(30000);
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
	public static void recon() throws InterruptedException, FindFailed, AWTException {
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions Options = new ChromeOptions();
	Options.setExperimentalOption( "excludeSwitches" , new String[] {"automation"});
	driver = new ChromeDriver(Options);
	driver.manage().window().maximize();
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
	Pattern sound = new Pattern(absPath+"\\MNS\\ruby\\sound1.png");
	screen.wait(sound,40000);
	screen.click(sound);
	
	Pattern buy = new Pattern(absPath+"\\MNS\\ruby\\buy2.png");
	screen.wait(buy,20000);
	screen.click(buy);
	Thread.sleep(5000);
	
	Pattern AutoReveal1 = new Pattern(absPath+"\\MNS\\ruby\\AutoReveal1.png");
	screen.wait(AutoReveal1,20000);
	screen.click(AutoReveal1);
	Thread.sleep(3000);
	
	Pattern AutoReveal2 = new Pattern(absPath+"\\MNS\\ruby\\AutoReveal2.png");
	screen.wait(AutoReveal2,20000);
	screen.click(AutoReveal2);
	Thread.sleep(2000);
	
	//driver.close();
	//Thread.sleep(3000);
	driver.switchTo().window(parentID); //switching back to Parent window
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
	Thread.sleep(5000);
	//Recon
	driver.findElement(By.xpath("//*[@id=\"sideMenuList\"]/div/div[6]/div[1]/a")).click();//operators
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"configureOperators\"]")).click();//configure operators
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"configure-view\"]/div[3]/p-table/div/div[1]/table/tbody/tr[3]/td[2]/span")).click();//GA SIT2
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"add-operator-view\"]/app-edit-operator/app-edit-skins-page/div[1]/span[1]/p-breadcrumb/div/ul/li[3]/a/span")).click();//ga lottery
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-9-label\"]")).click();//integration modes
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-9\"]/div/endpoint-intmodes-page/div/div[2]/p-table/div/div[1]/table/tbody/tr[3]/td[1]")).click();//mns-xt 
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@id=\"outcomeData\"]/div[2]/div/div[4]/div[2]/input")).sendKeys("a");//host name
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"outcomeData\"]/div[4]/div/div[3]/div[4]/div[3]/a")).click();//validate and heart beat
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-9\"]/div/endpoint-intmodes-page/edit-endpoint/div/p-dialog/div/div[3]/p-footer/button[1]/span")).click();//save endpoint
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"logout-menu\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/app-root/app-home-page/div/ul/li[2]/div[1]/div/div/p-menu/div/ul/li[4]/a/span")).click();//clear cache
	Thread.sleep(2000);
	
	}

}
