package PLLottery;

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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BuyGames{
	public static WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void beforeMethod(String browser) throws InterruptedException, FindFailed {
		switch(browser.toLowerCase()){
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			String addproxy = "http://hybrid-web.cluster-a.blackspider.com";
			Proxy proxy = new Proxy();
			proxy.setHttpProxy(addproxy);//https
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
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/div/div[2]/button")).click();
			//entering uid
			driver.findElement(By.xpath("//*[@id=\"username-dropdown-login\"]")).sendKeys("gierka001");
			//entering password
			driver.findElement(By.xpath("//*[@id=\"password-dropdown-login\"]")).sendKeys("Welcome1");
			System.out.println("login button");
			Screen screen1 = new Screen();
			Pattern submit = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\submit.png");
			  screen1.wait(submit,40000);
			  screen1.click(submit);
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[4]/div/div[1]/div/div/div[2]/div[2]/button")).click();
		
		}
	  @Test()
	  public void Diamond() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\diamond\\image1.png");
//			  screen.wait(diamond,40000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[7]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,500)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\diamond\\demo2.png");
			  screen.wait(demo,5000); 
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\diamond\\volume3.png");
			  screen.wait(volume,40000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\diamond\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern switch8 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\diamond\\switch8.png");
			  screen.wait(switch8,5000);
			  screen.click(switch8);
			  
			  Pattern realPlay = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\diamond\\realPlay6.png");
			  screen.wait(realPlay,40000);
			  screen.click(realPlay);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\diamond\\auto7.png");
			  screen.wait(auto,40000);
			  screen.click(auto);
			  Thread.sleep(10000);
			  
			  Pattern realPlay1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\diamond\\realPlay7.png");
			  screen.wait(realPlay1,40000);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\diamond\\home8.png");
			  screen.wait(home,40000);
			  screen.click(home);
	  }
	  @Test()
	  public void Egypt() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\image1.png");
//			  screen.wait(diamond,40000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[12]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\switch5.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern ok1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok1);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\place7.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\auto8.png");
			  screen.wait(auto,40000);
			  screen.click(auto);
			  Thread.sleep(3000);
			  
			  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\place9.png");
			  screen.wait(play2,5000);

			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\home10.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	
	 @Test()
	  public void goldRush() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\goldRush\\image1.png");
//			  screen.wait(diamond,40000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[5]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\goldRush\\demo2.png");
			  screen.wait(demo,40000); 
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\goldRush\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\goldRush\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern demo1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\goldRush\\switch5.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(7000);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\goldRush\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\goldRush\\place7.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  
			  Pattern auto3 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\goldRush\\auto8.png");
			  screen.wait(auto3,5000);
			  screen.click(auto3);
			  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\goldRush\\place9.png");
			  screen.wait(play2,5000);
			  Thread.sleep(15000);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\goldRush\\home8.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void Card5() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\5card\\image1.png");
//			  screen.wait(diamond,40000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[8]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\5card\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\5card\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\5card\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern demo1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\5card\\switch5.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(7000);
			  
			  Pattern ok1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\5card\\ok4.png");
			  screen.wait(ok1,5000);
			  screen.click(ok1);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\5card\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\5card\\place7.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  
			  Pattern auto3 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\5card\\auto8.png");
			  screen.wait(auto3,5000);
			  screen.click(auto3);
			  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\5card\\place9.png");
			  screen.wait(play2,5000);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\5card\\home10.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void ChristmasBalls() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Christmas balls\\image1.png");
//			  screen.wait(diamond,40000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[9]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Christmas balls\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Christmas balls\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Christmas balls\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Christmas balls\\switch5.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Christmas balls\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Christmas balls\\place7.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  Thread.sleep(3000);
			  
			  Pattern auto3 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Christmas balls\\auto8.png");
			  screen.wait(auto3,5000);
			  screen.click(auto3);
			  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Christmas balls\\place9.png");
			  screen.wait(play2,5000);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Christmas balls\\home10.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  
	  @Test()
	  public void Cyferki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\image1.png");
//			  screen.wait(diamond,40000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[10]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\switch5.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern ok1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\ok4.png");
			  screen.wait(ok1,5000);
			  screen.click(ok1);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\place7.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  Thread.sleep(3000);
			  
			  Pattern play1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\place8.png");
			  screen.wait(play1,40000);
			  screen.click(play1);
			  Thread.sleep(3000);
			  
			  Pattern start = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\start9.png");
			  screen.wait(start,40000);
			  screen.click(start);
			  Thread.sleep(3000);
			  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\place10.png");
			  screen.wait(play2,5000);

			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\home11.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void Antyki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Antyki\\image1.png");
//			  screen.wait(diamond,40000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[11]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Antyki\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Antyki\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Antyki\\switch5.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Antyki\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Antyki\\place8.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Antyki\\auto9.png");
			  screen.wait(auto,40000);
			  screen.click(auto);
			  Thread.sleep(3000);
			  
			  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Antyki\\place10.png");
			  screen.wait(play2,5000);

			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Antyki\\home11.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void triplePlatinum() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\TriplePlatinum\\image1.png");
//			  screen.wait(diamond,40000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[15]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\TriplePlatinum\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\TriplePlatinum\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\TriplePlatinum\\ok4.png");
			  screen.wait(ok1,5000);
			  Thread.sleep(2000);
			  screen.click(ok1);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\TriplePlatinum\\switch5.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\TriplePlatinum\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\TriplePlatinum\\play7.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\TriplePlatinum\\auto8.png");
			  screen.wait(auto,40000);
			  screen.click(auto);
			  Thread.sleep(3000);
			  
			  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\TriplePlatinum\\play9.png");
			  screen.wait(play2,5000);

			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\TriplePlatinum\\home10.png");
			  screen.wait(home,5000);
			  screen.click(home);
			  }
	  @Test()
	  public void Duszki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Duszki\\image1.png");
//			  screen.wait(diamond,40000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[13]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Duszki\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Duszki\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Duszki\\ok4.png");
			  screen.wait(ok1,5000);
			  Thread.sleep(2000);
			  screen.click(ok1);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Duszki\\switch5.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Duszki\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Duszki\\place7.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Duszki\\auto8.png");
			  screen.wait(auto,40000);
			  screen.click(auto);
			  		  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Duszki\\place9.png");
			  screen.wait(play2,5000);

			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Duszki\\home10.png");
			  screen.wait(home,5000);
			  screen.click(home);
			  }
	  @Test()
	  public void Garniec() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\image1.png");
//			  screen.wait(diamond,40000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[14]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\start4.png");
			  screen.wait(ok1,5000);
			  Thread.sleep(2000);
			  screen.click(ok1);
			  
			  Pattern setting = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\setting5.png");
			  screen.wait(setting,40000);
			  screen.click(setting);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\switch6.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\reduce7.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\place8.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\auto9.png");
			  screen.wait(auto,40000);
			  screen.click(auto);
			  		  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\place10.png");
			  screen.wait(play2,5000);

			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\home11.png");
			  screen.wait(home,5000);
			  screen.click(home);
			  }
	  @Test()
	  public void btyskothi() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\btyskothi\\image1.png");
//			  screen.wait(diamond,40000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[16]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\btyskothi\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\btyskothi\\sound3.png");
			  screen.wait(volume,5000);
			  screen.click(volume);
			  
			  Pattern ok1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\btyskothi\\ok4.png");
			  screen.wait(ok1,5000);
			  Thread.sleep(2000);
			  screen.click(ok1);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\btyskothi\\switch5.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern ok2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\btyskothi\\ok4.png");
			  screen.wait(ok2,5000);
			  screen.click(ok2);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\btyskothi\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\btyskothi\\place7.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  Thread.sleep(3000);
			  		  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\btyskothi\\place8.png");
			  screen.wait(play2,5000);
			  Thread.sleep(15000);

			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\btyskothi\\home9.png");
			  screen.wait(home,5000);
			  screen.click(home);
			  }
	  @Test()
	  public void hotPepperPayout() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,200)", "");
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\hotPepperPayout\\image1.png");
//			  screen.wait(diamond,40000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[20]/img")).click();
			  
			  Thread.sleep(15000);
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\hotPepperPayout\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\hotPepperPayout\\sound3.png");
			  screen.wait(volume,5000);
			  screen.click(volume);
			  
			  Pattern ok1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\hotPepperPayout\\ok4.png");
			  screen.wait(ok1,5000);
			  Thread.sleep(2000);
			  screen.click(ok1);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\hotPepperPayout\\switch5.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\hotPepperPayout\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\hotPepperPayout\\place7.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  Thread.sleep(3000);
			  		  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\hotPepperPayout\\auto8.png");
			  screen.wait(auto,5000);
			  screen.click(auto);
			  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\hotPepperPayout\\place9.png");
			  screen.wait(play2,5000);
			  Thread.sleep(15000);

			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\hotPepperPayout\\home10.png");
			  screen.wait(home,5000);
			  screen.click(home);
			  }

	  @Test()
	  public void gorki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,200)", "");
			  Thread.sleep(2000);
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\image1.png");
//			  screen.wait(diamond,40000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[17]/img")).click();
			  
			  Thread.sleep(15000);
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\sound3.png");
			  screen.wait(volume,5000);
			  screen.click(volume);
			  
			  Pattern ok1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\ok4.png");
			  screen.wait(ok1,5000);
			  Thread.sleep(2000);
			  screen.click(ok1);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\switch5.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\place7.png");
			  screen.wait(play,5000);
			  screen.click(play);
			  
			  Pattern option = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\option8.png");
			  screen.wait(option,5000);
			  screen.click(option);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\ok9.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  		  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\auto10.png");
			  screen.wait(auto,5000);
			  screen.click(auto);
			  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\place11.png");
			  screen.wait(play2,5000);
			  Thread.sleep(3000);

			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\home12.png");
			  screen.wait(home,5000);
			  screen.click(home);
			  }
	  @Test()
	  public void emotki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,200)", "");
			  Thread.sleep(2000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\emotki\\image1.png");
//			  screen.wait(diamond,40000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[18]/img")).click();
			  
			  Thread.sleep(15000);
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\emotki\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\emotki\\sound3.png");
			  screen.wait(volume,5000);
			  screen.click(volume);
			  
			  Pattern ok1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\emotki\\ok4.png");
			  screen.wait(ok1,5000);
			  Thread.sleep(2000);
			  screen.click(ok1);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\emotki\\switch5.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\emotki\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\emotki\\place7.png");
			  screen.wait(play,5000);
			  screen.click(play);
			  		  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\emotki\\auto8.png");
			  screen.wait(auto,40000);
			  screen.click(auto);
			  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\emotki\\place9.png");
			  screen.wait(play2,5000);
			  Thread.sleep(3000);

			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\emotki\\home10.png");
			  screen.wait(home,5000);
			  screen.click(home);
			  }
	  @Test
		//1
		 public void monetki () throws InterruptedException, FindFailed {
			 
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(1000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window. scrollBy(500,500)");
			  Screen s3 = new Screen();
			  Pattern frontpage = new Pattern("E:\\eclipse\\projects\\Polandlottery\\monetki-fp.png");
			  s3.wait(frontpage,10000);
			  s3.click(frontpage);
			  Thread.sleep(2000);
		js.executeScript("window. scrollBy(500,500)");
		Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\monetki-demo.png");
			  s3.wait(demo3,10000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\monetki-audio.png");
			  s3.wait(audio3,10000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\monetki-ok.png");
			  s3.wait(ok3,10000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\monetki-increase.png");
			  s3.wait(increase3 ,10000);
			  s3.click(increase3);
			  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\monetki-mtm.png");
			  s3.wait(mtm,10000);
			  s3.click(mtm);
			  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\monetki-buy.png");
			  s3.wait(buy,10000);
			  s3.click(buy);
			  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\monetki-autobtn.png");
			  s3.wait(ra3,10000);
			  s3.doubleClick(ra3);
			  Thread.sleep(5000);
			  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
			  s3.wait(home3,10000);
			  s3.click(home3);
}
	   @Test
		//2
		 public void gp () throws InterruptedException, FindFailed {
			
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(5000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window. scrollBy(500,500)");
			  Screen s3 = new Screen();
			  Pattern frontpage = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Gp-frontpage.png");
			  s3.wait(frontpage,1000);
			  s3.click(frontpage);
		js.executeScript("window. scrollBy(0,600)");
			   Thread.sleep(5000);
			  Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\gp-demo.png");
			  s3.wait(demo3,1000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\gp-audio.png");
			  s3.wait(audio3,1000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\gp-ok.png");
			  s3.wait(ok3,1000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\gp-increase.png");
			  s3.wait(increase3 ,1000);
			  s3.click(increase3);
			  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\gp-mtm.png");
			  s3.wait(mtm,1000);
			  s3.click(mtm);
			  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\gp-buy.png");
			  s3.wait(buy,1000);
			  s3.click(buy);
			  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\gp-buy-auto.png");
			  s3.wait(ra3,1000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
			  s3.wait(home3,1000);
			  s3.click(home3);
	   }
	   @Test
		//3
		 public void Gwiazdki () throws InterruptedException, FindFailed {
			
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(5000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window. scrollBy(500,500)");
			  Screen s3 = new Screen();
			  Pattern frontpage = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Gwiazdki-fp.png");
			  s3.wait(frontpage,10000);
			  s3.click(frontpage);
		js.executeScript("window. scrollBy(0,600)");
			   Thread.sleep(5000);
			  Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Gwiazdki-demo.png");
			  s3.wait(demo3,10000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Gwiazdki-audio.png");
			  s3.wait(audio3,10000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Gwiazdki-ok.png");
			  s3.wait(ok3,10000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Gwiazdki-increase.png");
			  s3.wait(increase3 ,10000);
			  s3.click(increase3);
			  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Gwiazdki-mtm.png");
			  s3.wait(mtm,10000);
			  s3.click(mtm);
			  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Gwiazdki-buy.png");
			  s3.wait(buy,1000);
			  s3.click(buy);
			  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Gwiazdki-autobtn.png");
			  s3.wait(ra3,10000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
			  s3.wait(home3,10000);
			  s3.click(home3);
			 
		}
	   @Test
		//4
		 public void Kamyki() throws InterruptedException, FindFailed {
			 
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(5000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window. scrollBy(500,500)");
			  Screen s2 = new Screen();
			  Pattern fp = new Pattern("E:\\eclipse\\projects\\Polandlottery\\kamyki-fp.png");
			  s2.wait(fp,1000);
			  s2.click(fp);
			  Thread.sleep(5000);
			  js.executeScript("window. scrollBy(0,600)");
			  Pattern demo2 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\kamyki-demo.png");
			  s2.wait(demo2,1000);
			  s2.click(demo2);
			  Pattern audio2 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\kamyki-audio.png");
			  s2.wait(audio2,1000);
			  s2.doubleClick(audio2);
			  Pattern ok2 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\kamyki-ok.png");
			  s2.wait(ok2,1000);
			  s2.click(ok2);
			  Pattern increase2 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\kamyki-increase.png");
			  s2.wait(increase2 ,1000);
			  s2.click(increase2);
			  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\kamyki-mtm.png");
			  s2.wait(mtm,1000);
			  s2.click(mtm);
			  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\kamyki-buy.png");
			  s2.wait(buy,1000);
			  s2.click(buy);
			  Pattern ra2 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\kamyki-demoauto.png");
			  s2.wait(ra2,1000);
			  s2.doubleClick(ra2);
			  Pattern home2 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
			  s2.wait(home2,1000);
			  s2.click(home2);
		 
		 	 }
	   @Test
		//5
		 public void Kurki () throws InterruptedException, FindFailed {
			
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(5000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			 
			  Screen s3 = new Screen();
			  js.executeScript("window. scrollBy(500,500)");
			  Pattern frontpage = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Kurki-fp.png");
			  s3.wait(frontpage,1000);
			  s3.click(frontpage,1000);
			
			   Thread.sleep(5000);
			   js.executeScript("window. scrollBy(0,600)");
			  Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Kurki-demo.png");
			  s3.wait(demo3,1000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Kurki-audio.png");
			  s3.wait(audio3,1000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Kurki-ok.png");
			  s3.wait(ok3,1000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Kurki-increase.png");
			  s3.wait(increase3 ,1000);
			  s3.click(increase3);
			  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Kurki-mtm.png");
			  s3.wait(mtm,1000);
			  s3.click(mtm);
			  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Kurki-buy.png");
			  s3.wait(buy,1000);
			  s3.click(buy);
			  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Kurki-autobtn.png");
			  s3.wait(ra3,1000);
			  s3.doubleClick(ra3);
			  Thread.sleep(5000);
			  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
			  s3.wait(home3,1000);
			  s3.click(home3);
			 
		}		
	   @Test()
		//6
	 public void Totemki () throws InterruptedException, FindFailed {
			
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			 // driver.findElement(By.xpath("//*[@alt=\"Totemki\"]")).click();
			 // Thread.sleep(1000);
			  Screen s = new Screen();
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window. scrollBy(500,5000)");
			  Pattern fp = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-fp.png");
			  s.wait(fp,30000);
			  s.click(fp);
			  Thread.sleep(5000);
			  js.executeScript("window. scrollBy(0,600)");
			  Pattern demo = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-demo.png");
			  		  s.wait(demo,1000);
			  s.click(demo);
			  Pattern audio = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-Audio.png");
			  s.wait(audio,1000);
			  s.click(audio);
			  Pattern ok = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-ok.png");
			  s.wait(ok,1000);
			  s.click(ok);
			  Pattern increase = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-increase.png");
			  s.wait(increase ,1000);
			  s.click(increase);
			  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\tot-mtm.png");
			  s.wait(mtm,1000);
			  s.click(mtm);
			  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\tot-buy.png");
			  s.wait(buy,1000);
			  s.click(buy);
			  Pattern ra = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-revealall.png");
			  s.wait(ra,5000);
			  s.click(ra);
			  Pattern home = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
			  s.wait(home,5000);
			  s.click(home);
	 }
	   @Test
		//7
		 public void Skrzynki  () throws InterruptedException, FindFailed {
			
			 driver.findElement(By.xpath("/html/body/div/div/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  Screen s1 = new Screen();
			  js.executeScript("window. scrollBy(500,500)");
			  Pattern fp = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Skrzynki-fp.png");
			  s1.wait(fp,30000);
			  s1.click(fp);
			  Thread.sleep(5000);
			 js.executeScript("window. scrollBy(0,600)");
			   Thread.sleep(5000);
			  Pattern demo1 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Skrzynki-demo.png");
			  s1.wait(demo1,1000);
			  s1.click(demo1);
			  Pattern audio1 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Skrzynki-audio.png");
			  s1.wait(audio1,1000);
			  s1.doubleClick(audio1);
			  Pattern ok1 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Skrzynki-ok.png");
			  s1.wait(ok1,1000);
			  s1.click(ok1);
			  Pattern increase1 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Skrzynki-increase.png");
			  s1.wait(increase1 ,1000);
			  s1.click(increase1);
			  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\skrzunki-movetomoney.png");
			  s1.wait(mtm,1000);
			  s1.click(mtm);
			  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\skrzynki-buy.png");
			  s1.wait(buy,1000);
			  s1.click(buy);
			  Pattern ra1 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Skrzynki-autoreveal.png");
			  s1.wait(ra1,1000);
			  s1.doubleClick(ra1);
			  Pattern home1 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
			  s1.wait(home1,1000);
			  s1.click(home1);
		 }
	   @Test
		//8
		 public void Owocki() throws InterruptedException, FindFailed {
			 
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(5000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window. scrollBy(500,500)");
			  Screen s3 = new Screen();
			  Pattern frontpage = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Owocki-fp.png");
			  s3.wait(frontpage,10000);
			  s3.click(frontpage);
		js.executeScript("window. scrollBy(0,600)");
			   Thread.sleep(5000);
			  Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Owocki-demo.png");
			  s3.wait(demo3,10000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Owocki-audio.png");
			  s3.wait(audio3,10000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Owocki-ok.png");
			  s3.wait(ok3,10000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Owocki-increase.png");
			  s3.wait(increase3 ,10000);
			  s3.click(increase3);
			  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Owocki-mtm.png");
			  s3.wait(mtm,1000);
			  s3.click(mtm);
			  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Owocki-buy.png");
			  s3.wait(buy,1000);
			  s3.click(buy);
			  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Owocki-autobtn.png");
			  s3.wait(ra3,10000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
			  s3.wait(home3,10000);
			  s3.click(home3);
			 
		}
	   @Test
		//9
		 public void krzyowki() throws InterruptedException, FindFailed {
			
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(5000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window. scrollBy(500,500)");
			  Screen s3 = new Screen();
			  Pattern frontpage = new Pattern("E:\\eclipse\\projects\\Polandlottery\\krzyowki-fp.png");
			  s3.wait(frontpage,10000);
			  s3.click(frontpage);
		js.executeScript("window. scrollBy(0,600)");
			   Thread.sleep(5000);
			  Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\krzyowki-demo.png");
			  s3.wait(demo3,10000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\krzyowki-audio.png");
			  s3.wait(audio3,10000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\krzyowki-ok.png");
			  s3.wait(ok3,10000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\krzyowki-increase.png");
			  s3.wait(increase3 ,10000);
			  s3.click(increase3);
			  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\krzyowki-mtm.png");
			  s3.wait(mtm,1000);
			  s3.click(mtm);
			  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\krzyowki-buy.png");
			  s3.wait(buy,1000);
			  s3.click(buy);
			  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\krzyowki-autobtn.png");
			  s3.wait(ra3,10000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
			  s3.wait(home3,10000);
			  s3.click(home3);
			 
		}
	   @Test
		//10
		 public void znaczki () throws InterruptedException, FindFailed {
			 
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(5000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window. scrollBy(500,500)");
			  Screen s3 = new Screen();
			  Pattern frontpage = new Pattern("E:\\eclipse\\projects\\Polandlottery\\znaczki-fp.png");
			  s3.wait(frontpage,10000);
			  s3.click(frontpage);
		js.executeScript("window. scrollBy(0,600)");
			   Thread.sleep(5000);
			  Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Znaczki-demo.png");
			  s3.wait(demo3,10000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Znaczki-audio.png");
			  s3.wait(audio3,10000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Znaczki-ok.png");
			  s3.wait(ok3,10000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Znaczki-increase.png");
			  s3.wait(increase3 ,10000);
			  s3.click(increase3);
			  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\znaczki-mtm.png");
			  s3.wait(mtm,1000);
			  s3.click(mtm);
			  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\znaczki-buy.png");
			  s3.wait(buy,1000);
			  s3.click(buy);
			  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Znaczki-auto.png");
			  s3.wait(ra3,10000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
			  s3.wait(home3,10000);
			  s3.click(home3);
			 
		}
		
	   @Test
		//11
		 
	   public void Siódemki() throws InterruptedException, FindFailed {
			
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(5000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window. scrollBy(500,500)");
			  Screen s3 = new Screen();
			  Pattern fp = new Pattern("E:\\eclipse\\projects\\Polandlottery\\siodemki-fp.png");
			  s3.wait(fp,1000);
			  s3.click(fp);
			   Thread.sleep(5000);
			   js.executeScript("window. scrollBy(0,600)");
			  Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Siodemki-demo.png");
			  s3.wait(demo3,1000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Siodemki-Audio.png");
			  s3.wait(audio3,1000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Siodemki-ok.png");
			  s3.wait(ok3,1000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Siodemki-increase.png");
			  s3.wait(increase3 ,1000);
			  s3.click(increase3);
			  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Siodemki-mtm.png");
			  s3.wait(mtm,1000);
			  s3.click(mtm);
			  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Siodemki-buy.png");
			  s3.wait(buy,1000);
			  s3.click(buy);
			  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Siodemki-autobtn.png");
			  s3.wait(ra3,1000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
			  s3.wait(home3,1000);
			  s3.click(home3);
			 
		}

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}

