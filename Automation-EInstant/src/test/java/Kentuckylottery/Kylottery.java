package Kentuckylottery;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Kylottery {
	static WebDriver driver;
	static String filePath = "Rgsimages";
	static File file = new File(filePath);
	static String absPath = file.getAbsolutePath();
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
	}
	@Test
	public void Multiplythecash() throws FindFailed
	{
		driver.get("https://rgs-az1cust01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2134-006&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY99");
		Screen s = new Screen();
		Pattern info = new Pattern(absPath +"\\KYlottery\\Multiply thecash\\info.png").similar(0.4);
		s.wait(info,40000);
		s.click(info);
		Pattern audio = new Pattern(absPath +"\\KYlottery\\Multiply thecash\\audio.png").similar(0.4);
		s.wait(audio,40000);
		s.click(audio);
		Pattern ok = new Pattern(absPath +"\\KYlottery\\Multiply thecash\\ok.png").similar(0.4);
		s.wait(ok,40000);
		s.click(ok);
		Pattern decrease = new Pattern(absPath +"\\KYlottery\\Multiply thecash\\decrease.png").similar(0.4);
		s.wait(decrease,40000);
		s.click(decrease);
		Pattern t = new Pattern(absPath +"\\KYlottery\\Multiply thecash\\Try.png").similar(0.4);
		s.wait(t,40000);
		s.click(t);
		Pattern revealall = new Pattern(absPath +"\\KYlottery\\Multiply thecash\\revealall.png").similar(0.4);
		s.wait(revealall,40000);
		s.click(revealall);
		Pattern ta = new Pattern(absPath +"\\KYlottery\\Multiply thecash\\tryagain.png").similar(0.4);
		s.wait(ta,40000);
		
	}
	@Test
	public void Ruby7() throws FindFailed
	{
		driver.get("https://rgs-az1cust01.lab.wagerworks.com/skb/gateway?currencycode=USD&countrycode=US&locale=en_US&wagerType=TRY&language=en_EN&softwareid=300-2171-008&channel=INT&presenttype=STD&technology=HTML&nscode=KYLT&skincode=KY99");
		Screen s = new Screen();
		Pattern info = new Pattern(absPath +"\\KYlottery\\Ruby7\\info.png").similar(0.6);
		s.wait(info,40000);
		s.click(info);
		Pattern audio = new Pattern(absPath +"\\KYlottery\\Ruby7\\audio.png").similar(0.6);
		s.wait(audio,40000);
		s.click(audio);
		Pattern ok = new Pattern(absPath +"\\KYlottery\\Ruby7\\ok.png").similar(0.4);
		s.wait(ok,40000);
		s.click(ok);
		Pattern decrease = new Pattern(absPath +"\\KYlottery\\Ruby7\\decrease.png").similar(0.6);
		s.wait(decrease,40000);
		s.click(decrease);
		Pattern t = new Pattern(absPath +"\\KYlottery\\Ruby7\\Try.png").similar(0.4);
		s.wait(t,40000);
		s.click(t);
		Pattern revealall = new Pattern(absPath +"\\KYlottery\\Ruby7\\revealall.png").similar(0.4);
		s.wait(revealall,40000);
		s.click(revealall);
		Pattern ta = new Pattern(absPath +"\\KYlottery\\Ruby7\\tryagain.png").similar(0.4);
		s.wait(ta,40000);
		
	}
}
