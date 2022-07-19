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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class buyexample{
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
			driver.findElement(By.xpath("//*[@id=\"username-dropdown-login\"]")).sendKeys("Mrosin50");
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
	
		
	 public void Gwiazdki () throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window. scrollBy(0,450)");
			  Screen s3 = new Screen();
			  Pattern frontpage = new Pattern(absPath+"\\Polandlottery\\Gwiazdki-fp.png").similar(0.6);
			  s3.wait(frontpage,10000);
			  s3.click(frontpage);
			  Thread.sleep(15000);
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
			  Pattern mtm = new Pattern(absPath+"\\Polandlottery\\Gwiazdki-mtm.png").similar(0.6);
			  s3.wait(mtm,10000);
			  s3.click(mtm);
			  Pattern t3 = new Pattern(absPath+"\\Polandlottery\\Gwiazdki-buy.png").similar(0.6);
			  s3.wait(t3,10000);
			  s3.click(t3);
			  Pattern ra3 = new Pattern(absPath+"\\Polandlottery\\Gwiazdki-autobtn.png").similar(0.6);
			  s3.wait(ra3,10000);
			  s3.doubleClick(ra3);
			  s3.click(t3);
			  Pattern home = new Pattern(absPath+"\\Polandlottery\\PolandlotteryNewImages\\ow-end.png").similar(0.6);
			  s3.wait(home,10000);
			  s3.click(home);
			  Pattern home3 = new Pattern(absPath+"\\Polandlottery\\Tot-try-home.png").similar(0.6);
			  s3.wait(home3,10000);
			  s3.click(home3);
			  js.executeScript("window.scrollBy(0,0)", "");
			 
		}
	 @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }
	 
	 
}