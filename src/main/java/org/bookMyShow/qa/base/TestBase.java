package org.bookMyShow.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.bookMyShow.qa.util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static Actions ac;
	
	public TestBase() {
         prop=new Properties();
         try {
			FileInputStream ip = new FileInputStream("config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void initialization(){
	 String browserName	=prop.getProperty("browser");
	 if(browserName.equals("chrome")){
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 driver = new ChromeDriver();
	 }
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_wait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		driver.navigate().refresh();
		
		
	}
	
	
}
