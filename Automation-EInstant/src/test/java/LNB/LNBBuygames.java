package LNB;

import java.io.File;

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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LNBBuygames {
	static WebDriver driver;
	static String filePath = "Rgsimages";
	static File file = new File(filePath);
	static String absPath = file.getAbsolutePath();
	@BeforeTest
	public void beforetest() {
		/*WebDriverManager.edgedriver().setup();
		  EdgeOptions edgeOptions = new EdgeOptions();
		  String addproxy1 = "http://pac.hybrid-web.global.blackspider.com/proxy.pac?p=k293mrvrbh";
		  Proxy proxy1 = new Proxy();
		  proxy1.setHttpProxy(addproxy1);//http
		  proxy1.setSslProxy(addproxy1);//secure socket layer
		  edgeOptions.setCapability("proxy", proxy1);
		  driver = new EdgeDriver(edgeOptions);
		  driver.manage().window().maximize();
		  */
		 WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			String addproxy = "http://pac.hybrid-web.global.blackspider.com/proxy.pac?p=k293mrvrbh";
			Proxy proxy = new Proxy();
			proxy.setHttpProxy(addproxy);//http
			proxy.setSslProxy(addproxy);//secure socket layer
			chromeOptions.setCapability("proxy", proxy);
			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
		
		}
	 /*@Test
	  public void DerbyRun() throws FindFailed  {
		  driver.get("https://m-azsit01.lab.wagerworks.com/eInstant/index.html?nscode=LNB&countrycode=US&currencycode=EUR&securetoken=pippo&softwareid=300-2068-001&locale=fr_BE&language=fr_BE&skincode=17&presenttype=STD&wagerType=BUY&uniqueid=uniqueID_300-2068-001_BUY");
		  Screen s = new Screen();
		  Pattern cancel = new Pattern(absPath+"\\LNB\\DerbyRun\\cancel.png");
		  s.wait(cancel,40000);
		  s.click(cancel);
		  Pattern quickpick = new Pattern(absPath+"\\LNB\\DerbyRun\\QuickPick.png");
		  s.wait(quickpick,40000);
		  s.click(quickpick);
		  Pattern confirmer = new Pattern(absPath+"\\LNB\\DerbyRun\\Confirmer.png");
		  s.wait(confirmer,40000);
		  s.click(confirmer);
		  Pattern buy = new Pattern(absPath+"\\LNB\\DerbyRun\\Acheter.png");
		  //s.wait(buy,40000);
		 // s.click(buy);
		  Pattern autoplay = new Pattern(absPath+"\\LNB\\DerbyRun\\Autoplay.png").similar(0.4);
		  s.wait(autoplay,40000);
		  s.click(autoplay);
		  s.wait(buy,40000);
		   	  
	  }
  @Test
  public void Cleopatra() throws FindFailed  {
	  driver.get("https://m-azsit01.lab.wagerworks.com/eInstant/index.html?nscode=LNB&countrycode=US&currencycode=EUR&securetoken=pippo&softwareid=300-2063-001&locale=fr_BE&language=fr_BE&skincode=17&presenttype=STD&wagerType=BUY&uniqueid=uniqueID_300-2063-001_BUY");
	  Screen s = new Screen();
	  Pattern buy = new Pattern(absPath+"\\LNB\\Cleopatra\\Acheter.png");
	  s.wait(buy,40000);
	  s.click(buy);
	  Pattern autoplay = new Pattern(absPath+"\\LNB\\Cleopatra\\Autoplay.png");
	  s.wait(autoplay,40000);
	  s.click(autoplay);
	  s.wait(buy,40000);
	   
  }
  @Test
  public void PixiesOfTheForest() throws FindFailed  {
	  driver.get("https://m-azsit01.lab.wagerworks.com/eInstant/index.html?nscode=LNB&countrycode=US&currencycode=EUR&securetoken=pippo&softwareid=300-2085-002&locale=fr_BE&language=fr_BE&skincode=17&presenttype=STD&wagerType=BUY&uniqueid=uniqueID_300-2085-002_BUY");
	  Screen s = new Screen();
	  Pattern inc = new Pattern(absPath+"\\LNB\\PixiesOfTheForest\\increase.png");
	  s.wait(inc,40000);
	  s.click(inc);
	  Pattern buy = new Pattern(absPath+"\\LNB\\PixiesOfTheForest\\Acheter.png").similar(0.4);
	  s.wait(buy,40000);
	  s.click(buy);
	  Pattern autoplay = new Pattern(absPath+"\\LNB\\PixiesOfTheForest\\AutoPlay.png");
	  s.wait(autoplay,40000);
	  s.click(autoplay);
	  s.wait(buy,40000);
	   
  }*/
	/*@Test
	  public void DisarmTheAlarm() throws FindFailed, InterruptedException  {
		  driver.get("https://m-azsit01.lab.wagerworks.com/eInstant/index.html?nscode=LNB&countrycode=US&currencycode=EUR&securetoken=pippo&softwareid=300-2103-001&locale=fr_BE&language=fr_BE&skincode=17&presenttype=STD&wagerType=BUY&uniqueid=uniqueID_300-2103-001_BUY");
		  Screen s = new Screen();
		  Pattern buy = new Pattern(absPath+"\\LNB\\DisarmTheAlarm\\Acheter.png").similar(0.7);
		  s.wait(buy,40000);
		  s.click(buy);
		  Pattern autoplay = new Pattern(absPath+"\\LNB\\DisarmTheAlarm\\AutoPlay.png").similar(0.7);
		  s.wait(autoplay,40000);
		  s.click(autoplay);
		 // Thread.sleep(2000);
		  //s.wait(buy,40000);
		  Pattern back = new Pattern(absPath+"\\LNB\\DisarmTheAlarm\\back.png");
		  s.wait(back,40000);
		   
	  }
	*/
	@Test
	  public void RainbowLoot() throws FindFailed, InterruptedException  {
		  driver.get("https://m-azsit01.lab.wagerworks.com/eInstant/index.html?nscode=LNB&countrycode=US&currencycode=EUR&securetoken=pippo&softwareid=300-2104-001&locale=fr_BE&language=fr_BE&skincode=17&presenttype=STD&wagerType=BUY&uniqueid=uniqueID_300-2104-001_BUY");
		  Thread.sleep(5000);
		  Screen s = new Screen();
		  Pattern ok = new Pattern(absPath+"\\LNB\\Rainbow\\ok.png").similar(0.6);
		  s.wait(ok,40000);
		  s.click(ok);
		  Pattern inc = new Pattern(absPath+"\\LNB\\Rainbow\\increase.png").similar(0.6);
		  s.wait(inc,40000);
		  s.click(inc);
		  Pattern buy = new Pattern(absPath+"\\LNB\\Rainbow\\Acheter.png").similar(0.5);
		  s.wait(buy,40000);
		  s.click(buy);
		  Pattern autoplay = new Pattern(absPath+"\\LNB\\Rainbow\\AutoPlay.png").similar(0.4);
		  s.wait(autoplay,40000);
		  s.click(autoplay);
		  Pattern ok1 = new Pattern(absPath+"\\LNB\\Rainbow\\ok-close.png").similar(0.6);
		  s.wait(ok1,40000);
		  s.click(ok1);
		 s.wait(buy,40000);
		  //Pattern back = new Pattern(absPath+"\\LNB\\DisarmTheAlarm\\back.png");
		  //s.wait(back,40000);
		 	  }
	@Test//need to run again
	  public void WheelOfTheFortune() throws FindFailed, InterruptedException  {
		  driver.get("https://m-azsit01.lab.wagerworks.com/eInstant/index.html?nscode=LNB&countrycode=US&currencycode=EUR&securetoken=pippo&softwareid=300-2110-001&locale=fr_BE&language=fr_BE&skincode=17&presenttype=STD&wagerType=BUY&uniqueid=uniqueID_300-2110-001_BUY");
		  Screen s = new Screen();
		  Pattern ok = new Pattern(absPath+"\\LNB\\WheelOfTheFortune\\Ok.png").similar(0.5);
		  s.wait(ok,40000);
		  s.click(ok);
		  Pattern inc = new Pattern(absPath+"\\LNB\\WheelOfTheFortune\\increase.png").similar(0.6);
		  s.wait(inc,40000);
		  s.click(inc);
		  Pattern buy = new Pattern(absPath+"\\LNB\\WheelOfTheFortune\\Buy.png").similar(0.5);
		  s.wait(buy,40000);
		  s.click(buy);
		  Pattern start = new Pattern(absPath+"\\LNB\\WheelOfTheFortune\\Start.png").similar(0.4);
		  s.wait(start,40000);
		  s.click(start);		  
		  Pattern autoplay = new Pattern(absPath+"\\LNB\\WheelOfTheFortune\\revealall.png").similar(0.4);
		  s.wait(autoplay,40000);
		  s.click(autoplay);
		  //Bonus play
		  if(s.exists(absPath+"\\LNB\\WheelOfTheFortune\\Spin.png")!= null){
				Pattern spin = new Pattern(absPath+"\\LNB\\WheelOfTheFortune\\Spin.png");
				Thread.sleep(2000);
				s.click(spin);
			}
		 Pattern playagain = new Pattern(absPath+"\\LNB\\WheelOfTheFortune\\Playagain.png");
		 s.wait(playagain,60000);
		 	  }
	@Test//not working
	public void TikiTacToe() throws FindFailed, InterruptedException
	{
		driver.get("https://m-azsit01.lab.wagerworks.com/eInstant/index.html?nscode=LNB&countrycode=US&currencycode=EUR&securetoken=pippo&softwareid=300-2142-001&locale=fr_BE&language=fr_BE&skincode=17&presenttype=STD&wagerType=BUY&uniqueid=kamatchi_300-2142-001_BUY");
		//Thread.sleep(10000);  
		Screen s = new Screen();
		Thread.sleep(10000);
		 // Pattern inc = new Pattern(absPath+"\\LNB\\TikiTacToe\\increase.png").similar(0.6);
		 // s.wait(inc,40000);
		 // s.click(inc);
		 // Pattern dec = new Pattern(absPath+"\\LNB\\TikiTacToe\\decrease.png");
		 // s.wait(dec,40000);
		 // s.click(dec);		  
		  Pattern buy = new Pattern(absPath+"\\LNB\\TikiTacToe\\Acheter.png").similar(0);
		  s.wait(buy,40000);
		  s.click(buy);
		  Pattern autoplay = new Pattern(absPath+"\\LNB\\TikiTacToe\\Jouer.png").similar(0.7);
		  s.wait(autoplay,40000);
		  s.click(autoplay);
		  s.click(buy);
	}
	@Test
	public void juciyloot() throws FindFailed, InterruptedException
	{
		driver.get("https://m-azsit01.lab.wagerworks.com/eInstant/index.html?nscode=LNB&countrycode=US&currencycode=EUR&securetoken=pippo&softwareid=300-2152-001&locale=fr_BE&language=fr_BE&skincode=17&presenttype=STD&wagerType=BUY&uniqueid=kamatchi_300-2152-001_BUY");
		//Thread.sleep(10000);  
		Screen s = new Screen();
		//Thread.sleep(10000);
		 Pattern ok= new Pattern(absPath+"\\LNB\\JuciyLoot\\ok.png").similar(0.8);
		  s.wait(ok,40000);
		  s.click(ok);
		  Pattern inc = new Pattern(absPath+"\\LNB\\JuciyLoot\\increase.png").similar(0.6);
		 s.wait(inc,40000);
		  s.click(inc);		  
		  Pattern buy = new Pattern(absPath+"\\LNB\\JuciyLoot\\Acheter.png").similar(0.5);
		  s.wait(buy,40000);
		  s.click(buy);
		  Pattern autoplay = new Pattern(absPath+"\\LNB\\JuciyLoot\\Autoplay.png").similar(0.5);
		  s.wait(autoplay,40000);
		  s.click(autoplay);
		  Pattern continuer = new Pattern(absPath+"\\LNB\\JuciyLoot\\continuer.png").similar(0.5);
		  s.wait(continuer,40000);
		  s.wait(continuer);
		  Pattern autoplay2 = new Pattern(absPath+"\\LNB\\JuciyLoot\\Autoplay2.png").similar(0.5);
		  s.wait(autoplay2,40000);
		  s.click(autoplay2);
		  s.wait(buy,400000);
		  
	}
	@Test
	public void Rubyseven() throws FindFailed, InterruptedException
	{
		driver.get("https://m-azsit01.lab.wagerworks.com/eInstant/index.html?nscode=LNB&countrycode=US&currencycode=EUR&securetoken=pippo&softwareid=300-2171-005&locale=fr_BE&language=fr_BE&skincode=17&presenttype=STD&wagerType=BUY&uniqueid=Kamatchi_300-2171-005_BUY");
		//Thread.sleep(10000);  
		Screen s = new Screen();
		//Thread.sleep(10000);
		
		  Pattern inc = new Pattern(absPath+"\\LNB\\Rubyseven\\increase.png").similar(0.3);
		  s.wait(inc,40000);
		  s.click(inc);		  
		  Pattern buy = new Pattern(absPath+"\\LNB\\Rubyseven\\Acheter.png").similar(0.5);
		  s.wait(buy,40000);
		  s.click(buy);
		  Pattern autoplay = new Pattern(absPath+"\\LNB\\Rubyseven\\Autoplay.png").similar(0.5);
		  s.wait(autoplay,40000);
		  s.click(autoplay);
		  if(s.exists(absPath+"\\LNB\\Rubyseven\\Spin.png")!= null)
		  {
				Pattern spin = new Pattern(absPath+"\\LNB\\Rubyseven\\Spin.png");
				Thread.sleep(2000);
				s.click(spin);
			}
		  Pattern ok= new Pattern(absPath+"\\LNB\\Rubyseven\\ok.png").similar(0.5);
		  s.wait(ok,40000);
		  s.click(ok);
		  s.wait(buy,400000);
		  
	}
	@Test//not working
	public void SpookyBoonanza () throws FindFailed, InterruptedException
	{
		driver.get("https://m-azsit01.lab.wagerworks.com/eInstant/index.html?nscode=LNB&countrycode=US&currencycode=EUR&securetoken=pippo&softwareid=300-2190-003&locale=fr_BE&language=fr_BE&skincode=17&presenttype=STD&wagerType=BUY&uniqueid=Kamatchi_300-2190-003_BUY");
		//Thread.sleep(10000);  
		Screen s = new Screen();
		//Thread.sleep(10000);
		
		  Pattern buy = new Pattern(absPath+"\\LNB\\Spookyboonaza\\Acheter.png").similar(0.5);
		  s.wait(buy,40000);
		  s.click(buy);		  
		  Pattern autoplay  = new Pattern(absPath+"\\LNB\\Spookyboonaza\\Autoplay.png").similar(0.5);
		  s.wait(autoplay,40000);
		  s.click(autoplay);
		  if(s.exists(absPath+"\\LNB\\Spookyboonaza\\okbonus.png")!= null)
		  {
			  Pattern ok= new Pattern(absPath+"\\LNB\\Spookyboonaza\\okbonus.png").similar(0.5);
			  s.wait(ok,40000);
			  s.click(ok);
			  Pattern autoplay2 = new Pattern(absPath+"\\LNB\\Rubyseven\\Autoplay.png").similar(0.5);
			  s.wait(autoplay2,40000);
			  s.click(autoplay2);
			}
		  s.wait(buy,400000);
		  
	}
		  @Test
		  
			public void Emoticollect () throws FindFailed, InterruptedException
			{
				driver.get("https://m-azsit01.lab.wagerworks.com/eInstant/index.html?nscode=LNB&countrycode=US&currencycode=EUR&securetoken=pippo&softwareid=300-2212-002&locale=fr_BE&language=fr_BE&skincode=17&presenttype=STD&wagerType=BUY&uniqueid=kamatchi_300-2212-002_BUY");
				//Thread.sleep(10000);  
				Screen s = new Screen();
				//Thread.sleep(10000);
				Pattern ok= new Pattern(absPath+"\\LNB\\Emoticollect\\ok.png").similar(0.5);
				  s.wait(ok,40000);
				  s.click(ok);
				  Pattern buy = new Pattern(absPath+"\\LNB\\Emoticollect\\Acheter.png").similar(0.5);
				  s.wait(buy,40000);
				  s.click(buy);		  
				  Pattern autoplay  = new Pattern(absPath+"\\LNB\\Emoticollect\\Autoplay.png");
				  s.wait(autoplay,40000);
				  s.click(autoplay);
				  s.wait(buy,400000);
			}
		  @Test
		  
			public void Bingointernational () throws FindFailed, InterruptedException
			{
		  
		  driver.get("https://m-azsit01.lab.wagerworks.com/eInstant/index.html?nscode=LNB&countrycode=US&currencycode=EUR&securetoken=pippo&softwareid=300-2101-002&locale=fr_BE&language=fr_BE&skincode=17&presenttype=STD&wagerType=BUY&uniqueid=uniqueID_300-2101-002_BUY");
		    //Thread.sleep(10000);  
			Screen s = new Screen();
			//Thread.sleep(10000);
			  Pattern ok= new Pattern(absPath+"\\LNB\\Bingointernational\\Fermerfp.png").similar(0.5);
			  s.wait(ok,40000);
			  s.click(ok);
			  Pattern buy = new Pattern(absPath+"\\LNB\\Bingointernational\\Acheter.png").similar(0.5);
			  s.wait(buy,40000);
			  s.click(buy);		  
			  Pattern autoplay  = new Pattern(absPath+"\\LNB\\Bingointernational\\Automatique.png").similar(0.5);
			  s.wait(autoplay,40000);
			  s.click(autoplay);
			  Pattern montecarlo  = new Pattern(absPath+"\\LNB\\Bingointernational\\montecarlo.png").similar(0.3);
			  s.wait(montecarlo,40000);
			  s.click(montecarlo);
			  Pattern autoplay1  = new Pattern(absPath+"\\LNB\\Bingointernational\\Autoplay.png").similar(0.5);
			  s.wait(autoplay1,40000);
			  s.click(autoplay1);
			  Pattern ok1= new Pattern(absPath+"\\LNB\\Bingointernational\\fermer.png").similar(0.5);
			  s.wait(ok1,40000);
			  s.click(ok1);
			  s.wait(buy,400000);
		}	
		  @Test
		  
			public void Gemstone () throws FindFailed, InterruptedException
			{
		  
		  driver.get("https://m-azsit01.lab.wagerworks.com/eInstant/index.html?nscode=LNB&countrycode=US&currencycode=EUR&securetoken=pippo&softwareid=300-2198-001&locale=fr_BE&language=fr_BE&skincode=17&presenttype=STD&wagerType=BUY&uniqueid=Kamatchi_300-2198-001_BUY");
		    //Thread.sleep(10000);  
			Screen s = new Screen();
			//Thread.sleep(10000);
			  Pattern ok= new Pattern(absPath+"\\LNB\\Gemstone\\ok.png").similar(0.5);
			  s.wait(ok,40000);
			  s.click(ok);
			  Pattern increase  = new Pattern(absPath+"\\LNB\\Gemstone\\increase.png").similar(0.6);
			  s.wait(increase,40000);
			  s.click(increase);
			  Pattern buy = new Pattern(absPath+"\\LNB\\Gemstone\\Acheter.png").similar(0.5);
			  s.wait(buy,40000);
			  s.click(buy);	
			  Pattern autoplay1  = new Pattern(absPath+"\\LNB\\Gemstone\\jouer.png").similar(0.6);
			  s.wait(autoplay1,40000);
			  s.click(autoplay1);
			  s.wait(buy,400000);
		}
		  @Test
		  
			public void fivecardpoker () throws FindFailed, InterruptedException
			{
		  
		  driver.get("https://m-azsit01.lab.wagerworks.com/eInstant/index.html?nscode=LNB&countrycode=US&currencycode=EUR&securetoken=pippo&softwareid=300-2207-006&locale=fr_BE&language=fr_BE&skincode=17&presenttype=STD&wagerType=BUY&uniqueid=Kamatchi_300-2207-006_BUY");
		    //Thread.sleep(10000);  
			Screen s = new Screen();
			//Thread.sleep(10000);
			Pattern increase  = new Pattern(absPath+"\\LNB\\5cardpoker\\increase.png").similar(0.6);
			  s.wait(increase,40000);
			  s.click(increase);
			  Pattern buy = new Pattern(absPath+"\\LNB\\5cardpoker\\Buy.png").similar(0.6);
			  s.wait(buy,40000);
			  s.click(buy);	
			  Pattern autoplay1  = new Pattern(absPath+"\\LNB\\5cardpoker\\revealall.png").similar(0.6);
			  s.wait(autoplay1,40000);
			  s.click(autoplay1);
			  s.wait(buy,400000);
		}
			

@AfterTest
public void aftertest()
{
driver.quit();	
}
}