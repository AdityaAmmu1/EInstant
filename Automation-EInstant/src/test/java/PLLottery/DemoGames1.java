package PLLottery;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import java.io.File;
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
import org.testng.annotations.AfterTest;

public class DemoGames1{
	public static WebDriver driver;
	static String filePath = "Rgsimages";
	static File file = new File(filePath);
	static String absPath = file.getAbsolutePath();
	static JavascriptExecutor js = (JavascriptExecutor) driver;
	 @BeforeTest
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
		
			driver.findElement(By.xpath("//*[@id=\"zowieHideIcon\"]")).click(); //Remove the crossicon below
			Thread.sleep(4000);
			
		}
	@Test
	public void stowka() throws FindFailed, InterruptedException{
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[3]")).click();
		Thread.sleep(15000);
		 Screen s = new Screen();
		 js.executeScript("window.scrollBy(0,550)", "");
		Pattern demo = new Pattern(absPath+"\\PolandGames\\Grzmiąca Fortuna\\GF-Demo.png").similar(0.7);
		s.wait(demo,40000);
		s.click(demo);
		Pattern FP = new Pattern(absPath+"\\Słówka\\FP.png").similar(0.7);
		s.wait(FP,40000);
		s.click(FP);
		Pattern audio = new Pattern(absPath+"\\PolandGames\\Grzmiąca Fortuna\\GF-Audio.png").similar(0.7);
		s.wait(audio,40000);
		s.click(audio);
		Pattern demobtn = new Pattern(absPath+"\\PolandGames\\Słówka\\demobtn.png").similar(0.5);
		s.wait(demobtn,40000);
		s.click(demobtn);
		Thread.sleep(2000);
		Pattern auto = new Pattern(absPath+"\\PolandGames\\Słówka\\auto.png").similar(0.5);
		s.wait(auto,40000);
		s.click(auto);
		Thread.sleep(1000);
		s.click(absPath+"\\PolandGames\\home.png");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(1000,0)");	
		
	}
	@Test	
	public void GF() throws FindFailed, InterruptedException{
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[1]")).click();
		 Thread.sleep(15000);
		 Screen s21 = new Screen();
		 js.executeScript("window.scrollBy(0,550)", "");

		Pattern demo1 = new Pattern(absPath+"\\PolandGames\\Grzmiąca Fortuna\\GF-Demo.png").similar(0.7);
		s21.wait(demo1,40000);
		s21.click(demo1);
		Pattern FP1 = new Pattern(absPath+"\\PolandGames\\Grzmiąca Fortuna\\GF-Frontpage.png").similar(0.7);
		s21.wait(FP1,40000);
		s21.click(FP1);
		Pattern audio1 = new Pattern(absPath+"\\PolandGames\\Grzmiąca Fortuna\\GF-Audio.png").similar(0.7);
		s21.wait(audio1,40000);
		s21.click(audio1);
		Pattern demobtn1 = new Pattern(absPath+"\\PolandGames\\Grzmiąca Fortuna\\GF-Demobtn.png").similar(0.5);
		s21.wait(demobtn1,40000);
		s21.click(demobtn1);
		Pattern auto1 = new Pattern(absPath+"\\PolandGames\\Grzmiąca Fortuna\\GF-auto.png").similar(0.5);
		s21.wait(auto1,40000);
		s21.click(auto1);
		Thread.sleep(2000);
		s21.click(absPath+"\\home.png");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(1000,0)");		
	}
	@Test
	public void HP() throws FindFailed, InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[4]")).click();
		 Thread.sleep(15000);
		 Screen s3 = new Screen();
		 js.executeScript("window.scrollBy(0,550)", "");
		Pattern demo3 = new Pattern(absPath+"\\PolandGames\\Grzmiąca Fortuna\\GF-Demo.png").similar(0.7);
		s3.wait(demo3,40000);
		s3.click(demo3);
		Pattern FP3 = new Pattern(absPath+"\\PolandGames\\HP\\FP.png").similar(0.7);
		s3.wait(FP3,40000);
		s3.click(FP3);
		Pattern audio3 = new Pattern(absPath+"\\PolandGames\\Grzmiąca Fortuna\\GF-Audio.png").similar(0.7);
		s3.wait(audio3,40000);
		s3.click(audio3);
		
		Pattern demobtn3 = new Pattern(absPath+"\\PolandGames\\HP\\demobtn.png").similar(0.5);
		s3.wait(demobtn3,40000);
		s3.click(demobtn3);
		Thread.sleep(2000);
		s3.click(absPath+"\\PolandGames\\home.png");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(1000,0)");	
	}

	  public void Diamond() throws InterruptedException, FindFailed {
			  
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click(); //Click on the game display
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern(absPath+"\\PolandGames\\diamond\\image1.png");
//			  screen.wait(diamond,40000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[7]/img")).click();// Click on the image
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern(absPath+"\\PolandGames\\diamond\\demo2.png").similar(0.6);
			  screen.wait(demo,40000); 
			  screen.click(demo);
			  
			  Pattern volume = new Pattern(absPath+"\\PolandGames\\diamond\\volume3.png").similar(0.6);
			  screen.wait(volume,40000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern(absPath+"\\PolandGames\\diamond\\ok4.png").similar(0.6);
			  screen.wait(ok,40000);
			  screen.click(ok);
			  
			  Pattern demo1 = new Pattern(absPath+"\\PolandGames\\diamond\\demo5.png").similar(0.6);
			  screen.wait(demo1,40000);
			  screen.click(demo1);
			  
			  Pattern auto = new Pattern(absPath+"\\PolandGames\\diamond\\auto6,11.png").similar(0.6);
			  screen.wait(auto,40000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern moneyplay = new Pattern(absPath+"\\PolandGames\\diamond\\moneyplay8.png").similar(0.6);
			  screen.wait(moneyplay,4000);
			  screen.click(moneyplay);
			  
			  Pattern home = new Pattern(absPath+"\\PolandGames\\diamond\\home7.png").similar(0.6);
			  screen.wait(home,40000);
			  screen.click(home);
			  
			  js.executeScript("window.scrollBy(0,0)", "");
	  }
	 @Test()
	  public void Egypt() throws FindFailed, InterruptedException {
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
		  Thread.sleep(5000);
		  
		  Screen screen = new Screen();
//		  Pattern diamond = new Pattern(absPath+"\\PolandGames\\Egypt\\image1.png");
//		  screen.wait(diamond,40000);
//		  screen.click(diamond);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[12]/img")).click();
		  
		  Thread.sleep(15000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,600)", "");
		  
		  Pattern demo = new Pattern(absPath+"\\PolandGames\\Egypt\\demo2.png").similar(0.6);
		  screen.wait(demo,40000); 
		  screen.click(demo);
		  
		  Pattern volume = new Pattern(absPath+"\\PolandGames\\Egypt\\sound3.png").similar(0.6);
		  screen.wait(volume,40000);
		  screen.click(volume);
		  
		  Pattern ok = new Pattern(absPath+"\\PolandGames\\Egypt\\ok4.png").similar(0.6);
		  screen.wait(ok,40000);
		  screen.click(ok);
		  
		  Pattern demo1 = new Pattern(absPath+"\\PolandGames\\Egypt\\demo5.png").similar(0.6);
		  screen.wait(demo1,40000);
		  screen.click(demo1);
		  
		  Pattern auto = new Pattern(absPath+"\\PolandGames\\Egypt\\auto6.png").similar(0.6);
		  screen.wait(auto,40000);
		  screen.click(auto);
		  Thread.sleep(3000);
		  
		  Pattern tryAgain = new Pattern(absPath+"\\PolandGames\\Egypt\\demo7.png").similar(0.6);
		  screen.wait(tryAgain,40000);
		  Thread.sleep(15000);
		  
		  Pattern home = new Pattern(absPath+"\\PolandGames\\Egypt\\home8.png").similar(0.6);
		  screen.wait(home,40000);
		  screen.click(home);
		  
		  js.executeScript("window.scrollBy(0,0)", "");
	}
	  @Test()
	  public void goldRush() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern(absPath+"\\PolandGames\\goldRush\\image1.png");
//			  screen.wait(diamond,40000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[5]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern(absPath+"\\PolandGames\\goldRush\\demo2.png").similar(0.6);
			  screen.wait(demo,40000); 
			  screen.click(demo);
			  
			  Pattern volume = new Pattern(absPath+"\\PolandGames\\goldRush\\sound3.png").similar(0.6);
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern(absPath+"\\PolandGames\\goldRush\\ok4.png").similar(0.6);
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern demo1 = new Pattern(absPath+"\\PolandGames\\goldRush\\demo5.png").similar(0.6);
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  
			  Pattern auto = new Pattern(absPath+"\\PolandGames\\goldRush\\auto6.png").similar(0.6);
			  screen.wait(auto,5000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern tryAgain = new Pattern(absPath+"\\PolandGames\\goldRush\\demo7.png").similar(0.6);
			  screen.wait(tryAgain,40000);
			  
			  Pattern home = new Pattern(absPath+"\\PolandGames\\goldRush\\home8.png").similar(0.6);
			  screen.wait(home,5000);
			  screen.click(home);
			  
			  js.executeScript("window.scrollBy(0,0)", "");
	  }
	  @Test()
	  public void Card5() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,200)", "");
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern(absPath+"\\PolandGames\\5card\\image1.png");
//			  screen.wait(diamond,5000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[8]/img")).click();
			  
			  Thread.sleep(15000);
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern(absPath+"\\PolandGames\\5card\\demo2.png").similar(0.6);
			  screen.wait(demo,40000); 
			  screen.click(demo);
			  
			  Pattern volume = new Pattern(absPath+"\\PolandGames\\5card\\sound3.png").similar(0.6);
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern(absPath+"\\PolandGames\\5card\\ok4.png").similar(0.6);
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern demo1 = new Pattern(absPath+"\\PolandGames\\5card\\demo5.png").similar(0.6);
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern(absPath+"\\PolandGames\\5card\\auto6.png").similar(0.6);
			  screen.wait(auto,5000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern tryAgain = new Pattern(absPath+"\\PolandGames\\5card\\demo7.png").similar(0.6);
			  screen.wait(tryAgain,40000);
			  
			  Pattern home = new Pattern(absPath+"\\PolandGames\\5card\\home8.png").similar(0.6);
			  screen.wait(home,5000);
			  screen.click(home);
			  
			  js.executeScript("window.scrollBy(0,0)", "");
	  }
	  @Test()
	  public void Bombki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern(absPath+"\\PolandGames\\Christmas balls\\image1.png").similar(0.6);
			  screen.wait(diamond,5000);
			  screen.click(diamond);
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern(absPath+"\\PolandGames\\Christmas balls\\demo2.png").similar(0.6);
			  screen.wait(demo,40000); 
			  screen.click(demo);
			  
			  Pattern volume = new Pattern(absPath+"\\PolandGames\\Christmas balls\\sound3.png").similar(0.6);
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern(absPath+"\\PolandGames\\Christmas balls\\ok4.png").similar(0.6);
			  screen.wait(ok,40000); 
			  screen.click(ok);
			  
			  Pattern demo1 = new Pattern(absPath+"\\PolandGames\\Christmas balls\\demo5.png").similar(0.6);
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern(absPath+"\\PolandGames\\Christmas balls\\auto6.png").similar(0.6);
			  screen.wait(auto,5000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern tryAgain = new Pattern(absPath+"\\PolandGames\\Christmas balls\\demo7.png").similar(0.6);
			  screen.wait(tryAgain,40000);
			  
			  Pattern home = new Pattern(absPath+"\\PolandGames\\Christmas balls\\home8.png").similar(0.6);
			  screen.wait(home,5000);
			  screen.click(home);
			  
			  js.executeScript("window.scrollBy(0,0)", "");
	  }
	  
	  @Test()
	  public void Cyferki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern(absPath+"\\PolandGames\\Cyferki\\image1.png");
//			  screen.wait(diamond,5000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[10]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern(absPath+"\\PolandGames\\Cyferki\\demo2.png").similar(0.6);
			  screen.wait(demo,5000); 
			  screen.click(demo);
			  
			  Pattern volume = new Pattern(absPath+"\\PolandGames\\Cyferki\\sound3.png").similar(0.6);
			  screen.wait(volume,40000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern(absPath+"\\PolandGames\\Cyferki\\ok4.png").similar(0.6);
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern demo1 = new Pattern(absPath+"\\PolandGames\\Cyferki\\demo5.png").similar(0.6);
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern(absPath+"\\PolandGames\\Cyferki\\try6.png").similar(0.6);
			  screen.wait(auto,40000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern start = new Pattern(absPath+"\\PolandGames\\Cyferki\\start7.png").similar(0.6);
			  screen.wait(start,40000);
			  screen.click(start);
			  Thread.sleep(3000);
			  
			  Pattern tryAgain = new Pattern(absPath+"\\PolandGames\\Cyferki\\try8.png").similar(0.6);
			  screen.wait(tryAgain,40000);
			  
			  Pattern home = new Pattern(absPath+"\\PolandGames\\Cyferki\\home9.png").similar(0.6);
			  screen.wait(home,40000);
			  screen.click(home);
			  
			  js.executeScript("window.scrollBy(0,0)", "");
	  }
	  
	  @Test()
	  public void Antyki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern(absPath+"\\PolandGames\\Antyki\\image1.png");
//			  screen.wait(diamond,40000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[11]/img")).click();

			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern(absPath+"\\PolandGames\\Antyki\\demo2.png").similar(0.6);
			  screen.wait(demo,5000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern(absPath+"\\PolandGames\\Antyki\\sound3.png").similar(0.6);
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern demo1 = new Pattern(absPath+"\\PolandGames\\Antyki\\demo4.png").similar(0.6);
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern(absPath+"\\PolandGames\\Antyki\\auto5.png").similar(0.6);
			  screen.wait(auto,5000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern demo2 = new Pattern(absPath+"\\PolandGames\\Antyki\\demo6.png").similar(0.6);
			  screen.wait(demo2,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern(absPath+"\\PolandGames\\Antyki\\home7.png").similar(0.6);
			  screen.wait(home,5000);
			  screen.click(home);
			  
			  js.executeScript("window.scrollBy(0,0)", "");
	  }
	  @Test()
	  public void Duszki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern(absPath+"\\PolandGames\\Duszki\\image1.png");
//			  screen.wait(diamond,5000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[13]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern(absPath+"\\PolandGames\\Duszki\\demo2.png").similar(0.6);
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern(absPath+"\\PolandGames\\Duszki\\sound3.png").similar(0.6);
			  screen.wait(volume,40000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern(absPath+"\\PolandGames\\Duszki\\ok4.png").similar(0.6);
			  screen.wait(ok,40000);
			  screen.click(ok);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern(absPath+"\\PolandGames\\Duszki\\demo5.png").similar(0.5);
			  screen.wait(demo1,40000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern auto = new Pattern(absPath+"\\PolandGames\\Duszki\\auto6.png").similar(0.6);
			  screen.wait(auto,40000);
			  Thread.sleep(3000);
			  screen.click();
			  
			  Pattern demo2 = new Pattern(absPath+"\\PolandGames\\Duszki\\demo7.png").similar(0.5);
			  screen.wait(demo2,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern(absPath+"\\PolandGames\\Duszki\\home8.png").similar(0.6);
			  screen.wait(home,40000);
			  screen.click(home);
			  
			  js.executeScript("window.scrollBy(0,0)", "");
	  }
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
	  @Test()
	  public void Garniec() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern(absPath+"\\PolandGames\\GarniecZÅ‚ota\\image1.png");
//			  screen.wait(diamond,5000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[14]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern(absPath+"\\PolandGames\\GarniecZÅ‚ota\\demo2.png").similar(0.6);
			  screen.wait(demo,5000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern(absPath+"\\PolandGames\\GarniecZÅ‚ota\\sound3.png").similar(0.6);
			  screen.wait(volume,40000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern start = new Pattern(absPath+"\\PolandGames\\GarniecZÅ‚ota\\start3.png").similar(0.6);
			  screen.wait(start,5000);
			  screen.click(start);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern(absPath+"\\PolandGames\\GarniecZÅ‚ota\\demo4.png").similar(0.6);
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern auto = new Pattern(absPath+"\\PolandGames\\GarniecZÅ‚ota\\auto6.png").similar(0.6);
			  screen.wait(auto,5000);
			  Thread.sleep(3000);
			  screen.click();
			  
			  Pattern demo2 = new Pattern(absPath+"\\PolandGames\\GarniecZÅ‚ota\\demo7.png").similar(0.6);
			  screen.wait(demo2,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern(absPath+"\\PolandGames\\GarniecZÅ‚ota\\home8.png").similar(0.6);
			  screen.wait(home,5000);
			  screen.click(home);
			  
			  js.executeScript("window.scrollBy(0,0)", "");
	  }
	  @Test()
	  public void btyskothi() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern(absPath+"\\PolandGames\\btyskothi\\image1.png");
//			  screen.wait(diamond,5000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[16]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern(absPath+"\\PolandGames\\btyskothi\\demo2.png").similar(0.6);
			  screen.wait(demo,5000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern(absPath+"\\PolandGames\\btyskothi\\sound3.png").similar(0.6);
			  screen.wait(volume,40000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern start = new Pattern(absPath+"\\PolandGames\\btyskothi\\ok4.png").similar(0.6);
			  screen.wait(start,40000);
			  screen.click(start);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern(absPath+"\\PolandGames\\btyskothi\\demo5.png").similar(0.6);
			  screen.wait(demo1,40000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern demo2 = new Pattern(absPath+"\\PolandGames\\btyskothi\\demo7.png").similar(0.6);
			  screen.wait(demo2,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern(absPath+"\\PolandGames\\btyskothi\\home8.png").similar(0.6);
			  screen.wait(home,40000);
			  screen.click(home);  
			  js.executeScript("window.scrollBy(0,0)", "");
			  }
	  @Test()
	  public void gorki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern(absPath+"\\PolandGames\\gorki\\image1.png");
//			  screen.wait(diamond,5000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[17]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern(absPath+"\\PolandGames\\gorki\\demo2.png").similar(0.6);
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern(absPath+"\\PolandGames\\gorki\\sound3.png").similar(0.6);
			  screen.wait(volume,100000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern start = new Pattern(absPath+"\\PolandGames\\gorki\\ok4.png").similar(0.6);
			  screen.wait(start,5000);
			  screen.click(start);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern(absPath+"\\PolandGames\\gorki\\demo5.png").similar(0.6);
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern auto = new Pattern(absPath+"\\PolandGames\\gorki\\option6.png").similar(0.6);
			  screen.wait(auto,40000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern demo2 = new Pattern(absPath+"\\PolandGames\\gorki\\option7.png").similar(0.6);
			  screen.wait(demo2,40000);
			  screen.click(demo2);
			  Thread.sleep(3000);
			  
			  Pattern auto1 = new Pattern(absPath+"\\PolandGames\\gorki\\auto8.png").similar(0.6);
			  screen.wait(auto1,40000);
			  screen.click(auto1);
			  Thread.sleep(3000);
			  
			  Pattern tryagain = new Pattern(absPath+"\\PolandGames\\gorki\\tryagain9.png").similar(0.6);
			  screen.wait(tryagain,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern(absPath+"\\PolandGames\\gorki\\home10.png").similar(0.6);
			  screen.wait(home,5000);
			  screen.click(home);
			  js.executeScript("window.scrollBy(0,0)", "");
	  }
	  @Test()
	  public void emotki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern(absPath+"\\PolandGames\\emotki\\image1.png");
//			  screen.wait(diamond,5000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[18]/img")).click();
			  
			  Thread.sleep(15000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern(absPath+"\\PolandGames\\emotki\\demo2.png").similar(0.6);
			  screen.wait(demo,5000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern(absPath+"\\PolandGames\\emotki\\sound3.png").similar(0.6);
			  screen.wait(volume,100000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern start = new Pattern(absPath+"\\PolandGames\\emotki\\ok4.png").similar(0.6);
			  screen.wait(start,5000);
			  screen.click(start);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern(absPath+"\\PolandGames\\emotki\\demo5.png").similar(0.6);
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern auto1 = new Pattern(absPath+"\\PolandGames\\emotki\\auto6.png").similar(0.6);
			  screen.wait(auto1,5000);
			  screen.click(auto1);
			  Thread.sleep(3000);
			  
			  Pattern tryagain = new Pattern(absPath+"\\PolandGames\\emotki\\tryagain7.png").similar(0.6);
			  screen.wait(tryagain,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern(absPath+"\\PolandGames\\emotki\\home8.png").similar(0.6);
			  screen.wait(home,5000);
			  screen.click(home);
			  js.executeScript("window.scrollBy(0,0)", "");
	  }
	  @Test()
	  public void redPepperHot() throws InterruptedException, FindFailed {
			Thread.sleep(2000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,300)", "");
			  
			  Screen screen = new Screen();
//			  Pattern diamond = new Pattern(absPath+"\\PolandGames\\hotPepperPayout\\image1.png");
//			  screen.wait(diamond,5000);
//			  screen.click(diamond);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[20]/img")).click();
			  
			  Thread.sleep(15000);
			  //JavascriptExecutor js1 = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,200)", "");
			  
			  Pattern demo = new Pattern(absPath+"\\PolandGames\\hotPepperPayout\\demo2.png").similar(0.6);
			  screen.wait(demo,5000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern(absPath+"\\PolandGames\\hotPepperPayout\\sound3.png").similar(0.6);
			  screen.wait(volume,40000);
			  screen.click(volume);
			  
			  Pattern start = new Pattern(absPath+"\\PolandGames\\hotPepperPayout\\ok4.png").similar(0.6);
			  screen.wait(start,40000);
			  screen.click(start);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern(absPath+"\\PolandGames\\hotPepperPayout\\demo5.png").similar(0.6);
			  screen.wait(demo1,40000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern auto = new Pattern(absPath+"\\PolandGames\\hotPepperPayout\\auto6.png").similar(0.6);
			  screen.wait(auto,5000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern demo2 = new Pattern(absPath+"\\PolandGames\\hotPepperPayout\\demo7.png").similar(0.6);
			  screen.wait(demo2,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern(absPath+"\\PolandGames\\hotPepperPayout\\home8.png").similar(0.6);
			  screen.wait(home,5000);
			  screen.click(home);
			  js.executeScript("window.scrollBy(0,0)", "");
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
			  Pattern frontpage = new Pattern(absPath+"\\Polandlottery\\Kurki-fp.png").similar(0.6);
			  s3.wait(frontpage,1000);
			  s3.click(frontpage,1000);
			
			   Thread.sleep(5000);
			   js.executeScript("window. scrollBy(0,600)");
			  Pattern demo3 = new Pattern(absPath+"\\Polandlottery\\Kurki-demo.png").similar(0.6);
			  s3.wait(demo3,1000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern(absPath+"\\Polandlottery\\Kurki-audio.png").similar(0.6);
			  s3.wait(audio3,1000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern(absPath+"\\Polandlottery\\Kurki-ok.png").similar(0.6);
			  s3.wait(ok3,1000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern(absPath+"\\Polandlottery\\Kurki-increase.png").similar(0.6);
			  s3.wait(increase3 ,1000);
			  s3.click(increase3);
			  Pattern t3 = new Pattern(absPath+"\\Polandlottery\\Kurki-demobtn.png").similar(0.6);
			  s3.wait(t3,1000);
			  s3.click(t3);
			  Pattern ra3 = new Pattern(absPath+"\\Polandlottery\\Kurki-autobtn.png").similar(0.6);
			  s3.wait(ra3,1000);
			  s3.doubleClick(ra3);
			  Thread.sleep(5000);
			  Pattern home3 = new Pattern(absPath+"\\Polandlottery\\Tot-try-home.png").similar(0.6);
			  s3.wait(home3,1000);
			  s3.click(home3);
			  js.executeScript("window.scrollBy(0,0)", "");
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
			  Pattern fp = new Pattern(absPath+"\\Polandlottery\\Tot-fp.png").similar(0.6);
			  s.wait(fp,30000);
			  s.click(fp);
			  Thread.sleep(5000);
			  js.executeScript("window. scrollBy(0,600)");
			  Pattern demo = new Pattern(absPath+"\\Polandlottery\\Tot-demo.png").similar(0.6);
			  		  s.wait(demo,1000);
			  s.click(demo);
			  Pattern audio = new Pattern(absPath+"\\Polandlottery\\Tot-try-Audio.png").similar(0.6);
			  s.wait(audio,1000);
			  s.click(audio);
			  Pattern ok = new Pattern(absPath+"\\Polandlottery\\Tot-ok.png").similar(0.6);
			  s.wait(ok,1000);
			  s.click(ok);
			  Pattern increase = new Pattern(absPath+"\\Polandlottery\\Tot-increase.png").similar(0.6);
			  s.wait(increase ,1000);
			  s.click(increase);
			  Pattern t = new Pattern(absPath+"\\Polandlottery\\Tot-demobutton.png").similar(0.6);
			  s.wait(t,1000);
			  s.click(t);
			  Pattern ra = new Pattern(absPath+"\\Polandlottery\\Tot-try-revealall.png").similar(0.6);
			  s.wait(ra,5000);
			  s.click(ra);
			  Pattern home = new Pattern(absPath+"\\Polandlottery\\Tot-try-home.png").similar(0.6);
			  s.wait(home,5000);
			  s.click(home);
			  js.executeScript("window.scrollBy(0,0)", "");
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
			  Pattern fp = new Pattern(absPath+"\\Polandlottery\\Skrzynki-fp.png").similar(0.6);
			  s1.wait(fp,30000);
			  s1.click(fp);
			  Thread.sleep(5000);
			  		  js.executeScript("window. scrollBy(0,600)");
			   Thread.sleep(5000);
			  Pattern demo1 = new Pattern(absPath+"\\Polandlottery\\Skrzynki-demo.png").similar(0.6);
			  s1.wait(demo1,1000);
			  s1.click(demo1);
			  Pattern audio1 = new Pattern(absPath+"\\Polandlottery\\Skrzynki-audio.png").similar(0.6);
			  s1.wait(audio1,1000);
			  s1.doubleClick(audio1);
			  Pattern ok1 = new Pattern(absPath+"\\Polandlottery\\Skrzynki-ok.png").similar(0.6);
			  s1.wait(ok1,1000);
			  s1.click(ok1);
			  Pattern increase1 = new Pattern(absPath+"\\Polandlottery\\Skrzynki-increase.png").similar(0.6);
			  s1.wait(increase1 ,1000);
			  s1.click(increase1);
			  Pattern t1 = new Pattern(absPath+"\\Polandlottery\\Skrzynki-demobtn.png").similar(0.6);
			  s1.wait(t1,1000);
			  s1.click(t1);
			  Pattern ra1 = new Pattern(absPath+"\\Polandlottery\\Skrzynki-autoreveal.png").similar(0.6);
			  s1.wait(ra1,1000);
			  s1.doubleClick(ra1);
			  Pattern home1 = new Pattern(absPath+"\\Polandlottery\\Tot-try-home.png").similar(0.6);
			  s1.wait(home1,1000);
			  s1.click(home1);
			  js.executeScript("window.scrollBy(0,0)", "");
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
			  Pattern fp = new Pattern(absPath+"\\Polandlottery\\kamyki-fp.png").similar(0.6);
			  s2.wait(fp,1000);
			  s2.click(fp);
			  Thread.sleep(5000);
			  js.executeScript("window. scrollBy(0,600)");
			   
			  Pattern demo2 = new Pattern(absPath+"\\Polandlottery\\kamyki-demo.png").similar(0.6);
			  s2.wait(demo2,1000);
			  s2.click(demo2);
			  Pattern audio2 = new Pattern(absPath+"\\Polandlottery\\kamyki-audio.png").similar(0.6);
			  s2.wait(audio2,1000);
			  s2.doubleClick(audio2);
			  Pattern ok2 = new Pattern(absPath+"\\Polandlottery\\kamyki-ok.png").similar(0.6);
			  s2.wait(ok2,1000);
			  s2.click(ok2);
			  Pattern increase2 = new Pattern(absPath+"\\Polandlottery\\kamyki-increase.png").similar(0.6);
			  s2.wait(increase2 ,1000);
			  s2.click(increase2);
			  Pattern t2 = new Pattern(absPath+"\\Polandlottery\\kamyki-demobtn.png").similar(0.6);
			  s2.wait(t2,1000);
			  s2.click(t2);
			  Pattern ra2 = new Pattern(absPath+"\\Polandlottery\\kamyki-demoauto.png").similar(0.6);
			  s2.wait(ra2,1000);
			  s2.doubleClick(ra2);
			  Pattern home2 = new Pattern(absPath+"\\Polandlottery\\Tot-try-home.png").similar(0.6);
			  s2.wait(home2,1000);
			  s2.click(home2);
			  js.executeScript("window.scrollBy(0,0)", "");
		 
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
			  Pattern fp = new Pattern(absPath+"\\Polandlottery\\siodemki-fp.png").similar(0.6);
			  s3.wait(fp,1000);
			  s3.click(fp);
			   Thread.sleep(5000);
			   js.executeScript("window. scrollBy(0,600)");
			  Pattern demo3 = new Pattern(absPath+"\\Polandlottery\\Siodemki-demo.png").similar(0.6);
			  s3.wait(demo3,1000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern(absPath+"\\Polandlottery\\Siodemki-Audio.png").similar(0.6);
			  s3.wait(audio3,1000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern(absPath+"\\Polandlottery\\Siodemki-ok.png").similar(0.6);
			  s3.wait(ok3,1000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern(absPath+"\\Polandlottery\\Siodemki-increase.png").similar(0.6);
			  s3.wait(increase3 ,1000);
			  s3.click(increase3);
			  Pattern t3 = new Pattern(absPath+"\\Polandlottery\\Siodemki-demobutton.png").similar(0.6);
			  s3.wait(t3,1000);
			  s3.click(t3);
			  Pattern ra3 = new Pattern(absPath+"\\Polandlottery\\Siodemki-autobtn.png").similar(0.6);
			  s3.wait(ra3,1000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern(absPath+"\\Polandlottery\\Tot-try-home.png").similar(0.6);
			  s3.wait(home3,1000);
			  s3.click(home3);
			  js.executeScript("window.scrollBy(0,0)", "");
			 
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
			  Pattern frontpage = new Pattern(absPath+"\\Polandlottery\\Gp-frontpage.png").similar(0.6);
			  s3.wait(frontpage,1000);
			  s3.click(frontpage);
		js.executeScript("window. scrollBy(0,600)");
			   Thread.sleep(5000);
			  Pattern demo3 = new Pattern(absPath+"\\Polandlottery\\gp-demo.png").similar(0.6);
			  s3.wait(demo3,1000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern(absPath+"\\Polandlottery\\gp-audio.png").similar(0.6);
			  s3.wait(audio3,1000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern(absPath+"\\Polandlottery\\gp-ok.png").similar(0.6);
			  s3.wait(ok3,1000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern(absPath+"\\Polandlottery\\gp-increase.png").similar(0.6);
			  s3.wait(increase3 ,1000);
			  s3.click(increase3);
			  Pattern t3 = new Pattern(absPath+"\\Polandlottery\\gp-demobtn.png").similar(0.6);
			  s3.wait(t3,1000);
			  s3.click(t3);
			  Pattern ra3 = new Pattern(absPath+"\\Polandlottery\\gp-autobtn.png").similar(0.6);
			  s3.wait(ra3,1000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern(absPath+"\\Polandlottery\\Tot-try-home.png").similar(0.6);
			  s3.wait(home3,1000);
			  s3.click(home3);
			  js.executeScript("window.scrollBy(0,0)", "");
			 
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
			  Pattern frontpage = new Pattern(absPath+"\\Polandlottery\\Owocki-fp.png").similar(0.6);
			  s3.wait(frontpage,10000);
			  s3.click(frontpage);
		js.executeScript("window. scrollBy(0,600)");
			   Thread.sleep(5000);
			  Pattern demo3 = new Pattern(absPath+"\\Polandlottery\\Owocki-demo.png").similar(0.6);
			  s3.wait(demo3,10000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern(absPath+"\\Polandlottery\\Owocki-audio.png").similar(0.6);
			  s3.wait(audio3,10000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern(absPath+"\\Polandlottery\\Owocki-ok.png").similar(0.6);
			  s3.wait(ok3,10000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern(absPath+"\\Polandlottery\\Owocki-increase.png").similar(0.6);
			  s3.wait(increase3 ,10000);
			  s3.click(increase3);
			  Pattern t3 = new Pattern(absPath+"\\Polandlottery\\Owocki-demobtn.png").similar(0.6);
			  s3.wait(t3,10000);
			  s3.click(t3);
			  Pattern ra3 = new Pattern(absPath+"\\Polandlottery\\Owocki-autobtn.png").similar(0.6);
			  s3.wait(ra3,10000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern(absPath+"\\Polandlottery\\Tot-try-home.png").similar(0.6);
			  s3.wait(home3,10000);
			  s3.click(home3);
			  js.executeScript("window.scrollBy(0,0)", "");
			 
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
			  Pattern frontpage = new Pattern(absPath+"\\Polandlottery\\Gwiazdki-fp.png").similar(0.6);
			  s3.wait(frontpage,10000);
			  s3.click(frontpage);
		js.executeScript("window. scrollBy(0,600)");
			   Thread.sleep(5000);
			  Pattern demo3 = new Pattern(absPath+"\\Polandlottery\\Gwiazdki-demo.png").similar(0.6);
			  s3.wait(demo3,10000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern(absPath+"\\Polandlottery\\Gwiazdki-audio.png").similar(0.6);
			  s3.wait(audio3,10000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern(absPath+"\\Polandlottery\\Gwiazdki-ok.png").similar(0.6);
			  s3.wait(ok3,10000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern(absPath+"\\Polandlottery\\Gwiazdki-increase.png").similar(0.6);
			  s3.wait(increase3 ,10000);
			  s3.click(increase3);
			  Pattern t3 = new Pattern(absPath+"\\Polandlottery\\Gwiazdki-demobtn.png").similar(0.6);
			  s3.wait(t3,10000);
			  s3.click(t3);
			  Pattern ra3 = new Pattern(absPath+"\\Polandlottery\\Gwiazdki-autobtn.png").similar(0.6);
			  s3.wait(ra3,10000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern(absPath+"\\Polandlottery\\Tot-try-home.png").similar(0.6);
			  s3.wait(home3,10000);
			  s3.click(home3);
			  js.executeScript("window.scrollBy(0,0)", "");
			 
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
			  Pattern frontpage = new Pattern(absPath+"\\Polandlottery\\krzyowki-fp.png").similar(0.6);
			  s3.wait(frontpage,10000);
			  s3.click(frontpage);
		js.executeScript("window. scrollBy(0,600)");
			   Thread.sleep(5000);
			  Pattern demo3 = new Pattern(absPath+"\\Polandlottery\\krzyowki-demo.png").similar(0.6);
			  s3.wait(demo3,10000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern(absPath+"\\Polandlottery\\krzyowki-audio.png").similar(0.6);
			  s3.wait(audio3,10000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern(absPath+"\\Polandlottery\\krzyowki-ok.png").similar(0.6);
			  s3.wait(ok3,10000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern(absPath+"\\Polandlottery\\krzyowki-increase.png").similar(0.6);
			  s3.wait(increase3 ,10000);
			  s3.click(increase3);
			  Pattern t3 = new Pattern(absPath+"\\Polandlottery\\krzyowki-demobtn.png").similar(0.6);
			  s3.wait(t3,10000);
			  s3.click(t3);
			  Pattern ra3 = new Pattern(absPath+"\\Polandlottery\\krzyowki-autobtn.png").similar(0.6);
			  s3.wait(ra3,10000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern(absPath+"\\Polandlottery\\Tot-try-home.png").similar(0.6);
			  s3.wait(home3,10000);
			  s3.click(home3);
			  js.executeScript("window.scrollBy(0,0)", "");
			 
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
			  Pattern frontpage = new Pattern(absPath+"\\Polandlottery\\monetki-fp.png").similar(0.6);
			  s3.wait(frontpage,10000);
			  s3.click(frontpage);
		js.executeScript("window. scrollBy(0,600)");
			   Thread.sleep(5000);
			  Pattern demo3 = new Pattern(absPath+"\\Polandlottery\\monetki-demo.png").similar(0.6);
			  s3.wait(demo3,10000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern(absPath+"\\Polandlottery\\monetki-audio.png").similar(0.6);
			  s3.wait(audio3,10000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern(absPath+"\\Polandlottery\\monetki-ok.png").similar(0.6);
			  s3.wait(ok3,10000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern(absPath+"\\Polandlottery\\monetki-increase.png").similar(0.6);
			  s3.wait(increase3 ,10000);
			  s3.click(increase3);
			  Pattern t3 = new Pattern(absPath+"\\Polandlottery\\monetki-demobtn.png").similar(0.6);
			  s3.wait(t3,10000);
			  s3.click(t3);
			  Pattern ra3 = new Pattern(absPath+"\\Polandlottery\\monetki-autobtn.png").similar(0.6);
			  s3.wait(ra3,10000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern(absPath+"\\Polandlottery\\Tot-try-home.png").similar(0.6);
			  s3.wait(home3,10000);
			  s3.click(home3);
			  js.executeScript("window.scrollBy(0,0)", "");
		}
		@Test
		//11
		 public void znaczki () throws InterruptedException, FindFailed {
			driver.quit();  
			WebDriverManager.edgedriver().setup();
			  EdgeOptions edgeOptions = new EdgeOptions();
			  String addproxy1 = "http://hybrid-web.cluster-a.blackspider.com";
			  Proxy proxy1 = new Proxy();
			  proxy1.setHttpProxy(addproxy1);//http
			  proxy1.setSslProxy(addproxy1);//secure socket layer
			  edgeOptions.setCapability("proxy", proxy1);
			  driver = new EdgeDriver(edgeOptions);
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(5000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window. scrollBy(500,500)");
			  Screen s3 = new Screen();
			  Pattern frontpage = new Pattern(absPath+"\\Polandlottery\\znaczki-fp.png").similar(0.6);
			  s3.wait(frontpage,10000);
			  s3.click(frontpage);
		js.executeScript("window. scrollBy(0,600)");
			   Thread.sleep(5000);
			  Pattern demo3 = new Pattern(absPath+"\\Polandlottery\\Znaczki-demo.png").similar(0.6);
			  s3.wait(demo3,10000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern(absPath+"\\Polandlottery\\Znaczki-audio.png").similar(0.6);
			  s3.wait(audio3,10000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern(absPath+"\\Polandlottery\\Znaczki-ok.png").similar(0.6);
			  s3.wait(ok3,10000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern(absPath+"\\Polandlottery\\Znaczki-increase.png").similar(0.6);
			  s3.wait(increase3 ,10000);
			  s3.click(increase3);
			  Pattern t3 = new Pattern(absPath+"\\Polandlottery\\Znaczki-demobtn.png").similar(0.6);
			  s3.wait(t3,10000);
			  s3.click(t3);
			  Pattern ra3 = new Pattern(absPath+"\\Polandlottery\\Znaczki-auto.png").similar(0.6);
			  s3.wait(ra3,10000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern(absPath+"\\Polandlottery\\Tot-try-home.png").similar(0.6);
			  s3.wait(home3,10000);
			  s3.click(home3);
			  js.executeScript("window.scrollBy(0,0)", "");
			 
		}

  @AfterTest
  public void afterMethod() {
	  driver.close();
  }

}
