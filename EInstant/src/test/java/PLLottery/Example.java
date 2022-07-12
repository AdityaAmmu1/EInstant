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
  @Test
  public void f() throws FindFailed, InterruptedException {
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
	  Thread.sleep(5000);
	  
	  Screen screen = new Screen();
//	  Pattern diamond = new Pattern(absPath+"\\PolandGames\\Egypt\\image1.png");
//	  screen.wait(diamond,40000);
//	  screen.click(diamond);
	  Thread.sleep(10000);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,150)", "");
	  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[12]/img")).click();
	  
	  Thread.sleep(15000);
	  js.executeScript("window.scrollBy(0,600)", "");
	  
	  Pattern demo = new Pattern(absPath+"\\PolandGames\\Egypt\\demo2.png").similar(0.7);
	  //screen.exists(demo, 40000);
	  screen.wait(demo,40000);
	  screen.click(demo);
	  
	  Pattern volume = new Pattern(absPath+"\\PolandGames\\Egypt\\sound3.png").similar(0.7);
	  screen.wait(volume,40000);
	  //screen.exists(volume, 40000);
	  screen.click(volume);
	  
	  Pattern ok = new Pattern(absPath+"\\PolandGames\\Egypt\\ok4.png").similar(0.7);
	  screen.wait(ok,40000);
	  //screen.exists(ok, 400);
	  screen.click(ok);
	  
	  Pattern demo1 = new Pattern(absPath+"\\PolandGames\\Egypt\\demo5.png").similar(0.7);
	  //screen.exists(demo1, 400);
	  screen.wait(demo1,40000);
	  screen.click(demo1);
	  
	  Pattern auto = new Pattern(absPath+"\\PolandGames\\Egypt\\auto6.png").similar(0.7);
	  //screen.exists(auto, 40000);
	  screen.wait(auto,40000);
	  screen.click(auto);
	  Thread.sleep(3000);
	  
	  Pattern tryAgain = new Pattern(absPath+"\\PolandGames\\Egypt\\demo7.png").similar(0.7);
	  //screen.exists(tryAgain, 40000);
	  screen.wait(tryAgain,40000);
	  Thread.sleep(2000);
	  
	  Pattern home = new Pattern(absPath+"\\PolandGames\\Egypt\\home8.png").similar(0.7);
	  //screen.exists(home, 40000);
	  screen.wait(home,40000);
	  screen.click(home);
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
