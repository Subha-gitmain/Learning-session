package com.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.POMClasses.Landing;
import com.properties.Config_properties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends Config_properties {

	public static WebDriver driver;
	 public Config_properties lib= new Config_properties();
	
	@BeforeClass
	public void configBC()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void configBF() throws Exception
	{
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(lib.getproperties("url"));
		System.out.println(" Url found");
		Thread.sleep(20);
		
		PageFactory.initElements(driver, Landing.class);
	}

	
	
	@AfterMethod
	public void configAM()
	{
		driver.close();
	}
	
	@AfterClass
	public void configAC()
	{
		driver.quit();
	}
}
