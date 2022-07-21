package PLLottery;

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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PLRecon {
	
		public static WebDriver driver;
		static String filePath = "Rgsimages";
		static File file = new File(filePath);
		static String absPath = file.getAbsolutePath();
		/*
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
			/*Thread.sleep(2000);
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
			 }*/
		 @Test
		 public void recon() throws InterruptedException
		 {
			 driver= new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://admin-az3cust01.lab.wagerworks.com/ng/#/");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"uname1\"]")).sendKeys("super");
			 driver.findElement(By.xpath("//*[@id=\"pwd1\"]")).sendKeys("password");
			 driver.findElement(By.xpath("//*[@id=\"btnLogin\"]/span")).click();
			 Thread.sleep(10000);
			 driver.findElement(By.xpath("/html/body/app-root/app-home-page/div/ul/li[2]/div[1]/div/div/p-menu/div/ul/li[4]/a/span")).click();
		 }
		
		 
	
		 
  
}

		 
