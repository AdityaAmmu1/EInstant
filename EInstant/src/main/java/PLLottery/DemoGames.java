package PLLottery;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;

public class DemoGames {
	public static WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void beforeMethod(String browser) throws InterruptedException, FindFailed {
		switch(browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			String addproxy = "http://hybrid-web.cluster-a.blackspider.com";
			Proxy proxy = new Proxy();
			proxy.setHttpProxy(addproxy);//http
			proxy.setSslProxy(addproxy);//secure socket layer
			chromeOptions.setCapability("proxy", proxy);
			driver = new ChromeDriver(chromeOptions);
			break;
			
		case "ie":
			WebDriverManager.edgedriver().setup();
			  EdgeOptions edgeOptions = new EdgeOptions();
			  String addproxy1 = " http://hybrid-web.cluster-a.blackspider.com";
			  Proxy proxy1 = new Proxy();
			  proxy1.setHttpProxy(addproxy1);//http
			  proxy1.setSslProxy(addproxy1);//secure socket layer
			  edgeOptions.setCapability("proxy", proxy1);
			  driver = new EdgeDriver(edgeOptions);
			break;
			
		case"firefox":
			System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
		driver.manage().window().maximize();	
		   driver.get("https://staging.devlotto.pl/");
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[3]/div[2]/div[3]/div/button")).click();
//			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/div/div[2]/button")).click();
//			//entering uid
//			driver.findElement(By.xpath("//*[@id=\"username-dropdown-login\"]")).sendKeys("gierka001");
//			//entering password
//			driver.findElement(By.xpath("//*[@id=\"password-dropdown-login\"]")).sendKeys("Welcome1");
//			System.out.println("login button");
//			Screen screen1 = new Screen();
//			Pattern submit = new Pattern("Rgsimages\\PolandGames\\submit.png");
//			  screen1.wait(submit,40000); 
//			  screen1.click(submit);
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[4]/div/div[1]/div/div/div[2]/div[2]/button")).click();
		
		}
	@Test()
	  public void Diamond() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("Rgsimages\\PolandGames\\diamond\\image1.png");
//			  screen.wait(diamond,40000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[7]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("Rgsimages\\PolandGames\\diamond\\demo2.png");
			  screen.wait(demo,40000); 
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("Rgsimages\\PolandGames\\diamond\\volume3.png");
			  screen.wait(volume,40000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("Rgsimages\\PolandGames\\diamond\\ok4.png");
			  screen.wait(ok,40000);
			  screen.click(ok);
			  
			  Pattern demo1 = new Pattern("Rgsimages\\PolandGames\\diamond\\demo5.png");
			  screen.wait(demo1,40000);
			  screen.click(demo1);
			  
			  Pattern auto = new Pattern("Rgsimages\\PolandGames\\diamond\\auto6,11.png");
			  screen.wait(auto,40000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern moneyplay = new Pattern("Rgsimages\\PolandGames\\diamond\\moneyplay8.png");
			  screen.wait(moneyplay,4000);
			  screen.click(moneyplay);
			  
			  Pattern home = new Pattern("Rgsimages\\PolandGames\\diamond\\home7.png");
			  screen.wait(home,40000);
			  screen.click(home);
	  }
	 @Test()
	  public void Egypt() throws FindFailed, InterruptedException {
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
		  Thread.sleep(5000);
		  
		  Screen screen = new Screen();
//		  Pattern diamond = new Pattern("Rgsimages\\PolandGames\\Egypt\\image1.png");
//		  screen.wait(diamond,40000);
//		  screen.click(diamond);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[12]/img")).click();
		  
		  Thread.sleep(15000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,600)", "");
		  
		  Pattern demo = new Pattern("Rgsimages\\PolandGames\\Egypt\\demo2.png");
		  screen.wait(demo,40000); 
		  screen.click(demo);
		  
		  Pattern volume = new Pattern("Rgsimages\\PolandGames\\Egypt\\sound3.png");
		  screen.wait(volume,40000);
		  screen.click(volume);
		  
		  Pattern ok = new Pattern("Rgsimages\\PolandGames\\Egypt\\ok4.png");
		  screen.wait(ok,40000);
		  screen.click(ok);
		  
		  Pattern demo1 = new Pattern("Rgsimages\\PolandGames\\Egypt\\demo5.png");
		  screen.wait(demo1,40000);
		  screen.click(demo1);
		  
		  Pattern auto = new Pattern("Rgsimages\\PolandGames\\Egypt\\auto6.png");
		  screen.wait(auto,40000);
		  screen.click(auto);
		  Thread.sleep(3000);
		  
		  Pattern tryAgain = new Pattern("Rgsimages\\PolandGames\\Egypt\\demo7.png");
		  screen.wait(tryAgain,40000);
		  Thread.sleep(2000);
		  
		  Pattern home = new Pattern("Rgsimages\\PolandGames\\Egypt\\home8.png");
		  screen.wait(home,40000);
		  screen.click(home);
	}
	  @Test()
	  public void goldRush() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("Rgsimages\\PolandGames\\goldRush\\image1.png");
//			  screen.wait(diamond,40000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[5]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("Rgsimages\\PolandGames\\goldRush\\demo2.png");
			  screen.wait(demo,40000); 
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("Rgsimages\\PolandGames\\goldRush\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("Rgsimages\\PolandGames\\goldRush\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern demo1 = new Pattern("Rgsimages\\PolandGames\\goldRush\\demo5.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  
			  Pattern auto = new Pattern("Rgsimages\\PolandGames\\goldRush\\auto6.png");
			  screen.wait(auto,5000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern tryAgain = new Pattern("Rgsimages\\PolandGames\\goldRush\\demo7.png");
			  screen.wait(tryAgain,40000);
			  
			  Pattern home = new Pattern("Rgsimages\\PolandGames\\goldRush\\home8.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void Card5() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("Rgsimages\\PolandGames\\5card\\image1.png");
//			  screen.wait(diamond,5000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[8]/img")).click();

			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("Rgsimages\\PolandGames\\5card\\demo2.png");
			  screen.wait(demo,40000); 
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("Rgsimages\\PolandGames\\5card\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("Rgsimages\\PolandGames\\5card\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern demo1 = new Pattern("Rgsimages\\PolandGames\\5card\\demo5.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern("Rgsimages\\PolandGames\\5card\\auto6.png");
			  screen.wait(auto,5000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern tryAgain = new Pattern("Rgsimages\\PolandGames\\5card\\demo7.png");
			  screen.wait(tryAgain,40000);
			  
			  Pattern home = new Pattern("Rgsimages\\PolandGames\\5card\\home8.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void ChristmasBalls() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("Rgsimages\\PolandGames\\Christmas balls\\image1.png");
			  screen.wait(diamond,5000);
			  screen.click(diamond);
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("Rgsimages\\PolandGames\\Christmas balls\\demo2.png");
			  screen.wait(demo,40000); 
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("Rgsimages\\PolandGames\\Christmas balls\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("Rgsimages\\PolandGames\\Christmas balls\\ok4.png");
			  screen.wait(ok,40000); 
			  screen.click(ok);
			  
			  Pattern demo1 = new Pattern("Rgsimages\\PolandGames\\Christmas balls\\demo5.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern("Rgsimages\\PolandGames\\Christmas balls\\auto6.png");
			  screen.wait(auto,5000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern tryAgain = new Pattern("Rgsimages\\PolandGames\\Christmas balls\\demo7.png");
			  screen.wait(tryAgain,40000);
			  
			  Pattern home = new Pattern("Rgsimages\\PolandGames\\Christmas balls\\home8.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  
	  @Test()
	  public void Cyferki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("Rgsimages\\PolandGames\\Cyferki\\image1.png");
//			  screen.wait(diamond,5000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[10]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("Rgsimages\\PolandGames\\Cyferki\\demo2.png");
			  screen.wait(demo,5000); 
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("Rgsimages\\PolandGames\\Cyferki\\sound3.png");
			  screen.wait(volume,40000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("Rgsimages\\PolandGames\\Cyferki\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern demo1 = new Pattern("Rgsimages\\PolandGames\\Cyferki\\demo5.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern("Rgsimages\\PolandGames\\Cyferki\\try6.png");
			  screen.wait(auto,40000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern start = new Pattern("Rgsimages\\PolandGames\\Cyferki\\start7.png");
			  screen.wait(start,40000);
			  screen.click(start);
			  Thread.sleep(3000);
			  
			  Pattern tryAgain = new Pattern("Rgsimages\\PolandGames\\Cyferki\\try8.png");
			  screen.wait(tryAgain,40000);
			  
			  Pattern home = new Pattern("Rgsimages\\PolandGames\\Cyferki\\home9.png");
			  screen.wait(home,40000);
			  screen.click(home);
	  }
	  
	  @Test()
	  public void Antyki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("Rgsimages\\PolandGames\\Antyki\\image1.png");
//			  screen.wait(diamond,40000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[11]/img")).click();

			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("Rgsimages\\PolandGames\\Antyki\\demo2.png");
			  screen.wait(demo,5000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("Rgsimages\\PolandGames\\Antyki\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern demo1 = new Pattern("Rgsimages\\PolandGames\\Antyki\\demo4.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern("Rgsimages\\PolandGames\\Antyki\\auto5.png");
			  screen.wait(auto,5000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern demo2 = new Pattern("Rgsimages\\PolandGames\\Antyki\\demo6.png");
			  screen.wait(demo2,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern("Rgsimages\\PolandGames\\Antyki\\home7.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void triplePlatinum() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("Rgsimages\\PolandGames\\Duszki\\image1.png");
//			  screen.wait(diamond,5000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[15]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("Rgsimages\\PolandGames\\Duszki\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("Rgsimages\\PolandGames\\Duszki\\sound3.png");
			  screen.wait(volume,40000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("Rgsimages\\PolandGames\\Duszki\\ok4.png");
			  screen.wait(ok,40000);
			  screen.click(ok);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern("Rgsimages\\PolandGames\\Duszki\\demo5.png");
			  screen.wait(demo1,40000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern auto = new Pattern("Rgsimages\\PolandGames\\Duszki\\auto6.png");
			  screen.wait(auto,40000);
			  Thread.sleep(3000);
			  screen.click();
			  
			  Pattern demo2 = new Pattern("Rgsimages\\PolandGames\\Duszki\\demo7.png");
			  screen.wait(demo2,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern("Rgsimages\\PolandGames\\Duszki\\home8.png");
			  screen.wait(home,40000);
			  screen.click(home);
	  }
	  @Test()
	  public void Duszki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("Rgsimages\\PolandGames\\TriplePlatinum\\image1.png");
//			  screen.wait(diamond,5000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[13]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("Rgsimages\\PolandGames\\TriplePlatinum\\demo2.png");
			  screen.wait(demo,5000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("Rgsimages\\PolandGames\\TriplePlatinum\\sound3.png");
			  screen.wait(volume,40000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("Rgsimages\\PolandGames\\TriplePlatinum\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern("Rgsimages\\PolandGames\\TriplePlatinum\\demo5.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern auto = new Pattern("Rgsimages\\PolandGames\\TriplePlatinum\\auto6.png");
			  screen.wait(auto,40000);
			  Thread.sleep(3000);
			  screen.click();
			  
			  Pattern demo2 = new Pattern("Rgsimages\\PolandGames\\TriplePlatinum\\demo7.png");
			  screen.wait(demo2,5000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern("Rgsimages\\PolandGames\\TriplePlatinum\\home8.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void Garniec() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("Rgsimages\\PolandGames\\GarniecZÅ‚ota\\image1.png");
//			  screen.wait(diamond,5000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[14]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("Rgsimages\\PolandGames\\GarniecZÅ‚ota\\demo2.png");
			  screen.wait(demo,5000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("Rgsimages\\PolandGames\\GarniecZÅ‚ota\\sound3.png");
			  screen.wait(volume,40000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern start = new Pattern("Rgsimages\\PolandGames\\GarniecZÅ‚ota\\start3.png");
			  screen.wait(start,5000);
			  screen.click(start);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern("Rgsimages\\PolandGames\\GarniecZÅ‚ota\\demo4.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern auto = new Pattern("Rgsimages\\PolandGames\\GarniecZÅ‚ota\\auto6.png");
			  screen.wait(auto,5000);
			  Thread.sleep(3000);
			  screen.click();
			  
			  Pattern demo2 = new Pattern("Rgsimages\\PolandGames\\GarniecZÅ‚ota\\demo7.png");
			  screen.wait(demo2,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern("Rgsimages\\PolandGames\\GarniecZÅ‚ota\\home8.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void btyskothi() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("Rgsimages\\PolandGames\\btyskothi\\image1.png");
//			  screen.wait(diamond,5000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[16]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("Rgsimages\\PolandGames\\btyskothi\\demo2.png");
			  screen.wait(demo,5000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("Rgsimages\\PolandGames\\btyskothi\\sound3.png");
			  screen.wait(volume,40000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern start = new Pattern("Rgsimages\\PolandGames\\btyskothi\\ok4.png");
			  screen.wait(start,40000);
			  screen.click(start);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern("Rgsimages\\PolandGames\\btyskothi\\demo5.png");
			  screen.wait(demo1,40000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern demo2 = new Pattern("Rgsimages\\PolandGames\\btyskothi\\demo7.png");
			  screen.wait(demo2,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern("Rgsimages\\PolandGames\\btyskothi\\home8.png");
			  screen.wait(home,40000);
			  screen.click(home);
	  }
	  @Test()
	  public void gorki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("Rgsimages\\PolandGames\\gorki\\image1.png");
//			  screen.wait(diamond,5000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[17]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("Rgsimages\\PolandGames\\gorki\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("Rgsimages\\PolandGames\\gorki\\sound3.png");
			  screen.wait(volume,100000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern start = new Pattern("Rgsimages\\PolandGames\\gorki\\ok4.png");
			  screen.wait(start,5000);
			  screen.click(start);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern("Rgsimages\\PolandGames\\gorki\\demo5.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern auto = new Pattern("Rgsimages\\PolandGames\\gorki\\option6.png");
			  screen.wait(auto,40000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern demo2 = new Pattern("Rgsimages\\PolandGames\\gorki\\option7.png");
			  screen.wait(demo2,40000);
			  screen.click(demo2);
			  Thread.sleep(3000);
			  
			  Pattern auto1 = new Pattern("Rgsimages\\PolandGames\\gorki\\auto8.png");
			  screen.wait(auto1,40000);
			  screen.click(auto1);
			  Thread.sleep(3000);
			  
			  Pattern tryagain = new Pattern("Rgsimages\\PolandGames\\gorki\\tryagain9.png");
			  screen.wait(tryagain,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern("Rgsimages\\PolandGames\\gorki\\home10.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void emotki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("Rgsimages\\PolandGames\\emotki\\image1.png");
//			  screen.wait(diamond,5000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[18]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("Rgsimages\\PolandGames\\emotki\\demo2.png");
			  screen.wait(demo,5000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("Rgsimages\\PolandGames\\emotki\\sound3.png");
			  screen.wait(volume,100000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern start = new Pattern("Rgsimages\\PolandGames\\emotki\\ok4.png");
			  screen.wait(start,5000);
			  screen.click(start);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern("Rgsimages\\PolandGames\\emotki\\demo5.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern auto1 = new Pattern("Rgsimages\\PolandGames\\emotki\\auto6.png");
			  screen.wait(auto1,5000);
			  screen.click(auto1);
			  Thread.sleep(3000);
			  
			  Pattern tryagain = new Pattern("Rgsimages\\PolandGames\\emotki\\tryagain7.png");
			  screen.wait(tryagain,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern("Rgsimages\\PolandGames\\emotki\\home8.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void redPepperHot() throws InterruptedException, FindFailed {
			Thread.sleep(2000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,300)", "");
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("Rgsimages\\PolandGames\\hotPepperPayout\\image1.png");
//			  screen.wait(diamond,5000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[20]/img")).click();
			  
			  Thread.sleep(15000);
			  //JavascriptExecutor js1 = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,200)", "");
			  
			  Pattern demo = new Pattern("Rgsimages\\PolandGames\\hotPepperPayout\\demo2.png");
			  screen.wait(demo,5000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("Rgsimages\\PolandGames\\hotPepperPayout\\sound3.png");
			  screen.wait(volume,40000);
			  screen.click(volume);
			  
			  Pattern start = new Pattern("Rgsimages\\PolandGames\\hotPepperPayout\\ok4.png");
			  screen.wait(start,40000);
			  screen.click(start);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern("Rgsimages\\PolandGames\\hotPepperPayout\\demo5.png");
			  screen.wait(demo1,40000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern auto = new Pattern("Rgsimages\\PolandGames\\hotPepperPayout\\auto6.png");
			  screen.wait(auto,5000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern demo2 = new Pattern("Rgsimages\\PolandGames\\hotPepperPayout\\demo7.png");
			  screen.wait(demo2,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern("Rgsimages\\PolandGames\\hotPepperPayout\\home8.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test
		//1
		 public void Kurki () throws InterruptedException, FindFailed {
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(5000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			 
			  Screen s3 = new Screen();
			  js.executeScript("window. scrollBy(500,500)");
			  Pattern frontpage = new Pattern("Rgsimages\\Polandlottery\\Kurki-fp.png");
			  s3.wait(frontpage,1000);
			  s3.click(frontpage,1000);
			
			   Thread.sleep(5000);
			   js.executeScript("window. scrollBy(0,600)");
			  Pattern demo3 = new Pattern("Rgsimages\\Polandlottery\\Kurki-demo.png");
			  s3.wait(demo3,1000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern("Rgsimages\\Polandlottery\\Kurki-audio.png");
			  s3.wait(audio3,1000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern("Rgsimages\\Polandlottery\\Kurki-ok.png");
			  s3.wait(ok3,1000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern("Rgsimages\\Polandlottery\\Kurki-increase.png");
			  s3.wait(increase3 ,1000);
			  s3.click(increase3);
			  Pattern t3 = new Pattern("Rgsimages\\Polandlottery\\Kurki-demobtn.png");
			  s3.wait(t3,1000);
			  s3.click(t3);
			  Pattern ra3 = new Pattern("Rgsimages\\Polandlottery\\Kurki-autobtn.png");
			  s3.wait(ra3,1000);
			  s3.doubleClick(ra3);
			  Thread.sleep(5000);
			  Pattern home3 = new Pattern("Rgsimages\\Polandlottery\\Tot-try-home.png");
			  s3.wait(home3,1000);
			  s3.click(home3);	 
		}
	  @Test()
		//2
	 public void Totemki () throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			 // driver.findElement(By.xpath("//*[@alt=\"Totemki\"]")).click();
			 // Thread.sleep(1000);
			  Screen s = new Screen();
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window. scrollBy(500,5000)");
			  Pattern fp = new Pattern("Rgsimages\\Polandlottery\\Tot-fp.png");
			  s.wait(fp,30000);
			  s.click(fp);
			  Thread.sleep(5000);
			  js.executeScript("window. scrollBy(0,600)");
			  Pattern demo = new Pattern("Rgsimages\\Polandlottery\\Tot-demo.png");
			  		  s.wait(demo,1000);
			  s.click(demo);
			  Pattern audio = new Pattern("Rgsimages\\Polandlottery\\Tot-try-Audio.png");
			  s.wait(audio,1000);
			  s.click(audio);
			  Pattern ok = new Pattern("Rgsimages\\Polandlottery\\Tot-ok.png");
			  s.wait(ok,1000);
			  s.click(ok);
			  Pattern increase = new Pattern("Rgsimages\\Polandlottery\\Tot-increase.png");
			  s.wait(increase ,1000);
			  s.click(increase);
			  Pattern t = new Pattern("Rgsimages\\Polandlottery\\Tot-demobutton.png");
			  s.wait(t,1000);
			  s.click(t);
			  Pattern ra = new Pattern("Rgsimages\\Polandlottery\\Tot-try-revealall.png");
			  s.wait(ra,5000);
			  s.click(ra);
			  Pattern home = new Pattern("Rgsimages\\Polandlottery\\Tot-try-home.png");
			  s.wait(home,5000);
			  s.click(home);
	 }
		@Test
		//3
		 public void Skrzynki  () throws InterruptedException, FindFailed {
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("/html/body/div/div/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  Screen s1 = new Screen();
			  js.executeScript("window. scrollBy(500,500)");
			  Pattern fp = new Pattern("Rgsimages\\Polandlottery\\Skrzynki-fp.png");
			  s1.wait(fp,30000);
			  s1.click(fp);
			  Thread.sleep(5000);
			  		  js.executeScript("window. scrollBy(0,600)");
			   Thread.sleep(5000);
			  Pattern demo1 = new Pattern("Rgsimages\\Polandlottery\\Skrzynki-demo.png");
			  s1.wait(demo1,1000);
			  s1.click(demo1);
			  Pattern audio1 = new Pattern("Rgsimages\\Polandlottery\\Skrzynki-audio.png");
			  s1.wait(audio1,1000);
			  s1.doubleClick(audio1);
			  Pattern ok1 = new Pattern("Rgsimages\\Polandlottery\\Skrzynki-ok.png");
			  s1.wait(ok1,1000);
			  s1.click(ok1);
			  Pattern increase1 = new Pattern("Rgsimages\\Polandlottery\\Skrzynki-increase.png");
			  s1.wait(increase1 ,1000);
			  s1.click(increase1);
			  Pattern t1 = new Pattern("Rgsimages\\Polandlottery\\Skrzynki-demobtn.png");
			  s1.wait(t1,1000);
			  s1.click(t1);
			  Pattern ra1 = new Pattern("Rgsimages\\Polandlottery\\Skrzynki-autoreveal.png");
			  s1.wait(ra1,1000);
			  s1.doubleClick(ra1);
			  Pattern home1 = new Pattern("Rgsimages\\Polandlottery\\Tot-try-home.png");
			  s1.wait(home1,1000);
			  s1.click(home1);
		 }
		@Test
		//4
		 public void Kamyki() throws InterruptedException, FindFailed {
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(5000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window. scrollBy(500,500)");
			  Screen s2 = new Screen();
			  Pattern fp = new Pattern("Rgsimages\\Polandlottery\\kamyki-fp.png");
			  s2.wait(fp,1000);
			  s2.click(fp);
			  Thread.sleep(5000);
			  js.executeScript("window. scrollBy(0,600)");
			   
			  Pattern demo2 = new Pattern("Rgsimages\\Polandlottery\\kamyki-demo.png");
			  s2.wait(demo2,1000);
			  s2.click(demo2);
			  Pattern audio2 = new Pattern("Rgsimages\\Polandlottery\\kamyki-audio.png");
			  s2.wait(audio2,1000);
			  s2.doubleClick(audio2);
			  Pattern ok2 = new Pattern("Rgsimages\\Polandlottery\\kamyki-ok.png");
			  s2.wait(ok2,1000);
			  s2.click(ok2);
			  Pattern increase2 = new Pattern("Rgsimages\\Polandlottery\\kamyki-increase.png");
			  s2.wait(increase2 ,1000);
			  s2.click(increase2);
			  Pattern t2 = new Pattern("Rgsimages\\Polandlottery\\kamyki-demobtn.png");
			  s2.wait(t2,1000);
			  s2.click(t2);
			  Pattern ra2 = new Pattern("Rgsimages\\Polandlottery\\kamyki-demoauto.png");
			  s2.wait(ra2,1000);
			  s2.doubleClick(ra2);
			  Pattern home2 = new Pattern("Rgsimages\\Polandlottery\\Tot-try-home.png");
			  s2.wait(home2,1000);
			  s2.click(home2);
		 
		 	 }
		@Test
		//5
		 
		 public void Siódemki() throws InterruptedException, FindFailed {
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(5000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window. scrollBy(500,500)");
			  Screen s3 = new Screen();
			  Pattern fp = new Pattern("Rgsimages\\Polandlottery\\siodemki-fp.png");
			  s3.wait(fp,1000);
			  s3.click(fp);
			   Thread.sleep(5000);
			   js.executeScript("window. scrollBy(0,600)");
			  Pattern demo3 = new Pattern("Rgsimages\\Polandlottery\\Siodemki-demo.png");
			  s3.wait(demo3,1000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern("Rgsimages\\Polandlottery\\Siodemki-Audio.png");
			  s3.wait(audio3,1000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern("Rgsimages\\Polandlottery\\Siodemki-ok.png");
			  s3.wait(ok3,1000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern("Rgsimages\\Polandlottery\\Siodemki-increase.png");
			  s3.wait(increase3 ,1000);
			  s3.click(increase3);
			  Pattern t3 = new Pattern("Rgsimages\\Polandlottery\\Siodemki-demobutton.png");
			  s3.wait(t3,1000);
			  s3.click(t3);
			  Pattern ra3 = new Pattern("Rgsimages\\Polandlottery\\Siodemki-autobtn.png");
			  s3.wait(ra3,1000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern("Rgsimages\\Polandlottery\\Tot-try-home.png");
			  s3.wait(home3,1000);
			  s3.click(home3);
			 
		}
		@Test
		//6
		 public void gp () throws InterruptedException, FindFailed {
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(5000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window. scrollBy(500,500)");
			  Screen s3 = new Screen();
			  Pattern frontpage = new Pattern("Rgsimages\\Polandlottery\\Gp-frontpage.png");
			  s3.wait(frontpage,1000);
			  s3.click(frontpage);
		js.executeScript("window. scrollBy(0,600)");
			   Thread.sleep(5000);
			  Pattern demo3 = new Pattern("Rgsimages\\Polandlottery\\gp-demo.png");
			  s3.wait(demo3,1000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern("Rgsimages\\Polandlottery\\gp-audio.png");
			  s3.wait(audio3,1000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern("Rgsimages\\Polandlottery\\gp-ok.png");
			  s3.wait(ok3,1000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern("Rgsimages\\Polandlottery\\gp-increase.png");
			  s3.wait(increase3 ,1000);
			  s3.click(increase3);
			  Pattern t3 = new Pattern("Rgsimages\\Polandlottery\\gp-demobtn.png");
			  s3.wait(t3,1000);
			  s3.click(t3);
			  Pattern ra3 = new Pattern("Rgsimages\\Polandlottery\\gp-autobtn.png");
			  s3.wait(ra3,1000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern("Rgsimages\\Polandlottery\\Tot-try-home.png");
			  s3.wait(home3,1000);
			  s3.click(home3);
			 
		}
		@Test
		//7
		 public void Owocki() throws InterruptedException, FindFailed {
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(5000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window. scrollBy(500,500)");
			  Screen s3 = new Screen();
			  Pattern frontpage = new Pattern("Rgsimages\\Polandlottery\\Owocki-fp.png");
			  s3.wait(frontpage,10000);
			  s3.click(frontpage);
		js.executeScript("window. scrollBy(0,600)");
			   Thread.sleep(5000);
			  Pattern demo3 = new Pattern("Rgsimages\\Polandlottery\\Owocki-demo.png");
			  s3.wait(demo3,10000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern("Rgsimages\\Polandlottery\\Owocki-audio.png");
			  s3.wait(audio3,10000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern("Rgsimages\\Polandlottery\\Owocki-ok.png");
			  s3.wait(ok3,10000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern("Rgsimages\\Polandlottery\\Owocki-increase.png");
			  s3.wait(increase3 ,10000);
			  s3.click(increase3);
			  Pattern t3 = new Pattern("Rgsimages\\Polandlottery\\Owocki-demobtn.png");
			  s3.wait(t3,10000);
			  s3.click(t3);
			  Pattern ra3 = new Pattern("Rgsimages\\Polandlottery\\Owocki-autobtn.png");
			  s3.wait(ra3,10000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern("Rgsimages\\Polandlottery\\Tot-try-home.png");
			  s3.wait(home3,10000);
			  s3.click(home3);
			 
		}
		@Test
		//8
		 public void Gwiazdki () throws InterruptedException, FindFailed {
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(5000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window. scrollBy(500,500)");
			  Screen s3 = new Screen();
			  Pattern frontpage = new Pattern("Rgsimages\\Polandlottery\\Gwiazdki-fp.png");
			  s3.wait(frontpage,10000);
			  s3.click(frontpage);
		js.executeScript("window. scrollBy(0,600)");
			   Thread.sleep(5000);
			  Pattern demo3 = new Pattern("Rgsimages\\Polandlottery\\Gwiazdki-demo.png");
			  s3.wait(demo3,10000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern("Rgsimages\\Polandlottery\\Gwiazdki-audio.png");
			  s3.wait(audio3,10000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern("Rgsimages\\Polandlottery\\Gwiazdki-ok.png");
			  s3.wait(ok3,10000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern("Rgsimages\\Polandlottery\\Gwiazdki-increase.png");
			  s3.wait(increase3 ,10000);
			  s3.click(increase3);
			  Pattern t3 = new Pattern("Rgsimages\\Polandlottery\\Gwiazdki-demobtn.png");
			  s3.wait(t3,10000);
			  s3.click(t3);
			  Pattern ra3 = new Pattern("Rgsimages\\Polandlottery\\Gwiazdki-autobtn.png");
			  s3.wait(ra3,10000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern("Rgsimages\\Polandlottery\\Tot-try-home.png");
			  s3.wait(home3,10000);
			  s3.click(home3);
			 
		}
		@Test
		//9
		 public void krzyowki() throws InterruptedException, FindFailed {
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(5000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window. scrollBy(500,500)");
			  Screen s3 = new Screen();
			  Pattern frontpage = new Pattern("Rgsimages\\Polandlottery\\krzyowki-fp.png");
			  s3.wait(frontpage,10000);
			  s3.click(frontpage);
		js.executeScript("window. scrollBy(0,600)");
			   Thread.sleep(5000);
			  Pattern demo3 = new Pattern("Rgsimages\\Polandlottery\\krzyowki-demo.png");
			  s3.wait(demo3,10000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern("Rgsimages\\Polandlottery\\krzyowki-audio.png");
			  s3.wait(audio3,10000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern("Rgsimages\\Polandlottery\\krzyowki-ok.png");
			  s3.wait(ok3,10000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern("Rgsimages\\Polandlottery\\krzyowki-increase.png");
			  s3.wait(increase3 ,10000);
			  s3.click(increase3);
			  Pattern t3 = new Pattern("Rgsimages\\Polandlottery\\krzyowki-demobtn.png");
			  s3.wait(t3,10000);
			  s3.click(t3);
			  Pattern ra3 = new Pattern("Rgsimages\\Polandlottery\\krzyowki-autobtn.png");
			  s3.wait(ra3,10000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern("Rgsimages\\Polandlottery\\Tot-try-home.png");
			  s3.wait(home3,10000);
			  s3.click(home3);
			 
		}
		@Test
		//10
		 public void monetki () throws InterruptedException, FindFailed {
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(5000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window. scrollBy(500,500)");
			  Screen s3 = new Screen();
			  Pattern frontpage = new Pattern("Rgsimages\\Polandlottery\\monetki-fp.png");
			  s3.wait(frontpage,10000);
			  s3.click(frontpage);
		js.executeScript("window. scrollBy(0,600)");
			   Thread.sleep(5000);
			  Pattern demo3 = new Pattern("Rgsimages\\Polandlottery\\monetki-demo.png");
			  s3.wait(demo3,10000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern("Rgsimages\\Polandlottery\\monetki-audio.png");
			  s3.wait(audio3,10000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern("Rgsimages\\Polandlottery\\monetki-ok.png");
			  s3.wait(ok3,10000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern("Rgsimages\\Polandlottery\\monetki-increase.png");
			  s3.wait(increase3 ,10000);
			  s3.click(increase3);
			  Pattern t3 = new Pattern("Rgsimages\\Polandlottery\\monetki-demobtn.png");
			  s3.wait(t3,10000);
			  s3.click(t3);
			  Pattern ra3 = new Pattern("Rgsimages\\Polandlottery\\monetki-autobtn.png");
			  s3.wait(ra3,10000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern("Rgsimages\\Polandlottery\\Tot-try-home.png");
			  s3.wait(home3,10000);
			  s3.click(home3);
			 
		}
		@Test
		//11
		 public void znaczki () throws InterruptedException, FindFailed {
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(5000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window. scrollBy(500,500)");
			  Screen s3 = new Screen();
			  Pattern frontpage = new Pattern("Rgsimages\\Polandlottery\\znaczki-fp.png");
			  s3.wait(frontpage,10000);
			  s3.click(frontpage);
		js.executeScript("window. scrollBy(0,600)");
			   Thread.sleep(5000);
			  Pattern demo3 = new Pattern("Rgsimages\\Polandlottery\\Znaczki-demo.png");
			  s3.wait(demo3,10000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern("Rgsimages\\Polandlottery\\Znaczki-audio.png");
			  s3.wait(audio3,10000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern("Rgsimages\\Polandlottery\\Znaczki-ok.png");
			  s3.wait(ok3,10000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern("Rgsimages\\Polandlottery\\Znaczki-increase.png");
			  s3.wait(increase3 ,10000);
			  s3.click(increase3);
			  Pattern t3 = new Pattern("Rgsimages\\Polandlottery\\Znaczki-demobtn.png");
			  s3.wait(t3,10000);
			  s3.click(t3);
			  Pattern ra3 = new Pattern("Rgsimages\\Polandlottery\\Znaczki-auto.png");
			  s3.wait(ra3,10000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern("Rgsimages\\Polandlottery\\Tot-try-home.png");
			  s3.wait(home3,10000);
			  s3.click(home3);
			 
		}

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
