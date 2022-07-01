package MockNativeSystem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Recon {
	static WebDriver driver;
	
@Test
	public static void recon() throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions Options = new ChromeOptions();
	Options.setExperimentalOption( "excludeSwitches" , new String[] {"automation"});
	driver = new ChromeDriver(Options);
	driver.manage().window().maximize();
    driver.get("https://rgs-cust03-admin.lab.wagerworks.com/ng/#/newlogin");
	driver.findElement(By.xpath("//*[@id=\"uname1\"]")).sendKeys("Santhis");
	driver.findElement(By.xpath("//*[@id=\"pwd1\"]")).sendKeys("Test123$");
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]/span")).click();
	Thread.sleep(5000);
	//Recon
	driver.findElement(By.xpath("//*[@id=\"sideMenuList\"]/div/div[6]/div[1]/a")).click();//operators
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"configureOperators\"]")).click();//configure operators
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"configure-view\"]/div[3]/p-table/div/div[1]/table/tbody/tr[3]/td[2]/span")).click();//GA SIT2
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"add-operator-view\"]/app-edit-operator/app-edit-skins-page/div[1]/span[1]/p-breadcrumb/div/ul/li[3]/a/span")).click();//ga lottery
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-9-label\"]")).click();//integration modes
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-9\"]/div/endpoint-intmodes-page/div/div[2]/p-table/div/div[1]/table/tbody/tr[3]/td[1]")).click();//mns-xt 
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//*[@id=\"outcomeData\"]/div[2]/div/div[4]/div[2]/input")).sendKeys("a");//host name
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"outcomeData\"]/div[4]/div/div[3]/div[4]/div[3]/a")).click();//validate and heart beat
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-18\"]/div/endpoint-intmodes-page/edit-endpoint/div/p-dialog/div/div[3]/p-footer/button[1]")).click();//save endpoint
	Thread.sleep(2000);
	}

}
