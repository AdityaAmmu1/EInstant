package PLLottery;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;

public class BuyGames1{
	public static WebDriver driver;
	static String filePath = "Rgsimages";
	static File file = new File(filePath);
	static String absPath = file.getAbsolutePath();
	
	 @BeforeTest
	  public void beforeMethod() throws InterruptedException, FindFailed {
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
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#__layout > div > div.layout-home > div.cookie-wall.active > div > div > div.action-control.type1 > button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/button/div[2]/span")).click();
			Thread.sleep(1000);
			//entering uid
			driver.findElement(By.xpath("//*[@id=\"username-dropdown-login\"]")).sendKeys("Mrosin80");
			//entering password
			driver.findElement(By.xpath("//*[@id=\"password-dropdown-login\"]")).sendKeys("Welcome1");
			System.out.println("login button");
			Screen screen1 = new Screen();
			Pattern submit = new Pattern(absPath+"\\PolandGames\\submit.png");
			screen1.wait(submit,40000);
			screen1.click(submit);
			Thread.sleep(10000);
			Screen s2= new Screen();
			if(s2.exists(absPath+"\\zamknij.png")!= null){
				Pattern zamknij = new Pattern(absPath+"\\zamknij.png").similar(0.7);
				s2.wait(zamknij,40000);
				s2.click(zamknij);
				}
		}
	 @Test
	 public void ss() throws InterruptedException, FindFailed {
		 driver.findElement(By.xpath("//*[@id=\\\"__layout\\\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[2]")).click();
		 Thread.sleep(15000);
		 Screen s = new Screen();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,550)", "");
		Pattern demo = new Pattern(absPath+"\\PolandGames\\Grzmiąca Fortuna\\GF-Demo.png").similar(0.7);
		s.wait(demo,40000);
		s.click(demo);
		Pattern FP = new Pattern(absPath+"\\Smocze Skarby\\FP.png").similar(0.7);
		s.wait(FP,40000);
		s.click(FP);
		/*
		Pattern audio = new Pattern(absPath+"\\PolandGames\\Grzmiąca Fortuna\\GF-Audio.png").similar(0.7);
		s.wait(audio,40000);
		s.click(audio);
		Pattern demobtn = new Pattern(absPath+"\\PolandGames\\Smocze Skarby\\demobtn.png").similar(0.5);
		s.wait(demobtn,40000);
		s.click(demobtn);
		*/
		Thread.sleep(2000);
		Pattern settings= new Pattern(absPath+"\\PolandGames\\Smocze Skarby\\setting.png").similar(0.5);
		s.wait(settings,40000);
		s.click(settings);
		Thread.sleep(1000);
		Pattern mtm= new Pattern(absPath+"\\PolandGames\\Smocze Skarby\\mtm.png").similar(0.5);
		s.wait(mtm,40000);
		s.click(mtm);
		Thread.sleep(2000);
		Pattern buy= new Pattern(absPath+"\\PolandGames\\Smocze Skarby\\place.png").similar(0.5);
		s.wait(buy,40000);
		s.click(buy);
		s.wait(buy,40000);
		s.click(absPath+"\\PolandGames\\home.png");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(1000,0)");	
		 }
	 @Test
		public void stowka() throws FindFailed, InterruptedException{
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[3]")).click();
			Thread.sleep(15000);
			 Screen s = new Screen();
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,550)", "");
			Pattern demo = new Pattern(absPath+"\\PolandGames\\Grzmiąca Fortuna\\GF-Demo.png").similar(0.7);
			s.wait(demo,40000);
			s.click(demo);
			Pattern FP = new Pattern(absPath+"\\PolandGames\\Słówka\\FP.png").similar(0.7);
			s.wait(FP,40000);
			s.click(FP);
			Pattern audio = new Pattern(absPath+"\\PolandGames\\Grzmiąca Fortuna\\GF-Audio.png").similar(0.7);
			s.wait(audio,40000);
			s.click(audio);
			/*Pattern demobtn = new Pattern(absPath+"\\PolandGames\\Słówka\\demobtn.png").similar(0.5);
			s.wait(demobtn,40000);
			s.click(demobtn);
			Thread.sleep(2000);
			Pattern auto = new Pattern(absPath+"\\PolandGames\\Słówka\\auto.png").similar(0.5);
			s.wait(auto,40000);
			s.click(auto);*/
			Thread.sleep(1000);
			Pattern settings= new Pattern(absPath+"\\PolandGames\\Słówka\\setting.png").similar(0.5);
			s.wait(settings,40000);
			s.click(settings);
			Thread.sleep(1000);
			Pattern mtm= new Pattern(absPath+"\\PolandGames\\Słówka\\mtm.png").similar(0.5);
			s.wait(mtm,40000);
			s.click(mtm);
			Thread.sleep(2000);
			Pattern buy= new Pattern(absPath+"\\PolandGames\\Słówka\\place.png").similar(0.5);
			s.wait(buy,40000);
			s.click(buy);
			Pattern auto1= new Pattern(absPath+"\\PolandGames\\Słówka\\autobuy.png\\").similar(0.5);
			s.wait(auto1,40000);
			s.click(auto1);
			Thread.sleep(2000);
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
			 JavascriptExecutor js = (JavascriptExecutor) driver;
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
			/*Pattern demobtn1 = new Pattern(absPath+"\\PolandGames\\Grzmiąca Fortuna\\GF-Demobtn.png").similar(0.5);
			s21.wait(demobtn1,40000);
			s21.click(demobtn1);
			Pattern auto1 = new Pattern(absPath+"\\PolandGames\\Grzmiąca Fortuna\\GF-auto.png").similar(0.5);
			s21.wait(auto1,40000);
			s21.click(auto1);*/
			Pattern settings1= new Pattern(absPath+"\\PolandGames\\Grzmiąca Fortuna\\settings.png").similar(0.5);
			s21.wait(settings1,40000);
			s21.click(settings1);
			Thread.sleep(1000);
			Pattern mtm1= new Pattern(absPath+"\\PolandGames\\Grzmiąca Fortuna\\mtm.png").similar(0.5);
			s21.wait(mtm1,40000);
			s21.click(mtm1);
			Thread.sleep(2000);
			Pattern buy1= new Pattern(absPath+"\\PolandGames\\Grzmiąca Fortuna\\place.png").similar(0.5);
			s21.wait(buy1,40000);
			s21.click(buy1);
			Thread.sleep(2000);
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
			 JavascriptExecutor js = (JavascriptExecutor) driver;
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
			/*Pattern demobtn3 = new Pattern(absPath+"\\PolandGames\\HP\\demobtn.png").similar(0.5);
			s3.wait(demobtn3,40000);
			s3.click(demobtn3);*/
			Thread.sleep(2000);
			Pattern settings3= new Pattern(absPath+"\\PolandGames\\HP\\settings.png").similar(0.5);
			s3.wait(settings3,40000);
			s3.click(settings3);
			Thread.sleep(1000);
			Pattern mtm3= new Pattern(absPath+"\\PolandGames\\HP\\mtm.png").similar(0.5);
			s3.wait(mtm3,40000);
			s3.click(mtm3);
			Thread.sleep(2000);
			Pattern buy3= new Pattern(absPath+"\\PolandGames\\HP\\placebtn.png").similar(0.5);
			s3.wait(buy3,40000);
			s3.click(buy3);
			Thread.sleep(2000);
			s3.click(absPath+"\\PolandGames\\home.png");
			Thread.sleep(4000);
			js.executeScript("window.scrollBy(1000,0)");	
		}

	@Test()
	  public void Diamond() throws InterruptedException, FindFailed {
			  
		Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
		  Thread.sleep(5000);
		  
		  Screen screen = new Screen();
//		  Pattern diamond = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\diamond\\image1.png");
//		  screen.wait(diamond,40000);
//		  screen.click(diamond);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[7]/img")).click();
		  
		  Thread.sleep(15000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,500)", "");
		  
		  Pattern demo = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\diamond\\demo2.png");
		  screen.wait(demo,5000);
		  screen.click(demo);
		  
		  Pattern volume = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\diamond\\volume3.png");
		  screen.wait(volume,40000);
		  screen.click(volume);
		  
		  Pattern ok = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\diamond\\ok4.png");
		  screen.wait(ok,5000);
		  screen.click(ok);
		  
		  Pattern switch8 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\diamond\\switch8.png");
		  screen.wait(switch8,5000);
		  screen.click(switch8);
		  
		  Pattern realPlay = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\diamond\\realPlay6.png");
		  screen.wait(realPlay,40000);
		  screen.click(realPlay);
		  
		  Pattern auto = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\diamond\\auto7.png");
		  screen.wait(auto,40000);
		  screen.click(auto);
		  Thread.sleep(10000);
		  
		  Pattern realPlay1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\diamond\\realPlay7.png");
		  screen.wait(realPlay1,40000);
		  
		  Pattern home = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\diamond\\home8.png");
		  screen.wait(home,40000);
		  screen.click(home);
	  }
	 @Test()
	  public void Egypt() throws FindFailed, InterruptedException {
		 Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
		  Thread.sleep(5000);
		  
		  Screen screen = new Screen();
//		  Pattern diamond = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Egypt\\image1.png");
//		  screen.wait(diamond,40000);
//		  screen.click(diamond);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[12]/img")).click();
		  
		  Thread.sleep(15000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,600)", "");
		  
		  Pattern demo = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Egypt\\demo2.png");
		  screen.wait(demo,40000);
		  screen.click(demo);
		  
		  Pattern volume = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Egypt\\sound3.png");
		  screen.wait(volume,5000);
		  Thread.sleep(2000);
		  screen.click(volume);
		  
		  Pattern ok = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Egypt\\ok4.png");
		  screen.wait(ok,5000);
		  screen.click(ok);
		  
		  Pattern switch1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Egypt\\switch5.png");
		  screen.wait(switch1,5000);
		  screen.click(switch1);
		  Thread.sleep(3000);
		  
		  Pattern ok1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Egypt\\ok4.png");
		  screen.wait(ok,5000);
		  screen.click(ok1);
		  
		  Pattern reduce = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Egypt\\reduce6.png");
		  screen.wait(reduce,5000);
		  screen.click(reduce);
		  Thread.sleep(3000);
		  
		  Pattern play = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Egypt\\place7.png");
		  screen.wait(play,40000);
		  screen.click(play);
		  Thread.sleep(3000);
		  
		  Pattern auto = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Egypt\\auto8.png");
		  screen.wait(auto,40000);
		  screen.click(auto);
		  Thread.sleep(3000);
		  
		  
		  Pattern play2 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Egypt\\place9.png");
		  screen.wait(play2,5000);

		  Pattern home = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Egypt\\home10.png");
		  screen.wait(home,5000);
		  screen.click(home);
		  
		  js.executeScript("window.scrollBy(0,0)", "");
	}
	  @Test()
	  public void goldRush() throws InterruptedException, FindFailed {
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
		  Thread.sleep(5000);
		  
		  Screen screen = new Screen();
//		  Pattern diamond = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\goldRush\\image1.png");
//		  screen.wait(diamond,40000);
//		  screen.click(diamond);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[5]/img")).click();
		  
		  Thread.sleep(15000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,600)", "");
		  
		  Pattern demo = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\goldRush\\demo2.png");
		  screen.wait(demo,40000); 
		  screen.click(demo);
		  
		  Pattern volume = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\goldRush\\sound3.png");
		  screen.wait(volume,5000);
		  Thread.sleep(2000);
		  screen.click(volume);
		  
		  Pattern ok = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\goldRush\\ok4.png");
		  screen.wait(ok,5000);
		  screen.click(ok);
		  
		  Pattern demo1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\goldRush\\switch5.png");
		  screen.wait(demo1,5000);
		  screen.click(demo1);
		  Thread.sleep(7000);
		  
		  Pattern reduce = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\goldRush\\reduce6.png");
		  screen.wait(reduce,5000);
		  screen.click(reduce);
		  Thread.sleep(3000);
		  
		  Pattern play = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\goldRush\\place7.png");
		  screen.wait(play,40000);
		  screen.click(play);
		  
		  Pattern auto3 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\goldRush\\auto8.png");
		  screen.wait(auto3,5000);
		  screen.click(auto3);
		  
		  Pattern play2 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\goldRush\\place9.png");
		  screen.wait(play2,5000);
		  Thread.sleep(15000);
		  
		  Pattern home = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\goldRush\\home8.png");
		  screen.wait(home,5000);
		  screen.click(home);
	      js.executeScript("window.scrollBy(0,0)", "");
	  }
	  @Test()
	  public void Card5() throws InterruptedException, FindFailed {
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
		  Thread.sleep(5000);
		  
		  Screen screen = new Screen();
//		  Pattern diamond = new Pattern(absPath+"\\PolandGames\\5card\\image1.png");
//		  screen.wait(diamond,40000);
//		  screen.click(diamond);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[8]/img")).click();
		  
		  Thread.sleep(15000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,600)", "");
		  
		  Pattern demo = new Pattern(absPath+"\\PolandGames\\5card\\demo2.png");
		  screen.wait(demo,40000);
		  screen.click(demo);
		  
		  Pattern volume = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\5card\\sound3.png");
		  screen.wait(volume,5000);
		  Thread.sleep(2000);
		  screen.click(volume);
		  
		  Pattern ok = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\5card\\ok4.png");
		  screen.wait(ok,5000);
		  screen.click(ok);
		  
		  Pattern demo1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\5card\\switch5.png");
		  screen.wait(demo1,5000);
		  screen.click(demo1);
		  Thread.sleep(7000);
		  
		  Pattern ok1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\5card\\ok4.png");
		  screen.wait(ok1,5000);
		  screen.click(ok1);
		  
		  Pattern reduce = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\5card\\reduce6.png");
		  screen.wait(reduce,5000);
		  screen.click(reduce);
		  Thread.sleep(3000);
		  
		  Pattern play = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\5card\\place7.png");
		  screen.wait(play,40000);
		  screen.click(play);
		  
		  Pattern auto3 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\5card\\auto8.png");
		  screen.wait(auto3,5000);
		  screen.click(auto3);
		  
		  Pattern play2 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\5card\\place9.png");
		  screen.wait(play2,5000);
		  
		  Pattern home = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\5card\\home10.png");
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
//		  Pattern diamond = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Christmas balls\\image1.png");
//		  screen.wait(diamond,40000);
//		  screen.click(diamond);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[9]/img")).click();
		  
		  Thread.sleep(15000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,600)", "");
		  
		  Pattern demo = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Christmas balls\\demo2.png");
		  screen.wait(demo,40000);
		  screen.click(demo);
		  
		  Pattern volume = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Christmas balls\\sound3.png");
		  screen.wait(volume,5000);
		  Thread.sleep(2000);
		  screen.click(volume);
		  
		  Pattern ok = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Christmas balls\\ok4.png");
		  screen.wait(ok,5000);
		  screen.click(ok);
		  
		  Pattern switch1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Christmas balls\\switch5.png");
		  screen.wait(switch1,5000);
		  screen.click(switch1);
		  Thread.sleep(3000);
		  
		  Pattern reduce = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Christmas balls\\reduce6.png");
		  screen.wait(reduce,5000);
		  screen.click(reduce);
		  Thread.sleep(3000);
		  
		  Pattern play = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Christmas balls\\place7.png");
		  screen.wait(play,40000);
		  screen.click(play);
		  Thread.sleep(3000);
		  
		  Pattern auto3 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Christmas balls\\auto8.png");
		  screen.wait(auto3,5000);
		  screen.click(auto3);
		  
		  Pattern play2 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Christmas balls\\place9.png");
		  screen.wait(play2,5000);
		  
		  Pattern home = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Christmas balls\\home10.png");
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
//		  Pattern diamond = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Cyferki\\image1.png");
//		  screen.wait(diamond,40000);
//		  screen.click(diamond);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[10]/img")).click();
		  
		  Thread.sleep(15000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,600)", "");
		  
		  Pattern demo = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Cyferki\\demo2.png");
		  screen.wait(demo,40000);
		  screen.click(demo);
		  
		  Pattern volume = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Cyferki\\sound3.png");
		  screen.wait(volume,5000);
		  Thread.sleep(2000);
		  screen.click(volume);
		  
		  Pattern ok = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Cyferki\\ok4.png");
		  screen.wait(ok,5000);
		  screen.click(ok);
		  
		  Pattern switch1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Cyferki\\switch5.png");
		  screen.wait(switch1,5000);
		  screen.click(switch1);
		  Thread.sleep(3000);
		  
		  Pattern ok1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Cyferki\\ok4.png");
		  screen.wait(ok1,5000);
		  screen.click(ok1);
		  
		  Pattern reduce = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Cyferki\\reduce6.png");
		  screen.wait(reduce,5000);
		  screen.click(reduce);
		  Thread.sleep(3000);
		  
		  Pattern play = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Cyferki\\place7.png");
		  screen.wait(play,40000);
		  screen.click(play);
		  Thread.sleep(3000);
		  
		  Pattern play1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Cyferki\\place8.png");
		  screen.wait(play1,40000);
		  screen.click(play1);
		  Thread.sleep(3000);
		  
		  Pattern start = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Cyferki\\start9.png");
		  screen.wait(start,40000);
		  screen.click(start);
		  Thread.sleep(3000);
		  
		  Pattern play2 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Cyferki\\place10.png");
		  screen.wait(play2,5000);

		  Pattern home = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Cyferki\\home11.png");
		  screen.wait(home,5000);
		  screen.click(home);
			  
			  js.executeScript("window.scrollBy(0,0)", "");
	  }
	  
	  @Test()
	  public void Antyki() throws InterruptedException, FindFailed {
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
		  Thread.sleep(5000);
		  
		  Screen screen = new Screen();
//		  Pattern diamond = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Antyki\\image1.png");
//		  screen.wait(diamond,40000);
//		  screen.click(diamond);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[11]/img")).click();
		  
		  Thread.sleep(15000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,600)", "");
		  
		  Pattern demo = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Antyki\\demo2.png");
		  screen.wait(demo,40000);
		  screen.click(demo);
		  
		  Pattern volume = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Antyki\\sound3.png");
		  screen.wait(volume,5000);
		  Thread.sleep(2000);
		  screen.click(volume);
		  
		  Pattern switch1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Antyki\\switch5.png");
		  screen.wait(switch1,5000);
		  screen.click(switch1);
		  Thread.sleep(3000);
		  
		  Pattern reduce = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Antyki\\reduce6.png");
		  screen.wait(reduce,5000);
		  screen.click(reduce);
		  Thread.sleep(3000);
		  
		  Pattern play = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Antyki\\place8.png");
		  screen.wait(play,40000);
		  screen.click(play);
		  Thread.sleep(3000);
		  
		  Pattern auto = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Antyki\\auto9.png");
		  screen.wait(auto,40000);
		  screen.click(auto);
		  Thread.sleep(3000);
		  
		  
		  Pattern play2 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Antyki\\place10.png");
		  screen.wait(play2,5000);

		  Pattern home = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Antyki\\home11.png");
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
//		  Pattern diamond = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Duszki\\image1.png");
//		  screen.wait(diamond,40000);
//		  screen.click(diamond);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[13]/img")).click();
		  
		  Thread.sleep(15000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,600)", "");
		  
		  Pattern demo = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Duszki\\demo2.png");
		  screen.wait(demo,40000);
		  screen.click(demo);
		  
		  Pattern volume = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Duszki\\sound3.png");
		  screen.wait(volume,5000);
		  Thread.sleep(2000);
		  screen.click(volume);
		  
		  Pattern ok1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Duszki\\ok4.png");
		  screen.wait(ok1,5000);
		  Thread.sleep(2000);
		  screen.click(ok1);
		  
		  Pattern switch1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Duszki\\switch5.png");
		  screen.wait(switch1,5000);
		  screen.click(switch1);
		  Thread.sleep(3000);
		  
		  Pattern reduce = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Duszki\\reduce6.png");
		  screen.wait(reduce,5000);
		  screen.click(reduce);
		  Thread.sleep(3000);
		  
		  Pattern play = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Duszki\\place7.png");
		  screen.wait(play,40000);
		  screen.click(play);
		  Thread.sleep(3000);
		  
		  Pattern auto = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Duszki\\auto8.png");
		  screen.wait(auto,40000);
		  screen.click(auto);
		  		  
		  Pattern play2 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Duszki\\place9.png");
		  screen.wait(play2,5000);

		  Pattern home = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\Duszki\\home10.png");
		  screen.wait(home,5000);
		  screen.click(home);
			  js.executeScript("window.scrollBy(0,0)", "");
	  }
	  @Test()
	  public void triplePlatinum() throws InterruptedException, FindFailed {
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
		  Thread.sleep(5000);
		  
		  Screen screen = new Screen();
//		  Pattern diamond = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\TriplePlatinum\\image1.png");
//		  screen.wait(diamond,40000);
//		  screen.click(diamond);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[15]/img")).click();
		  
		  Thread.sleep(15000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,600)", "");
		  
		  Pattern demo = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\TriplePlatinum\\demo2.png");
		  screen.wait(demo,40000);
		  screen.click(demo);
		  
		  Pattern volume = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\TriplePlatinum\\sound3.png");
		  screen.wait(volume,5000);
		  Thread.sleep(2000);
		  screen.click(volume);
		  
		  Pattern ok1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\TriplePlatinum\\ok4.png");
		  screen.wait(ok1,5000);
		  Thread.sleep(2000);
		  screen.click(ok1);
		  
		  Pattern switch1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\TriplePlatinum\\switch5.png");
		  screen.wait(switch1,5000);
		  screen.click(switch1);
		  Thread.sleep(3000);
		  
		  Pattern reduce = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\TriplePlatinum\\reduce6.png");
		  screen.wait(reduce,5000);
		  screen.click(reduce);
		  Thread.sleep(3000);
		  
		  Pattern play = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\TriplePlatinum\\play7.png");
		  screen.wait(play,40000);
		  screen.click(play);
		  Thread.sleep(3000);
		  
		  Pattern auto = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\TriplePlatinum\\auto8.png");
		  screen.wait(auto,40000);
		  screen.click(auto);
		  Thread.sleep(3000);
		  
		  
		  Pattern play2 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\TriplePlatinum\\play9.png");
		  screen.wait(play2,5000);

		  Pattern home = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\TriplePlatinum\\home10.png");
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
//		  Pattern diamond = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\image1.png");
//		  screen.wait(diamond,40000);
//		  screen.click(diamond);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[14]/img")).click();
		  
		  Thread.sleep(15000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,600)", "");
		  
		  Pattern demo = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\demo2.png");
		  screen.wait(demo,40000);
		  screen.click(demo);
		  
		  Pattern volume = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\sound3.png");
		  screen.wait(volume,5000);
		  Thread.sleep(2000);
		  screen.click(volume);
		  
		  Pattern ok1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\start4.png");
		  screen.wait(ok1,5000);
		  Thread.sleep(2000);
		  screen.click(ok1);
		  
		  Pattern setting = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\setting5.png");
		  screen.wait(setting,40000);
		  screen.click(setting);
		  
		  Pattern switch1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\switch6.png");
		  screen.wait(switch1,5000);
		  screen.click(switch1);
		  Thread.sleep(3000);
		  
		  Pattern reduce = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\reduce7.png");
		  screen.wait(reduce,5000);
		  screen.click(reduce);
		  Thread.sleep(3000);
		  
		  Pattern play = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\place8.png");
		  screen.wait(play,40000);
		  screen.click(play);
		  Thread.sleep(3000);
		  
		  Pattern auto = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\auto9.png");
		  screen.wait(auto,40000);
		  screen.click(auto);
		  		  
		  Pattern play2 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\place10.png");
		  screen.wait(play2,5000);

		  Pattern home = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\GarniecZÅ‚ota\\home11.png");
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
//		  Pattern diamond = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\btyskothi\\image1.png");
//		  screen.wait(diamond,40000);
//		  screen.click(diamond);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[16]/img")).click();
		  
		  Thread.sleep(15000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,600)", "");
		  
		  Pattern demo = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\btyskothi\\demo2.png");
		  screen.wait(demo,40000);
		  screen.click(demo);
		  
		  Pattern volume = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\btyskothi\\sound3.png");
		  screen.wait(volume,5000);
		  screen.click(volume);
		  
		  Pattern ok1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\btyskothi\\ok4.png");
		  screen.wait(ok1,5000);
		  Thread.sleep(2000);
		  screen.click(ok1);
		  
		  Pattern switch1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\btyskothi\\switch5.png");
		  screen.wait(switch1,5000);
		  screen.click(switch1);
		  Thread.sleep(3000);
		  
		  Pattern ok2 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\btyskothi\\ok4.png");
		  screen.wait(ok2,5000);
		  screen.click(ok2);
		  
		  Pattern reduce = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\btyskothi\\reduce6.png");
		  screen.wait(reduce,5000);
		  screen.click(reduce);
		  Thread.sleep(3000);
		  
		  Pattern play = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\btyskothi\\place7.png");
		  screen.wait(play,40000);
		  screen.click(play);
		  Thread.sleep(3000);
		  		  
		  Pattern play2 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\btyskothi\\place8.png");
		  screen.wait(play2,5000);
		  Thread.sleep(15000);

		  Pattern home = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\btyskothi\\home9.png");
		  screen.wait(home,5000);
		  screen.click(home);
			  js.executeScript("window.scrollBy(0,0)", "");
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
//		  Pattern diamond = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\gorki\\image1.png");
//		  screen.wait(diamond,40000);
//		  screen.click(diamond);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[17]/img")).click();
		  
		  Thread.sleep(15000);
		  js.executeScript("window.scrollBy(0,600)", "");
		  
		  Pattern demo = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\gorki\\demo2.png");
		  screen.wait(demo,40000);
		  screen.click(demo);
		  
		  Pattern volume = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\gorki\\sound3.png");
		  screen.wait(volume,5000);
		  screen.click(volume);
		  
		  Pattern ok1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\gorki\\ok4.png");
		  screen.wait(ok1,5000);
		  Thread.sleep(2000);
		  screen.click(ok1);
		  
		  Pattern switch1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\gorki\\switch5.png");
		  screen.wait(switch1,5000);
		  screen.click(switch1);
		  Thread.sleep(3000);
		  
		  Pattern reduce = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\gorki\\reduce6.png");
		  screen.wait(reduce,5000);
		  screen.click(reduce);
		  Thread.sleep(3000);
		  
		  Pattern play = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\gorki\\place7.png");
		  screen.wait(play,5000);
		  screen.click(play);
		  
		  Pattern option = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\gorki\\option8.png");
		  screen.wait(option,5000);
		  screen.click(option);
		  
		  Pattern ok = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\gorki\\ok9.png");
		  screen.wait(ok,5000);
		  screen.click(ok);
		  		  
		  Pattern auto = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\gorki\\auto10.png");
		  screen.wait(auto,5000);
		  screen.click(auto);
		  
		  Pattern play2 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\gorki\\place11.png");
		  screen.wait(play2,5000);
		  Thread.sleep(3000);

		  Pattern home = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\gorki\\home12.png");
		  screen.wait(home,5000);
		  screen.click(home);
			  js.executeScript("window.scrollBy(0,0)", "");
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
//		  Pattern diamond = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\emotki\\image1.png");
//		  screen.wait(diamond,40000);
//		  screen.click(diamond);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[18]/img")).click();
		  
		  Thread.sleep(15000);
		  js.executeScript("window.scrollBy(0,600)", "");
		  
		  Pattern demo = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\emotki\\demo2.png");
		  screen.wait(demo,40000);
		  screen.click(demo);
		  
		  Pattern volume = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\emotki\\sound3.png");
		  screen.wait(volume,5000);
		  screen.click(volume);
		  
		  Pattern ok1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\emotki\\ok4.png");
		  screen.wait(ok1,5000);
		  Thread.sleep(2000);
		  screen.click(ok1);
		  
		  Pattern switch1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\emotki\\switch5.png");
		  screen.wait(switch1,5000);
		  screen.click(switch1);
		  Thread.sleep(3000);
		  
		  Pattern reduce = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\emotki\\reduce6.png");
		  screen.wait(reduce,5000);
		  screen.click(reduce);
		  Thread.sleep(3000);
		  
		  Pattern play = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\emotki\\place7.png");
		  screen.wait(play,5000);
		  screen.click(play);
		  		  
		  Pattern auto = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\emotki\\auto8.png");
		  screen.wait(auto,40000);
		  screen.click(auto);
		  
		  Pattern play2 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\emotki\\place9.png");
		  screen.wait(play2,5000);
		  Thread.sleep(3000);

		  Pattern home = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\emotki\\home10.png");
		  screen.wait(home,5000);
		  screen.click(home);
			  js.executeScript("window.scrollBy(0,0)", "");
	  }
	  @Test()
	  public void Hotpepperpayout() throws InterruptedException, FindFailed {
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
		  Thread.sleep(5000);
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,200)", "");
		  
		  Screen screen = new Screen();
//		  Pattern diamond = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\hotPepperPayout\\image1.png");
//		  screen.wait(diamond,40000);
//		  screen.click(diamond);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/a[20]/img")).click();
		  
		  Thread.sleep(15000);
		  js.executeScript("window.scrollBy(0,600)", "");
		  
		  Pattern demo = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\hotPepperPayout\\demo2.png");
		  screen.wait(demo,40000);
		  screen.click(demo);
		  
		  Pattern volume = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\hotPepperPayout\\sound3.png");
		  screen.wait(volume,5000);
		  screen.click(volume);
		  
		  Pattern ok1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\hotPepperPayout\\ok4.png");
		  screen.wait(ok1,5000);
		  Thread.sleep(2000);
		  screen.click(ok1);
		  
		  Pattern switch1 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\hotPepperPayout\\switch5.png");
		  screen.wait(switch1,5000);
		  screen.click(switch1);
		  Thread.sleep(3000);
		  
		  Pattern reduce = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\hotPepperPayout\\reduce6.png");
		  screen.wait(reduce,5000);
		  screen.click(reduce);
		  Thread.sleep(3000);
		  
		  Pattern play = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\hotPepperPayout\\place7.png");
		  screen.wait(play,40000);
		  screen.click(play);
		  Thread.sleep(3000);
		  		  
		  Pattern auto = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\hotPepperPayout\\auto8.png");
		  screen.wait(auto,5000);
		  screen.click(auto);
		  
		  Pattern play2 = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\hotPepperPayout\\place9.png");
		  screen.wait(play2,5000);
		  Thread.sleep(15000);

		  Pattern home = new Pattern(absPath+"\\PolandGames\\zbuyGmaes\\hotPepperPayout\\home10.png");
		  screen.wait(home,5000);
		  screen.click(home);
			  js.executeScript("window.scrollBy(0,0)", "");
	  }
	  @Test
		
		 public void Kurki () throws InterruptedException, FindFailed {
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(5000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			 
			  Screen s3 = new Screen();
			  js.executeScript("window. scrollBy(500,500)");
			  Pattern frontpage = new Pattern(absPath+"\\PolandGames\\Grzmiąca Fortuna\\GF-Demo.png").similar(0.6);
			  s3.wait(frontpage,1000);
			  s3.click(frontpage,1000);		 
			  Pattern audio3 = new Pattern(absPath+"\\Polandlottery\\Kurki-audio.png").similar(0.6);
			  s3.wait(audio3,1000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern(absPath+"\\Polandlottery\\Kurki-ok.png").similar(0.6);
			  s3.wait(ok3,1000);
			  s3.click(ok3);
			  Pattern mtm = new Pattern(absPath+"\\Polandlottery\\Kurki-mtm.png").similar(0.6);
			  s3.wait(mtm,1000);
			  s3.click(mtm);
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
