package PLLottery;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;

public class Example {
	public static WebDriver driver;
	static String filePath = "Rgsimages";
	static File file = new File(filePath);
	static String absPath = file.getAbsolutePath();
	 @Test()
	  public void triplePlatinum() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern(absPath+"\\PolandGames\\TriplePlatinum\\image1.png");
//			  screen.wait(diamond,5000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[15]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern(absPath+"\\PolandGames\\TriplePlatinum\\demo2.png").similar(0.6);
			  screen.wait(demo,5000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern(absPath+"\\PolandGames\\TriplePlatinum\\sound3.png").similar(0.6);
			  screen.wait(volume,40000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern(absPath+"\\PolandGames\\TriplePlatinum\\ok4.png").similar(0.6);
			  screen.wait(ok,5000);
			  screen.click(ok);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern(absPath+"\\PolandGames\\TriplePlatinum\\demo5.png").similar(0.6);
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern auto = new Pattern(absPath+"\\PolandGames\\TriplePlatinum\\auto6.png").similar(0.6);
			  screen.wait(auto,40000);
			  Thread.sleep(3000);
			  screen.click();
			  
			  Pattern demo2 = new Pattern(absPath+"\\PolandGames\\TriplePlatinum\\demo7.png").similar(0.6);
			  screen.wait(demo2,5000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern(absPath+"\\PolandGames\\TriplePlatinum\\home8.png").similar(0.6);
			  screen.wait(home,5000);
			  screen.click(home);
			  
			  js.executeScript("window.scrollBy(0,0)", "");
	  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		String addproxy = "http://hybrid-web.cluster-a.blackspider.com";
		Proxy proxy = new Proxy();
		proxy.setHttpProxy(addproxy);//http
		proxy.setSslProxy(addproxy);//secure socket layer
		chromeOptions.setCapability("proxy", proxy);
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();	
		   driver.get("https://staging.devlotto.pl/");
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[4]/div[2]/div[3]/div/button")).click();
		   
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
